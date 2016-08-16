package com.example.jannat.boundedservicedemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayerService mService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startPlayer(View view){
        //bind and start service
        Intent serviceIntent=new Intent(MainActivity.this,MediaPlayerService.class);
        bindService(serviceIntent,serviceConnection, Context.BIND_AUTO_CREATE);
    }


    private ServiceConnection serviceConnection=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder binder) {
            Log.e("MainActivity", "-------onServiceConnected--------");
            mService=((MediaPlayerService.MediaBinder)binder).getService();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e("MainActivity", "-------onServiceDisconnected--------");
            mService=null;
        }
    };
    public void play(View view){
        //play a song
        if(mService!=null){
            mService.play();
        }

    }
    public void pause(View view){
            // pause
        if(mService!=null){
            mService.pause();
        }
    }

    public void stop(View view){
        //stop and unbind service
        if(mService!=null){
            mService.stop();
        }
        unbindService(serviceConnection);
    }
}
