package com.example.jannat.messageapp;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyDBHandler myDBHandler;
    private ListView listView;
    AllSingleMessageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        myDBHandler =new MyDBHandler(MainActivity.this,null,null,1);
        ShowAllMessage();
    }

    public void ShowAllMessage(){
        ArrayList<AllMessage> messages=myDBHandler.getAllSingleInfo();
        listView=(ListView)findViewById(R.id.mainListView);
        adapter=new AllSingleMessageAdapter(getApplicationContext(),R.layout.message_list,messages);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        TextView numberTextView=(TextView)view.findViewById(R.id.personNameTextView);
                        String number=numberTextView.getText().toString();
                        //Toast.makeText(ShowSingleSentMessage.this,number,Toast.LENGTH_LONG).show();
                        SharedPreferences sharedPreferences = getSharedPreferences("select_number_info", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor=sharedPreferences.edit();
                        editor.putString("select_number",number);
                        editor.apply();
                        Intent intent = new Intent(MainActivity.this, DisplaySentReceiveMessage.class);
                        startActivity(intent);
                    }
                }
        );

        /*listView.setOnItemLongClickListener(
                new AdapterView.OnItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                        TextView numberTextView = (TextView) view.findViewById(R.id.personNameTextView);
                        final String number = numberTextView.getText().toString();

                        final Dialog dialog = new Dialog(ShowSingleSentMessage.this);
                        dialog.setTitle("Custom Dialog");
                        dialog.setContentView(R.layout.custom_dialog);
                        dialog.show();

                        TextView deleteMessage = (TextView) dialog.findViewById(R.id.deleteMessageTextView);
                        TextView cancelMessage = (TextView) dialog.findViewById(R.id.cancelTextView);

                        deleteMessage.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDBHandler.deleteMessageByReceiverNumber(number);
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
        );*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_write:
                startActivity(new Intent(this,WritingMessage.class));
                return true;
            case R.id.menu_sent:
                startActivity(new Intent(this,ShowSingleSentMessage.class));
                return true;
            case R.id.menu_received:
                startActivity(new Intent(this,ShowSingleReceivedMessage.class));
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
    public void ShowInfo(View view){
        /*String dbString = myDBHandler.databaseToString();
        //Log.e("A",dbString);
        Toast.makeText(MainActivity.this,dbString,Toast.LENGTH_LONG).show();*/
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                }).setNegativeButton("No", null).show();
    }
}
