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

public class DisplayAllReceiveMessage extends AppCompatActivity {

    MyDBHandler myDBHandler;
    private ListView listView;
    AllReceiverMessageAdapter allReceiverMessageAdapterr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_all_receive_message);
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
        SharedPreferences sharedPreferences = getSharedPreferences("Sender_number_info", Context.MODE_PRIVATE);
        String number=sharedPreferences.getString("sender_number", "");
//        Toast.makeText(DisplayAllSentMessage.this, number, Toast.LENGTH_LONG).show();

        myDBHandler =new MyDBHandler(DisplayAllReceiveMessage.this,null,null,1);
        ArrayList<SmsReceiverInformation> smsReceiverInformations= myDBHandler.getAllReceiveInfo();
        listView=(ListView)findViewById(R.id.displayAllReceiveMessageListView);
        allReceiverMessageAdapterr=new AllReceiverMessageAdapter(getApplicationContext(),R.layout.display_message);
        listView.setAdapter(allReceiverMessageAdapterr);
        for(SmsReceiverInformation information: smsReceiverInformations){
            if(information.getSenderNumber().equals(number)){
                allReceiverMessageAdapterr.add(information);
            }
        }
    }

}
