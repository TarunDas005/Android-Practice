package com.example.jannat.messageapp;

/**
 * Created by JANNAT on 4/8/2016.
 */
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MessageNotification {
    NotificationCompat.Builder notification;
    private static final int uniqId=6254;
    Context context;
    public MessageNotification(Context context){
        this.context=context;
        notification=new NotificationCompat.Builder(context);
        notification.setAutoCancel(true);
    }

    public void receiveMessageNotification(String number,String message){

        notification.setSmallIcon(R.drawable.notification_icon);
        notification.setTicker("You have a new message");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(number);
        notification.setContentText(message);

        Intent intent=new Intent(context,MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager notificationManager=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(uniqId, notification.build());
    }


}
