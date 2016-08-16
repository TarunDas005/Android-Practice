package com.example.jannat.personinformationapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class InformationShow extends AppCompatActivity {

    private ListView listView;
    PersonAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_show);
        ArrayList<Person> persons=(ArrayList<Person>)getIntent().getSerializableExtra("P");
        //Toast.makeText(getApplicationContext(),String.valueOf(persons.size()), Toast.LENGTH_SHORT).show();
        listView=(ListView)findViewById(R.id.list_view);
        adapter=new PersonAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        Person aPerson=new Person("First Name","Last Name","Email","Date Of Birth","Gender");
        adapter.add(aPerson);
        for(Person person:persons){
            adapter.add(person);
        }
    }

}
