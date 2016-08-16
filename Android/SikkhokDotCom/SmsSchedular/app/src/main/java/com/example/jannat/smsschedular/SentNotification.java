package com.example.jannat.smsschedular;

/**
 * Created by JANNAT on 4/8/2016.
 */
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

public class SentNotification {
    NotificationCompat.Builder notification;
    private static final int uniqId=6254;
    Context context;
    public SentNotification(Context context){
        this.context=context;
        notification=new NotificationCompat.Builder(context);
        notification.setAutoCancel(true);
    }

    public void sentMessageNotification(String number,String message){

        notification.setSmallIcon(R.drawable.notification_icon);
        notification.setTicker("Message Sent Successfully");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(number);
        notification.setContentText(message);

        notification.setSound(Uri.parse("android.resource://" + context.getPackageName() + "/" + R.raw.ringtone));
        notification.setDefaults(Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
        Intent intent = new Intent(context, MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager notificationManager=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(uniqId, notification.build());
    }


}
