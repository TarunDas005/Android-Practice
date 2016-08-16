package com.example.jannat.smsreceiver;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ReplyActivity extends AppCompatActivity {
    String number,body;
    EditText etNumber,etBody,etReply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);
        etNumber= (EditText) findViewById(R.id.etNumber);
        etBody= (EditText) findViewById(R.id.etMessage);
        etReply= (EditText) findViewById(R.id.etReply);
        number=getIntent().getStringExtra("number");
        body=getIntent().getStringExtra("body");
        etNumber.setText(number);
        etBody.setText(body);
    }

    public void SendSms(View view){
        String replyStr=etReply.getText().toString();
        SmsManager manager=SmsManager.getDefault();
        manager.sendTextMessage(number,null,replyStr,null,null);
        Toast.makeText(getApplicationContext(),"Reply Sent",Toast.LENGTH_LONG).show();
    }
}
