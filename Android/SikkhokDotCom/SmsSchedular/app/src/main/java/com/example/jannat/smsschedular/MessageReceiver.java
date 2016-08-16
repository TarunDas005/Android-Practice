package com.example.jannat.smsschedular;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by JANNAT on 4/29/2016.
 */
public class MessageReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, Intent intent) {

        SentNotification messageNotification=new SentNotification(context);
        String number=intent.getStringExtra("number");
        String message=intent.getStringExtra("message");
        String strSimSelected=intent.getStringExtra("selectedSim");
        int selectedSim=Integer.parseInt(strSimSelected);
        ArrayList<String> messageList = SmsManager.getDefault().divideMessage(message);
        if (messageList.size() > 1) {
            SimUtil.sendMultipartTextSMS(context, selectedSim, number, null, messageList, null, null);
        } else {
            SimUtil.sendSMS(context, selectedSim, number, null, message, null, null);
        }

        messageNotification.sentMessageNotification(number, message);

        /*SmsManager smsManager = SmsManager.getDefault();
        String SENT = "SMS_SENT";
        String DELIVERED = "SMS_DELIVERED";

        SmsManager sms = SmsManager.getDefault();
        ArrayList<String> parts = sms.divideMessage(message);
        int messageCount = parts.size();
        ArrayList<PendingIntent> deliveryIntents = new ArrayList<PendingIntent>();
        ArrayList<PendingIntent> sentIntents = new ArrayList<PendingIntent>();

        PendingIntent sentPI = PendingIntent.getBroadcast(context, 0, new Intent(SENT), 0);
        PendingIntent deliveredPI = PendingIntent.getBroadcast(context, 0, new Intent(DELIVERED), 0);

        for (int j = 0; j < messageCount; j++) {
            sentIntents.add(sentPI);
            deliveryIntents.add(deliveredPI);
        }
        smsManager.sendTextMessage(number, null, message, sentPI, deliveredPI);*/
    }
}
