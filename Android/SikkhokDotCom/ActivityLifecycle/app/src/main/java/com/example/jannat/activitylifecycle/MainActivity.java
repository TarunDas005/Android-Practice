package com.example.jannat.activitylifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameTextField,emailTextField,phoneTextField;
    private static final int PHONE_NO=0;


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

        nameTextField=(EditText)findViewById(R.id.nameTextField);
        emailTextField=(EditText)findViewById(R.id.emailTextField);
        phoneTextField=(EditText)findViewById(R.id.phoneTextField);

//        Log.d("MainActibity", "..............Create.............");
    }

    public void submit(View view){
        String name=nameTextField.getText().toString();
        String email=emailTextField.getText().toString();
        String phone=phoneTextField.getText().toString();

        Person person=new Person(email,name,phone);

        Intent intent=new Intent(this, AnotherActivity.class);
        intent.putExtra("person",person);
        startActivity(intent);
    }

    public void getNumber(View view){
        Intent intent=new Intent(this,PhoneNumberSubActivity.class);
        startActivityForResult(intent, PHONE_NO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==PHONE_NO){
            if(resultCode==RESULT_OK){
                String number=data.getStringExtra("number");
                phoneTextField.setText(number);
            }
            else{
                Log.e("Mainactivity","Sub-Activity Canceled");
            }
        }
    }

    public void call(View view){
        String number=phoneTextField.getText().toString();
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
        startActivity(intent);
    }

//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("MainActibity","..............Start.............");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("MainActibity", "..............OnResume.............");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("MainActibity", "..............OnPause.............");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("MainActibity", "..............OnRestart.............");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("MainActibity", "..............OnDestroy.............");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("MainActibity", "..............OnStop.............");
//    }
//
//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
//            setContentView(R.layout.landscape_mode);
//        }
//        else if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
//            setContentView(R.layout.activity_main);
//        }
//    }

}
