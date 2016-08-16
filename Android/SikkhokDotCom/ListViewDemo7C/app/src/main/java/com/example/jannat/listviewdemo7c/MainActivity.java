package com.example.jannat.listviewdemo7c;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etName,etEmail,etPhone,etAddress;
    ListView lvEmployee;
    DatabaseHelper databaseHelper;

    CustomizedAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName= (EditText) findViewById(R.id.etName);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etPhone= (EditText) findViewById(R.id.etPhone);
        etAddress= (EditText) findViewById(R.id.etAddress);
        lvEmployee= (ListView) findViewById(R.id.listView);
        databaseHelper=DatabaseHelper.getInstance(getApplicationContext());
    }

    public void save(View view){
        String name=etName.getText().toString();
        String email=etEmail.getText().toString();
        String phone=etPhone.getText().toString();
        String address=etAddress.getText().toString();

        Employee employee=new Employee(name,email,phone,address);
        //Toast.makeText(getApplicationContext(),employee.toString(),Toast.LENGTH_LONG).show();
        long inserted=databaseHelper.insertEmployee(employee);
        if(inserted>=0){
            Toast.makeText(getApplicationContext(),"Inserted successfully",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Insertion failed",Toast.LENGTH_LONG).show();
        }
    }

    public void show(View view){
        ArrayList<Employee> employees=databaseHelper.getAllEmployess();
        if(employees!=null && employees.size()>0) {
            adapter=new CustomizedAdapter(MainActivity.this,employees);
            lvEmployee.setAdapter(adapter);
        }

    }

}
