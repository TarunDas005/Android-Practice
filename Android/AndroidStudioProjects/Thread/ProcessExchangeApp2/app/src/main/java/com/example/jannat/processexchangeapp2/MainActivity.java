package com.example.jannat.processexchangeapp2;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    String packageName="com.example.jannat.processexchangeapp1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.app2EditText);
        textView=(TextView)findViewById(R.id.app2TextView);
    }

    public void loadFile(View view){
        PackageManager packageManager=getPackageManager();
        try {
            ApplicationInfo applicationInfo=packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA);
            String fullPath=applicationInfo.dataDir + "/files/aronno.txt";
            readFile(fullPath);
        } catch (PackageManager.NameNotFoundException e) {

        }
    }

    public void readFile(String fullPath){
        FileInputStream fileInputStream=null;
        try{
            fileInputStream=new FileInputStream(new File(fullPath));
            int read=-1;
            StringBuffer buffer=new StringBuffer();
            while((read=fileInputStream.read()) !=-1){
                buffer.append((char) read);
            }
            editText.setText(buffer);
            textView.setText(buffer+"\n was read from\n"+fullPath);
        }catch(FileNotFoundException e){
            textView.setText(e.toString());

        }catch (IOException e){
            textView.setText(e.toString());
        }finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }catch (IOException e){

            }
        }
    }
}
