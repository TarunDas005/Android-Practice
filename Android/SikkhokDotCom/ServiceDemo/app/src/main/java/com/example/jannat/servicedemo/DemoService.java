package com.example.jannat.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by JANNAT on 5/1/2016.
 */
public class DemoService extends Service {

    private Timer timer;
    private TimerTask task;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("DemoService","--------onCreate-----------");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("DemoService","--------onStartCommand-----------");
        if(timer==null){
            timer=new Timer();
            task=new TimerTask() {
                @Override
                public void run() {
                    Log.e("DemoService","Timer task is running");
                }
            };
            timer.schedule(task,1000,1000);
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("DemoService", "--------onDestroy-----------");
        timer.cancel();
        timer=null;
    }
}
