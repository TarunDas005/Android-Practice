package com.example.jannat.messageapp;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplaySentReceiveMessage extends AppCompatActivity {

    MyDBHandler myDBHandler;
    private ListView listView;
    AllMessageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sent_receive_message);
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


//        Toast.makeText(DisplayAllSentMessage.this, number, Toast.LENGTH_LONG).show();
        myDBHandler =new MyDBHandler(DisplaySentReceiveMessage.this,null,null,1);
        ShowMessage();
        listView.setOnItemLongClickListener(
                new AdapterView.OnItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                        SharedPreferences sharedPreferences = getSharedPreferences("select_number_info", Context.MODE_PRIVATE);
                        final String number = sharedPreferences.getString("select_number", "");

                        TextView numberTextView = (TextView) view.findViewById(R.id.messageTextView);
                        TextView timeTextView=(TextView)view.findViewById(R.id.timeTextView);

                        final String message=numberTextView.getText().toString();
                        final String time=timeTextView.getText().toString();

                        final Dialog dialog = new Dialog(DisplaySentReceiveMessage.this);
                        dialog.setTitle("Custom Dialog");
                        dialog.setContentView(R.layout.custom_dialog);
                        dialog.show();

                        TextView deleteMessage = (TextView) dialog.findViewById(R.id.deleteMessageTextView);
                        TextView cancelMessage = (TextView) dialog.findViewById(R.id.cancelTextView);

                        deleteMessage.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        //Toast.makeText(DisplaySentReceiveMessage.this,number+": "+message,Toast.LENGTH_LONG).show();
                                        myDBHandler.deleteMessageByNumberAndMessage(number,message,time);
                                        ShowMessage();
                                        dialog.cancel();
                                    }
                                }
                        );

                        cancelMessage.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        dialog.cancel();
                                    }
                                }
                        );
                        return true;
                    }
                }
        );
    }

    public void ShowMessage(){
        SharedPreferences sharedPreferences = getSharedPreferences("select_number_info", Context.MODE_PRIVATE);
        String number=sharedPreferences.getString("select_number", "");
        ArrayList<AllMessage> smsInformations= myDBHandler.getAllMessageInfo();
        //Toast.makeText(DisplaySentReceiveMessage.this, String.valueOf(smsInformations.size()), Toast.LENGTH_LONG).show();
        listView=(ListView)findViewById(R.id.allMessageListView);

        adapter=new AllMessageAdapter(getApplicationContext(),R.layout.main_left);

        for(AllMessage information: smsInformations){

            if(information.getReceiverNumber().equals(number) || information.getSenderNumber().equals(number)){
                if(information.getIdentifyTag().equals("S")){
                    adapter.add(information);
                    listView.setAdapter(adapter);
                }
                else{
                    adapter.add(information);
                    listView.setAdapter(adapter);
                }

            }
        }

    }

}
