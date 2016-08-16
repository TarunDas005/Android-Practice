package com.example.jannat.photofilter;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Drawable myFace;
    Bitmap bitmapImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.aronnoImageView);

        myFace=getResources().getDrawable(R.drawable.p);
        bitmapImage=((BitmapDrawable)myFace).getBitmap();
        Bitmap newPhoto=invertImage(bitmapImage);
        imageView.setImageBitmap(newPhoto);

        /*Drawable[] layers= new Drawable[2];
        layers[0]=getResources().getDrawable(R.drawable.frame);
        layers[1]=getResources().getDrawable(R.drawable.p);
        LayerDrawable layerDrawable=new LayerDrawable(layers);
        imageView.setImageDrawable(layerDrawable);
*/
        // save into device
        MediaStore.Images.Media.insertImage(getContentResolver(),newPhoto,"title","description");
    }

    public static Bitmap invertImage(Bitmap bitmapImage) {
        Bitmap finalImage=Bitmap.createBitmap(bitmapImage.getWidth(),bitmapImage.getHeight(),bitmapImage.getConfig());

        int A,R,G,B;
        int pixelColor;

        int height=bitmapImage.getHeight();
        int width=bitmapImage.getWidth();

        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                pixelColor=bitmapImage.getPixel(x, y);
                A= Color.alpha(pixelColor);
                R=255 - Color.red(pixelColor);
                G=255 - Color.green(pixelColor);
                B=255 - Color.blue(pixelColor);
                finalImage.setPixel(x,y,Color.argb(A,R,G,B));
            }
        }
        return finalImage;
    }

}
