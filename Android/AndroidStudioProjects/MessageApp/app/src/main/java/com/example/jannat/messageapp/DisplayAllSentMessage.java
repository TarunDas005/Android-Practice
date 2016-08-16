package com.example.jannat.messageapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class DisplayAllSentMessage extends AppCompatActivity {


    MyDBHandler myDBHandler;
    private ListView listView;
    AllSentMessageAdapter allSentMessageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_all_sent_message);
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

        SharedPreferences sharedPreferences = getSharedPreferences("Receiver_number_info", Context.MODE_PRIVATE);
        String number=sharedPreferences.getString("receiver_number", "");
//        Toast.makeText(DisplayAllSentMessage.this, number, Toast.LENGTH_LONG).show();

        myDBHandler =new MyDBHandler(DisplayAllSentMessage.this,null,null,1);
        ArrayList<SmsSentInformation> smsSentInformations= myDBHandler.getAllSentInfo();
        listView=(ListView)findViewById(R.id.displayAllSentMessageListView);
        allSentMessageAdapter=new AllSentMessageAdapter(getApplicationContext(),R.layout.display_message);
        listView.setAdapter(allSentMessageAdapter);
        for(SmsSentInformation information: smsSentInformations){
            if(information.getReceiverNumber().equals(number)){
                allSentMessageAdapter.add(information);
            }
        }

    }

}





















