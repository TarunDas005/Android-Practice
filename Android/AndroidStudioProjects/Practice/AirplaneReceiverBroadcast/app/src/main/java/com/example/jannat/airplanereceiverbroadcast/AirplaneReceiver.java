package com.example.jannat.airplanereceiverbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by JANNAT on 3/25/2016.
 */
public class AirplaneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Hey bro, Airplane mode changed", Toast.LENGTH_SHORT).show();
    }
}
