package com.example.bs151.listviewwithbindview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.listview) ListView listView;
    //ListView listView;
    ArrayList<Person> persons;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //listView= (ListView) findViewById(R.id.listview);
        persons=new ArrayList<Person>();
        Person person1=new Person("Aronno","2012-1-60-005","CSE");
        Person person2=new Person("Jannat","12345","CSE");
        Person person3=new Person("Tarun","47856","EEE");
        Person person4=new Person("Borun","147852","ECE");
        Person person5=new Person("Kajol","2012-1-60-044","MATH");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        adapter=new CustomAdapter(getApplicationContext(),persons);
        listView.setAdapter(adapter);
    }
}
