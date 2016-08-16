package com.example.jannat.listviewdemo7b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] os={"Ubuntu","Linux","Windows 7","Mac OSX","Android","Windows 8","Windows 98","Windows 2000","Windows XP"};
    ListView lv;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.listView);
        //adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,os);
        adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.osTextView,os);
        lv.setAdapter(adapter);

        /*lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getApplicationContext(),String.valueOf(parent.getItemAtPosition(position)) ,Toast.LENGTH_LONG).show();
                    }
                }
        );*/

        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),String.valueOf(parent.getItemAtPosition(position)) ,Toast.LENGTH_LONG).show();
    }

    /*AdapterView.OnItemClickListener listner=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getApplicationContext(),String.valueOf(parent.getItemAtPosition(position)) ,Toast.LENGTH_LONG).show();
        }
    };*/
}
