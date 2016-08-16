package com.example.jannat.broadcastexample;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle=intent.getExtras();
        if(bundle!=null){
            Object[] pdus= (Object[]) bundle.get("pdu");
            for (int i=0;i<pdus.length;i++){
                SmsMessage smsMessage=SmsMessage.createFromPdu((byte[]) pdus[i]);
                String senderNumber=smsMessage.getOriginatingAddress();
                String senderMessage=smsMessage.getDisplayMessageBody();
                Toast.makeText(context,"From: "+senderNumber+"Message: "+senderMessage,Toast.LENGTH_LONG).show();
            }
        }

    }


}
