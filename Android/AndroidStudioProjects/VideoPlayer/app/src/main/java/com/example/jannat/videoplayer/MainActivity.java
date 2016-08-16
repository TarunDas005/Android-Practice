package com.example.jannat.videoplayer;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView videoView=(VideoView)findViewById(R.id.aronnoVideoView);

        //String vedioLocation="android.resource://"+getPackageName()+"/"+R.raw.a;
        String vedioLocation="http://bffmedia.com/bigbunny.mp4";
        Uri uri=Uri.parse(vedioLocation);

        MediaController mediaController=new MediaController(MainActivity.this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }

}
