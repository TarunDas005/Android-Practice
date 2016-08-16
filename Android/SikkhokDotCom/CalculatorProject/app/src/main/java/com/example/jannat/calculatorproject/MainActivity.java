package com.example.jannat.calculatorproject;

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

    EditText number1Text,number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text=(EditText)findViewById(R.id.number1EditText);
        number2Text=(EditText)findViewById(R.id.number2EditText);
        resultText= (TextView) findViewById(R.id.resultTextView);
    }

    public void add(View v){
        String number1=number1Text.getText().toString();
        String number2=number2Text.getText().toString();

        if(number1.equals("") || number2.equals("")){
            Toast.makeText(getApplicationContext(),"Please Enter Both Number",Toast.LENGTH_LONG).show();
        }
        else{
            Double num1=Double.parseDouble(number1);
            Double num2=Double.parseDouble(number2);
            Double res=num1+num2;
            resultText.setText("Result: "+res);
        }

    }
    public void sub(View v){
        String number1=number1Text.getText().toString();
        String number2=number2Text.getText().toString();

        if(number1.equals("") || number2.equals("")){
            Toast.makeText(getApplicationContext(),"Please Enter Both Number",Toast.LENGTH_LONG).show();
        }
        else{
            Double num1=Double.parseDouble(number1);
            Double num2=Double.parseDouble(number2);
            Double res=num1-num2;
            resultText.setText("Result: "+res);
        }
    }
    public void mul(View v){
        String number1=number1Text.getText().toString();
        String number2=number2Text.getText().toString();

        if(number1.equals("") || number2.equals("")){
            Toast.makeText(getApplicationContext(),"Please Enter Both Number",Toast.LENGTH_LONG).show();
        }
        else{
            Double num1=Double.parseDouble(number1);
            Double num2=Double.parseDouble(number2);
            Double res=num1*num2;
            resultText.setText("Result: "+res);
        }
    }
    public void div(View v){
        String number1=number1Text.getText().toString();
        String number2=number2Text.getText().toString();

        if(number1.equals("") || number2.equals("")){
            Toast.makeText(getApplicationContext(),"Please Enter Both Number",Toast.LENGTH_LONG).show();
        }
        else{
            Double num1=Double.parseDouble(number1);
            Double num2=Double.parseDouble(number2);
            Double res=num1/+num2;
            resultText.setText("Result: "+res);
        }
    }
}
