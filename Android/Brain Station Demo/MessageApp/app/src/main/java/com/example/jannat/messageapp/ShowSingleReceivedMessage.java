package com.example.jannat.messageapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowSingleReceivedMessage extends AppCompatActivity {

    ArrayList<SmsReceiverInformation> smsReceiverInformations;
    private ListView listView;
    SingleReceivedMessageAdapter adapter;
    MyDBHandler myDBHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_single_received_message);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myDBHandler =new MyDBHandler(ShowSingleReceivedMessage.this,null,null,1);
        showListView();
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        TextView numberTextView=(TextView)view.findViewById(R.id.personNameTextView);
                        String number=numberTextView.getText().toString();
                        //Toast.makeText(ShowSingleSentMessage.this,number,Toast.LENGTH_LONG).show();
                        SharedPreferences sharedPreferences = getSharedPreferences("Sender_number_info", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor=sharedPreferences.edit();
                        editor.putString("sender_number",number);
                        editor.apply();
                        Intent intent = new Intent(ShowSingleReceivedMessage.this, DisplayAllReceiveMessage.class);
                        startActivity(intent);
                    }
                }
        );

        listView.setOnItemLongClickListener(
                new AdapterView.OnItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                        TextView numberTextView = (TextView) view.findViewById(R.id.personNameTextView);
                        final String number = numberTextView.getText().toString();

                        final Dialog dialog = new Dialog(ShowSingleReceivedMessage.this);
                        dialog.setTitle("Custom Dialog");
                        dialog.setContentView(R.layout.custom_dialog);
                        dialog.show();

                        TextView deleteMessage = (TextView) dialog.findViewById(R.id.deleteMessageTextView);
                        TextView cancelMessage = (TextView) dialog.findViewById(R.id.cancelTextView);

                        deleteMessage.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDBHandler.deleteMessageBySenderNumber(number);
                                        showListView();
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

    public void showListView(){
        smsReceiverInformations= myDBHandler.getSingleInfoForReceiving();
        listView=(ListView)findViewById(R.id.singleReceivedListView);
        adapter=new SingleReceivedMessageAdapter(ShowSingleReceivedMessage.this,R.layout.message_list,smsReceiverInformations);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                //NavUtils.navigateUpFromSameTask(this);
                Intent intent=new Intent(ShowSingleReceivedMessage.this,MainActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_writing_message, menu);
        return true;
    }


}
