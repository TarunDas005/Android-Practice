package com.example.jannat.currecyusingapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Currency> alltks;
    String bdtTk;
    public static final int SUCCESS = 1;
    public static final int FAILURE = 0;
    public static final String REQ_URL="http://www.apilayer.net/api/live?access_key=4076192a82a4a52bf70f2aca86389113&format=1";
    private ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    class RequestThread extends Thread{
        @Override
        public void run() {
            //String url=REQ_URL+"?category=mathmatics";
            StringRequest stringRequest = new StringRequest(REQ_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                JSONObject respObject = new JSONObject(response);
                                boolean success = respObject.getBoolean("success");
                                if (success == true) {
                                    //showJSON(response);
                                    ParseJSON pj = new ParseJSON(response);
                                    bdtTk=pj.parseJSON();
                                    handler.sendEmptyMessage(SUCCESS);
                                }else {
                                    handler.sendEmptyMessage(FAILURE);
                                }

                            }catch (JSONException e){
                                handler.sendEmptyMessage(FAILURE);
                            }

                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                            handler.sendEmptyMessage(FAILURE);
                        }
                    });

            RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
            requestQueue.add(stringRequest);
        }
    }

    /*private void showJSON(String json){
        ParseJSON pj = new ParseJSON(json);
        ArrayList<Book> books=pj.parseJSON();
        Toast.makeText(getApplicationContext(),""+books.size(),Toast.LENGTH_LONG).show();
        //CustomList cl = new CustomList(this, ParseJSON.ids,ParseJSON.names,ParseJSON.emails);
        //listView.setAdapter(cl);


    }*/

    public void viewButtonClick(View view){
        if(isNetworkAvailable()){
            pd = ProgressDialog.show(this, "", "Fetching data..", false, true);
            RequestThread thread = new RequestThread();
            thread.start();
            /*StringRequest stringRequest = new StringRequest(REQ_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            showJSON(response);
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_LONG).show();
                        }
                    });

            RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
            requestQueue.add(stringRequest);
            */

        }
    }


    Handler handler=new Handler() {
        @Override
        public void handleMessage(Message msg) {
            pd.dismiss();
            switch (msg.what) {
                case SUCCESS:
                    if (!bdtTk.equals("")) {
                        Toast.makeText(getApplicationContext(), bdtTk,
                                Toast.LENGTH_LONG).show();
                    }
                    break;
                case FAILURE:
                    Toast.makeText(getApplicationContext(), "Books not found",
                            Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
        }
    };
    public boolean isNetworkAvailable(){
        ConnectivityManager cManager= (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=cManager.getActiveNetworkInfo();
        if(networkInfo!=null){
            if(networkInfo.isAvailable() && networkInfo.isConnected()){
                return true;
            }
        }
        return false;
    }
}
