package com.example.jannat.personinformationapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchInformation extends AppCompatActivity {
    ListView listView;
    PersonAdapter personAdapter;
    Spinner spinner;
    ArrayAdapter<String>adapter;
    ArrayList<String> emailString=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_information);
        final ArrayList<Person> persons=(ArrayList<Person>)getIntent().getSerializableExtra("P");
        emailString.add("Select Email");
        for(Person person:persons){
            emailString.add(person.getEmail());
        }
        //Toast.makeText(getApplicationContext(), String.valueOf(emailString.size()), Toast.LENGTH_SHORT).show();
        listView=(ListView)findViewById(R.id.search_list_view);
        personAdapter=new PersonAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(personAdapter);
        spinner=(Spinner)findViewById(R.id.spinner);
        adapter=new ArrayAdapter<String>(SearchInformation.this,android.R.layout.simple_spinner_item,emailString);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String email=(String)parent.getItemAtPosition(position);
                        personAdapter.ClearData();
                        personAdapter.notifyDataSetChanged();
                        //Toast.makeText(getBaseContext(),email,Toast.LENGTH_LONG).show();
                        //Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" Selected",Toast.LENGTH_LONG).show();
                        for (Person person:persons){
                            if(person.getEmail().equals(email)){
                                Person aPerson=new Person("First Name","Last Name","Email","Date Of Birth","Gender");
                                personAdapter.add(aPerson);
                                personAdapter.add(person);
                                break;
                            }
                        }

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
    }

}
