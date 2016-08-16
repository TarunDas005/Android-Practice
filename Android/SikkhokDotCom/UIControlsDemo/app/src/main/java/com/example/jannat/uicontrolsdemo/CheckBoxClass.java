package com.example.jannat.uicontrolsdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxClass extends AppCompatActivity {

    CheckBox rememberMeCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        rememberMeCheckBox =(CheckBox)findViewById(R.id.checkBox);
        rememberMeCheckBox.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(isChecked){
                            Toast.makeText(getApplicationContext(),"Checked",Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(getApplicationContext(),"not checked",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }

    public void login(View view){
        boolean flag=rememberMeCheckBox.isChecked();
        if(flag){
            Toast.makeText(getApplicationContext(),"I will remember you",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"I will not remember you",Toast.LENGTH_LONG).show();
        }
    }

}
