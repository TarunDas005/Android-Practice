package com.example.bs151.employeeinformationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DBHandler dbHandler;
    EditText nameEditText,designationEditText,phoneEditText,emailEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHandler=new DBHandler(this);
        nameEditText= (EditText) findViewById(R.id.nameEditText);
        emailEditText= (EditText) findViewById(R.id.emailEditText);
        designationEditText= (EditText) findViewById(R.id.designationEditText);
        phoneEditText= (EditText) findViewById(R.id.phoneEditText);
    }

    public void AddButtonClick(View view)
    {
        String name=nameEditText.getText().toString();
        String email=emailEditText.getText().toString();
        String designation=designationEditText.getText().toString();
        String phone=phoneEditText.getText().toString();

        if(name.equals("")||designation.equals("")||email.equals("")||phone.equals("")){
            Toast.makeText(getApplicationContext(),"Can not be empty",Toast.LENGTH_LONG).show();
        }else{
            Person person=new Person(name,designation,email,phone);
            dbHandler.addEmployee(person);
            Toast.makeText(getApplicationContext(),"Add Successfully",Toast.LENGTH_LONG).show();
            nameEditText.setText("");
            emailEditText.setText("");
            designationEditText.setText("");
            phoneEditText.setText("");
        }

    }

    public void ViewButtonClick(View view){
//        ArrayList<Person> persons=new ArrayList<Person>();
//        persons=dbHandler.getAllEmployee();
//        for(Person person:persons){
//            String id=String.valueOf(person.getId());
//            String name=person.getName();
//            String designation=person.getDesignation();
//            String email=person.getEmail();
//            String phone=person.getPhone();
//            String all=id+" "+name+" "+designation+" "+email+" "+phone;
//            Toast.makeText(getApplicationContext(),all,Toast.LENGTH_LONG).show();
//        }
        Intent intent=new Intent(this,ViewActivity.class);
        startActivity(intent);
    }

    public void UpdateButtonClick(View view){
        Intent intent=new Intent(MainActivity.this,UpdateActivity.class);
        startActivity(intent);
    }
}
