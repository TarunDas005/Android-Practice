package com.example.jannat.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText password;
    TextView showText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     
        userName= (EditText) findViewById(R.id.userNameInput);
        password= (EditText) findViewById(R.id.passwordInput);
        showText= (TextView) findViewById(R.id.showText);
    }

    public void saveButtonClicked(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("username",userName.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.apply();

        Toast.makeText(MainActivity.this,"Saved Successfully!",Toast.LENGTH_LONG).show();
    }
    public void displayButtonClicked(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("username", "");
        String pw=sharedPreferences.getString("password","");
        showText.setText(name+" "+pw);

    }
}
