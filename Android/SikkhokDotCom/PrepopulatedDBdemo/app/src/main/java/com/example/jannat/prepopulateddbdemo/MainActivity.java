package com.example.jannat.prepopulateddbdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    PrepopulatedDBOpenHelper dbOpenHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        //dbOpenHelper=new PrepopulatedDBOpenHelper(getApplicationContext());
        dbOpenHelper=PrepopulatedDBOpenHelper.getInstance(getApplicationContext());
    }

    public void show(View view){
        ArrayList<Employee> employees=dbOpenHelper.getAllEmployess();
        if(employees!=null && employees.size()>0){
            for(Employee employee:employees){
                Toast.makeText(getApplicationContext(), employee.toString(), Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getApplicationContext(),"No data found",Toast.LENGTH_SHORT).show();
        }
    }
}
