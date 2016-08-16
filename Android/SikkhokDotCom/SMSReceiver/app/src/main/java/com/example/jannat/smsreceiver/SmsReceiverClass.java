package com.example.jannat.smsreceiver;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by JANNAT on 4/29/2016.
 */
public class SmsReceiverClass extends BroadcastReceiver {
    MediaPlayer mySound;
    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(context, "Intent Received: "+intent.getAction(), Toast.LENGTH_LONG).show();
        if(intent.getAction().equalsIgnoreCase("android.provider.Telephony.SMS_RECEIVED")){
            Bundle bundle=intent.getExtras();
            SmsMessage[] chunks=null;
            String body="";
            String number="";
            if(bundle!=null){
                Object[] pdus= (Object[]) bundle.get("pdus");
                chunks=new SmsMessage[pdus.length];
                String format = intent.getStringExtra("format");
                for(int i=0;i<pdus.length;i++){
                    chunks[i]=SmsMessage.createFromPdu((byte[]) pdus[i],format);
                    body+=chunks[i].getMessageBody();
                    number=chunks[i].getOriginatingAddress();
                }

                Toast.makeText(context, "Number: "+number+"\nBody: "+body, Toast.LENGTH_LONG).show();
//                if(body.contains("play")){
//                    mySound=MediaPlayer.create(context,R.raw.mus);
//                    mySound.start();
//                }
                Intent i=new Intent(context,ReplyActivity.class);
                i.putExtra("number",number);
                i.putExtra("body",body);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }

        }

    }
}
