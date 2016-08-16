package com.example.bs151.savefileintoexternalstorage;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    EditText writeMessageEditText;
    TextView readMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        writeMessageEditText= (EditText) findViewById(R.id.writeMessageEditText);
        readMessageTextView= (TextView) findViewById(R.id.readMessageTextView);
        readMessageTextView.setVisibility(View.GONE);
    }
    public void writeButtonClick(View view){
        String state=Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state)){
            File root= Environment.getExternalStorageDirectory();
            File dir=new File(root.getAbsolutePath()+"/MyAppDir");
            if(!dir.exists()){
                dir.mkdir();
            }
            File file=new File(dir,"MyMessage.txt");
            String mes=writeMessageEditText.getText().toString();
            try {
                FileOutputStream fileOutputStream=new FileOutputStream(file);
                fileOutputStream.write(mes.getBytes());
                fileOutputStream.close();
                writeMessageEditText.setText("");
                Toast.makeText(getApplicationContext(),"Message Saved",Toast.LENGTH_LONG).show();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            Toast.makeText(getApplicationContext(),"SD card not found",Toast.LENGTH_LONG).show();
        }

    }
    public void readButtonClick(View view){
        File root= Environment.getExternalStorageDirectory();
        File dir=new File(root.getAbsolutePath()+"/MyAppDir");
        File file=new File(dir,"MyMessage.txt");
        String message;
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader reader=new BufferedReader(inputStreamReader);
            StringBuffer buffer=new StringBuffer();
            while ((message=reader.readLine())!=null){
                buffer.append(message+"\n");
            }
            readMessageTextView.setText(buffer.toString());
            readMessageTextView.setVisibility(View.VISIBLE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
