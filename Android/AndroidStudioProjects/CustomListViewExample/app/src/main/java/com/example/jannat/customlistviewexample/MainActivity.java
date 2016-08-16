package com.example.jannat.customlistviewexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name={"Tarun","Pokkos","Jannat","Borun"};

        ListAdapter listAdapter=new CustomAdapter(this,name);
        ListView listView= (ListView) findViewById(R.id.aronnoListView);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectName= (String) parent.getItemAtPosition(position);
                        Toast.makeText(MainActivity.this,selectName,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
