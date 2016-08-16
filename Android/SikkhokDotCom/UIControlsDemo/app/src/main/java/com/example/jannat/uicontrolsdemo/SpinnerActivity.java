package com.example.jannat.uicontrolsdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    //data src
    //another way
    private String[] days;
    //private String[] days={"Saturday","Monday","Tuesday","Wednesday","Thursday","Friday"};
    //view
    private Spinner spinnerDayOfWeek;

    //adapter
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
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
        days=getResources().getStringArray(R.array.days_of_week);
        spinnerDayOfWeek=(Spinner)findViewById(R.id.spinnerDayOfWeek);
        adapter=new ArrayAdapter<String>(SpinnerActivity.this,android.R.layout.simple_spinner_item,days);
        spinnerDayOfWeek.setAdapter(adapter);

        spinnerDayOfWeek.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getApplicationContext(),"Item Position: "+position+" Item: "+days[position],Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
    }

    public void test(View view){
        int position=spinnerDayOfWeek.getSelectedItemPosition();
        Toast.makeText(getApplicationContext(),"Item Position: "+position+" Item: "+days[position],Toast.LENGTH_LONG).show();
    }

}
