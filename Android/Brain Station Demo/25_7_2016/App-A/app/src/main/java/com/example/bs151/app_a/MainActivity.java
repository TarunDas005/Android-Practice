package com.example.bs151.app_a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick1(View view){
        Intent intent=new Intent(MainActivity.this,ctivityOne.class);
        startActivity(intent);
    }
    public void buttonClick2(View view){
        Intent intent=new Intent(MainActivity.this,ActivityTwo.class);
        startActivity(intent);
    }
}
