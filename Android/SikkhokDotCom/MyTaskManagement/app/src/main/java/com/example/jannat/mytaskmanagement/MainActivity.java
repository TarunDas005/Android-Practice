package com.example.jannat.mytaskmanagement;

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

    EditText etName,etEmail,etPhone,etAddress,etKeyword,etId,etNewName;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName= (EditText) findViewById(R.id.etName);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etPhone= (EditText) findViewById(R.id.etPhone);
        etAddress= (EditText) findViewById(R.id.etAddress);
        etKeyword= (EditText) findViewById(R.id.etKeyword);
        etId= (EditText) findViewById(R.id.etId);
        etNewName= (EditText) findViewById(R.id.etNewName);
        //databaseHelper=new DatabaseHelper(this);
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
        if(employees!=null && employees.size()>0){
            for(Employee employee:employees){
                Toast.makeText(getApplicationContext(),employee.toString(),Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getApplicationContext(),"No data found",Toast.LENGTH_SHORT).show();
        }
    }

    public void search(View view){
        String keyword=etKeyword.getText().toString();
        ArrayList<Employee> employees=databaseHelper.searchEmployee(keyword);
        if(employees!=null && employees.size()>0){
            for(Employee employee:employees){
                Toast.makeText(getApplicationContext(),employee.toString(),Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getApplicationContext(),"No data found",Toast.LENGTH_SHORT).show();
        }
    }

    public void update(View view){
        int id=Integer.parseInt(etId.getText().toString());
        String name=etNewName.getText().toString();
        int updated=databaseHelper.updateEmployeeName(id,name);
        if(updated>0)
            Toast.makeText(getApplicationContext(),updated+" rows affected",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(),"No data found",Toast.LENGTH_SHORT).show();
    }
}
