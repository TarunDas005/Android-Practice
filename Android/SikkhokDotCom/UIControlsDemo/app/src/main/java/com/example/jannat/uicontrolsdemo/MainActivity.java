package com.example.jannat.uicontrolsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button addButton,subButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        addButton=(Button)findViewById(R.id.addButton);
        subButton=(Button)findViewById(R.id.subButton);
     //   addButton.setOnClickListener(this);
     //   subButton.setOnClickListener(this);

        /*One way
//        addButton.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(MainActivity.this,"Add Button Clicked",Toast.LENGTH_LONG).show();
//                    }
//                }
//        );
//
//        subButton.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(MainActivity.this,"Sub Button Clicked",Toast.LENGTH_LONG).show();
//                    }
//                }
//        );

        */
        /*2*/
        // addButton.setOnClickListener(listner);
    }

    public void ImageButtonClick(View v){
        Toast.makeText(MainActivity.this,"image Button Clicked",Toast.LENGTH_LONG).show();
    }

    public void SpinnerOpenActivity(View view){
        Intent intent=new Intent(this,SpinnerActivity.class);
        startActivity(intent);
    }

    public void AutoCompleteTextField(View view){
        Intent intent=new Intent(MainActivity.this,AutoCompleteTextField.class);
        startActivity(intent);
    }

    public void checkBox(View view){
        Intent intent=new Intent(MainActivity.this,CheckBoxClass.class);
        startActivity(intent);
    }

    public void radioButton(View view){
        Intent intent=new Intent(MainActivity.this,RadioGroupClass.class);
        startActivity(intent);
    }
    public void toggleButton(View view){
        Intent intent=new Intent(MainActivity.this,ToggleButtonActivity.class);
        startActivity(intent);
    }
    public void picker(View view){
        Intent intent=new Intent(MainActivity.this,DateTimePicker.class);
        startActivity(intent);
    }
        /*2
        View.OnClickListener listner=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Sub Button Clicked",Toast.LENGTH_LONG).show();
            }
        };
        */
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.addButton:
//                Toast.makeText(MainActivity.this,"Add Button Clicked",Toast.LENGTH_LONG).show();
//                break;
//            case R.id.subButton:
//                Toast.makeText(MainActivity.this,"Sub Button Clicked",Toast.LENGTH_LONG).show();
//                break;
//            default:
//                Toast.makeText(MainActivity.this,"Nothing",Toast.LENGTH_LONG).show();
//                break;
//        }
//    }
}
