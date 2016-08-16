package com.example.bs151.fragmentactivitycommunication;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements ColorFragment.OnColorChangedListner {
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentContainer, new ColorFragment());
        transaction.commit();
    }

    @Override
    public void colorChanged(String colorName) {
        if (colorName.equals("RED"))
            linearLayout.setBackgroundColor(Color.RED);
        else if (colorName.equals("BLUE"))
            linearLayout.setBackgroundColor(Color.BLUE);
        else if (colorName.equals("GREEN"))
            linearLayout.setBackgroundColor(Color.GREEN);
    }
}
