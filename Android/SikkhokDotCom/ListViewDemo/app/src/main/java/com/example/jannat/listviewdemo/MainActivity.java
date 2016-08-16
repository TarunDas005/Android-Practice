package com.example.jannat.listviewdemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] os={"Ubuntu","Linux","Windows","Mac OSX","Android"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,os);
        adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.osTextView,os);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getApplicationContext(),"Position: "+position+" Name: "+l.getItemAtPosition(position),Toast.LENGTH_LONG).show();
    }
}
