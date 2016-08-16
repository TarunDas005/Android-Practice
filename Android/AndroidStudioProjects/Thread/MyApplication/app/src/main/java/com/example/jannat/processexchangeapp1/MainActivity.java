package com.example.jannat.processexchangeapp1;

import android.content.Context;
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.app1EditText);
        textView=(TextView)findViewById(R.id.app1TextView);
    }

    public void saveFile(View view){
        File file=null;
        String text1=editText.getText().toString();
        FileOutputStream fileOutputStream=null;
        try{
            file=getFilesDir();
            fileOutputStream=openFileOutput("aronno.txt", Context.MODE_PRIVATE);
            fileOutputStream.write(text1.getBytes());
            textView.setText(text1+"\nWritten to\n"+file.getAbsolutePath());
        }catch (FileNotFoundException e){
            textView.setText(e.toString());
        }catch (IOException e){
            textView.setText(e.toString());
        }
    }
}
