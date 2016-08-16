package com.example.jannat.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        textView= (TextView) findViewById(R.id.textView);
        Person person=(Person)getIntent().getSerializableExtra("person");
        textView.setText(person.toString());

//        textView= (TextView) findViewById(R.id.textView);
//        String name=getIntent().getStringExtra("value");
//        textView.setText(name);

    //    Log.d("AnotherActivity", "..............Create.............");
    }


//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("AnotherActivity", "..............Start.............");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("AnotherActivity", "..............OnResume.............");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("AnotherActivity", "..............OnPause.............");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("AnotherActivity", "..............OnRestart.............");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("AnotherActivity", "..............OnDestroy.............");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("AnotherActivity", "..............OnStop.............");
//    }


}
