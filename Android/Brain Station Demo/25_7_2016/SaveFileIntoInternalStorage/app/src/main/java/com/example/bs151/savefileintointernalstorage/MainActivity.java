package com.example.bs151.savefileintointernalstorage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
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
        String fileName="helo_file";
        String message=writeMessageEditText.getText().toString();
        try {
            FileOutputStream fileOutputStream=openFileOutput(fileName,MODE_PRIVATE);
            fileOutputStream.write(message.getBytes());
            fileOutputStream.close();
            Toast.makeText(getApplicationContext(),"Message SAved",Toast.LENGTH_LONG).show();
            writeMessageEditText.setText("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readButtonClick(View view){
        String message;
        String fileName="helo_file";
        try {
            FileInputStream fileInputStream=openFileInput(fileName);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuffer buffer=new StringBuffer();
            while ((message=bufferedReader.readLine())!=null){
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
