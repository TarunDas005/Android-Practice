package com.example.bs151.recyclerviewwithimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    int[] image_id={R.drawable.ashraful,R.drawable.mahmudullah,R.drawable.mashrafee,R.drawable.abuhider,R.drawable.arafatsunny,R.drawable.liton,R.drawable.mushfick,R.drawable.sabbir,R.drawable.sakib,R.drawable.taskin};
    String[] name_list,role_list;
    ArrayList<DataProvider> dataProviders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataProviders=new ArrayList<DataProvider>();
        name_list=getResources().getStringArray(R.array.player_name);
        role_list=getResources().getStringArray(R.array.player_role);
        int i=0;
        for (String name:name_list){
            DataProvider dataProvider=new DataProvider(image_id[i],name,role_list[i]);
            dataProviders.add(dataProvider);
            i++;
        }
        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        adapter=new RecyclerAdapter(dataProviders);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
