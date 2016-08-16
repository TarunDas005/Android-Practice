package com.example.jannat.uicontrolsdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class DateTimePicker extends AppCompatActivity {
    DatePicker datePicker;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picker);
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

        datePicker= (DatePicker) findViewById(R.id.datePicker);
        timePicker= (TimePicker) findViewById(R.id.timePicker);
    }

    public void checkDate(View view){
        int day=datePicker.getDayOfMonth();
        int month=datePicker.getMonth();
        int year=datePicker.getYear();
        Toast.makeText(getApplicationContext(),"Birth Date(dd/mm/yyyy): "+day+"/"+month+"/"+year,Toast.LENGTH_LONG).show();
    }
    public void checkTime(View view){
        int hour=timePicker.getCurrentHour();
        int minute=timePicker.getCurrentMinute();
        boolean is24Hour=timePicker.is24HourView();
        String ampm="";
        if(is24Hour){

        }else{
            if(hour>=12){
                ampm="PM";
            }else{
                ampm="AM";
            }
        }
        Toast.makeText(getApplicationContext(),"Time(hr/min): "+hour+" : "+minute+" "+ampm,Toast.LENGTH_LONG).show();
    }


}
