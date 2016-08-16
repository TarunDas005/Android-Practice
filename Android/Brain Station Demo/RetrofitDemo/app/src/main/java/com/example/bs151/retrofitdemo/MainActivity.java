package com.example.bs151.retrofitdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bs151.retrofitdemo.Pojo.Example;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    EditText cityEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityEditText= (EditText) findViewById(R.id.cityEditText);
    }

    public void ShowButtonClick(View view){
        String url="http://api.openweathermap.org/data/2.5/weather?q=Dhaka,bd&appid=3a1cae12487f5125c2654c663938ec5f";
        RestAdapter radapter=new RestAdapter.Builder().setEndpoint(url).build();
        GetWeatherApi weatherApi=radapter.create(GetWeatherApi.class);
        weatherApi.getWeatherFromApi(new Callback<Example>() {
            @Override
            public void success(Example example, Response response) {
                Toast.makeText(getApplicationContext(),example.getCoord().getLon()+"",Toast.LENGTH_LONG).show();
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

}
