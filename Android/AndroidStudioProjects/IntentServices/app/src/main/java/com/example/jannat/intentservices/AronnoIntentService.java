package com.example.jannat.intentservices;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class AronnoIntentService extends IntentService{

    String TAG="pokkos";

    public AronnoIntentService() {
        super("AronnoIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG,"Service running");
    }
}
