package com.example.jannat.intentexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle appleData=getIntent().getExtras();
        if(appleData==null)
            return;

        String message=appleData.getString("appleMessage");

        TextView baconText=(TextView)findViewById(R.id.baconText);
        baconText.setText(message);

    }

}
