package com.example.jannat.messageapp;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.telephony.SmsMessage;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by JANNAT on 4/6/2016.
 */
public class IncomingSms extends BroadcastReceiver {

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    public void onReceive(Context context, Intent intent) {
        MessageNotification messageNotification=new MessageNotification(context);


        SmsMessage[] messages;
        String number;
        String body="";
        Bundle bundle  = intent.getExtras();
        Object[] pdus = (Object[]) bundle.get("pdus");
        messages = new SmsMessage[pdus.length];
        for (int i = 0; i < pdus.length; i++)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                String format = bundle.getString("format");
                messages[i] = SmsMessage.createFromPdu((byte[]) pdus[i], format);
            }
            else {
                messages[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
            }
       //     messages[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
        }

        SmsMessage sms = messages[0];
        number=messages[0].getOriginatingAddress();
        try {
            if (messages.length == 1 || sms.isReplace()) {

                body = sms.getDisplayMessageBody();
            } else {
                StringBuilder bodyText = new StringBuilder();
                for (int i = 0; i < messages.length; i++) {
                    bodyText.append(messages[i].getMessageBody());
                }
                body = bodyText.toString();
            }
        } catch (Exception e) {

        }
        messageNotification.receiveMessageNotification(number,body);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        SmsReceiverInformation smsReceiverInformation=new SmsReceiverInformation();
        smsReceiverInformation.setSenderNumber(number);
        smsReceiverInformation.setSenderMessage(body);
        smsReceiverInformation.setReceivingTime(currentDateTimeString);
        MyDBHandler myDBHandler =new MyDBHandler(context,null,null,1);
        myDBHandler.addReceivingInfo(smsReceiverInformation);
        //Toast.makeText(context, number+": "+body, Toast.LENGTH_LONG).show();

    }



}
