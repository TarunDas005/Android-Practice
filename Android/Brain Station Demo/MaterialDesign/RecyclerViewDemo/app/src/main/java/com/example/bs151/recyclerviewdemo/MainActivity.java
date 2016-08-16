package com.example.bs151.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<String> country=new ArrayList<String>();
    ArrayList<String> capital=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country.add("Afghanistan");
        country.add("Albania");
        country.add("Algeria");
        country.add("Andorra");
        country.add("Angola");
        country.add("Antigua and Barbuda");
        country.add("Argentina");
        country.add("Armenia");
        country.add("Australia");
        country.add("Austria");

        capital.add("Kabul");
        capital.add("Tirana");
        capital.add("Algiers");
        capital.add("Andorra la Vella");
        capital.add("Luanda");
        capital.add("St. John's");
        capital.add("Buenos Aires");
        capital.add("Yerevan");
        capital.add("Canberra");
        capital.add("Vienna");

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        adapter=new RecyclerAdapter(country,capital);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }
}
