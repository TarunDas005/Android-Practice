package com.example.bs148.imagedemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.vr.sdk.widgets.pano.VrPanoramaEventListener;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class MainActivity extends AppCompatActivity {
    VrPanoramaView panoramaView;
    ImageView img_glide;
    private VrPanoramaView.Options panoOption=new VrPanoramaView.Options();
    String img_url = "http://api.androidhive.info/images/glide/medium/deadpool.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();


        panoramaView = (VrPanoramaView)findViewById(R.id.pano_view);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.brain);
        panoOption.inputType= VrPanoramaView.Options.TYPE_MONO;
        panoramaView.loadImageFromBitmap(bitmap,panoOption);
        img_glide = (ImageView)findViewById(R.id.img_glide);

        panoramaView.setEventListener(new VrPanoramaEventListener(){
            @Override
            public void onClick() {
                super.onClick();
                Toast.makeText(getApplicationContext(),"Hello", Toast.LENGTH_SHORT).show();
            }

        });
        Glide.with(this).load(R.mipmap.ic_launcher).centerCrop().into(img_glide);
    }

    @Override
    protected void onPause() {
        panoramaView.pauseRendering();
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        panoramaView.pauseRendering();
    }

    @Override
    protected void onDestroy() {
       // super.onDestroy();
       panoramaView.shutdown();
       super.onDestroy();
    }
}
