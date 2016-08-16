package com.example.jannat.uicontrolsdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupClass extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group_class);
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
        radioGroup= (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.maleRadioButton:
                                Toast.makeText(getApplicationContext(), "Male is selected", Toast.LENGTH_LONG).show();
                                break;
                            case R.id.femaleRadioButton:
                                Toast.makeText(getApplicationContext(), "Female is selected", Toast.LENGTH_LONG).show();
                                break;
                            default:
                                break;
                        }
                    }
                }
        );
    }

    public void clickButton(View view){
        int checked=radioGroup.getCheckedRadioButtonId();
        switch (checked){
            case R.id.maleRadioButton:
                Toast.makeText(getApplicationContext(),"Male",Toast.LENGTH_LONG).show();
                break;
            case R.id.femaleRadioButton:
                Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_LONG).show();
                break;
            default:
                break;

        }
    }

}
