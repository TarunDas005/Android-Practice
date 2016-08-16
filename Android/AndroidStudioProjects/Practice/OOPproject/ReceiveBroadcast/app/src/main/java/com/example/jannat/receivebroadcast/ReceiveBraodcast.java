package com.example.jannat.receivebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceiveBraodcast extends BroadcastReceiver {
    public ReceiveBraodcast() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Broadcast has been received",Toast.LENGTH_LONG).show();
    }
}
