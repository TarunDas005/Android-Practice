package com.example.jannat.informationdemoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
        //Log.e("Person_Infor",persons.get(0).getEmail()+"Size: "+persons.size());
        listView=(ListView)findViewById(R.id.list_view);
        adapter=new PersonAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        PersonDataProvider personDataProvider;
        personDataProvider=new PersonDataProvider("First Name","Last Name","Email","Date Of Birth","Gender");
        adapter.add(personDataProvider);
        for(Person person:persons){
            personDataProvider=new PersonDataProvider(person.getFirstName(),person.getLastName(),person.getEmail(),person.getDateOfBirth(),person.getGender());
            adapter.add(personDataProvider);
        }
    }


}
