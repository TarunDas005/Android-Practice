package com.example.bs151.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    int[] image_id={R.drawable.ashraful,R.drawable.mahmudullah,R.drawable.mashrafee,R.drawable.abuhider,R.drawable.arafatsunny,R.drawable.liton,R.drawable.mushfick,R.drawable.sabbir,R.drawable.sakib,R.drawable.taskin};
    String[] names,roles,phones;
    ArrayList<PLayer> pLayers=new ArrayList<PLayer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        names=getResources().getStringArray(R.array.player_name);
        roles=getResources().getStringArray(R.array.player_role);
        phones=getResources().getStringArray(R.array.player_mobile);
        int i=0;
        for(String name:names){
            PLayer pLayer=new PLayer(image_id[i],name,roles[i],phones[i]);
            pLayers.add(pLayer);
            i++;
        }
        adapter=new RecyclerAdapter(pLayers,this);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
