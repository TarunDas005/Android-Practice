package com.example.bs151.playerinformationwithdifferentlayout;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    CustomTestAdapter adapter;
    ArrayList<Player> players;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listview);
        players=new ArrayList<Player>();
        createPlayerArrayList();
        adapter=new CustomTestAdapter(getApplicationContext(),players);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                ImageView imageView= (ImageView) view.findViewById(R.id.imageView);
                TextView nameTextView= (TextView) view.findViewById(R.id.nameTextView);
                TextView battingStyleTextView= (TextView) view.findViewById(R.id.battingStyleTextView);
                TextView bowlingStyleTextView= (TextView) view.findViewById(R.id.bowlingStyleTextView);
                TextView battingAverageT20TextView= (TextView) view.findViewById(R.id.battingAverageT20TextView);
                TextView bowlingAverageT20TextView= (TextView) view.findViewById(R.id.bowlingAverageT20TextView);
                TextView battingAverageODITextView= (TextView) view.findViewById(R.id.battingAverageODITextView);
                TextView bowlingAverageODITextView= (TextView) view.findViewById(R.id.bowlingAverageODITextView);
                TextView roleTextView= (TextView) view.findViewById(R.id.roleTextView);
                imageView.buildDrawingCache();
                Bitmap bitmap = imageView.getDrawingCache();

                String name= nameTextView.getText().toString();
                String battingStyle=battingStyleTextView.getText().toString();
                String bowlingStyle=bowlingStyleTextView.getText().toString();
                String batingAvgInT20=battingAverageT20TextView.getText().toString();
                String batingAvgInODI=battingAverageODITextView.getText().toString();
                String bowlingAvgInT20=bowlingAverageT20TextView.getText().toString();
                String bowlingAvgInODI=bowlingAverageODITextView.getText().toString();
                String role=roleTextView.getText().toString();
                Intent intent=new Intent(MainActivity.this,PlayerDetailsActivity.class);
                intent.putExtra("imageId",bitmap);
                intent.putExtra("name",name);
                intent.putExtra("battingStyle",battingStyle);
                intent.putExtra("bowlingStyle",bowlingStyle);
                intent.putExtra("batingAvgInT20",batingAvgInT20);
                intent.putExtra("batingAvgInODI",batingAvgInODI);
                intent.putExtra("bowlingAvgInT20",bowlingAvgInT20);
                intent.putExtra("bowlingAvgInODI",bowlingAvgInODI);
                intent.putExtra("role",role);
                startActivity(intent);
            }
        });
    }

    public void createPlayerArrayList(){
        try{
            JSONObject jsonObject=new JSONObject(loadJSONFromAsset());
            JSONArray jsonArray=(JSONArray) jsonObject.getJSONArray("info");
            for(int i=0;i<jsonArray.length();i++){
                JSONObject object= (JSONObject) jsonArray.get(i);
                String url=object.getString("url");
                int resourceImage = this.getResources().getIdentifier(url, "drawable", this.getPackageName());
                String name= object.getString("name");
                String battingStyle=object.getString("Batting_Style");
                String bowlingStyle=object.getString("Bowling_Style");
                double batingAvgInT20=object.getDouble("Batting_Average_T20");
                double batingAvgInODI=object.getDouble("Batting_Average_ODI");
                double bowlingAvgInT20=object.getDouble("Bowling_Average_T20");
                double bowlingAvgInODI=object.getDouble("Bowling_Average_ODI");
                String role=object.getString("role");
                Player player=new Player(resourceImage,name,battingStyle,bowlingStyle,batingAvgInT20,batingAvgInODI,bowlingAvgInT20,bowlingAvgInODI,role);
                players.add(player);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String loadJSONFromAsset(){
        String json=null;
        try{
            InputStream textInfo=getAssets().open("information.json");
            int size=textInfo.available();
            byte[] buffer=new byte[size];
            textInfo.read(buffer);
            textInfo.close();
            json=new String(buffer,"UTF-8");
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
        return json;
    }
}
