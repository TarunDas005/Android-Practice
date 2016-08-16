package com.example.jannat.practiceondatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class EmployeeSearchActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    Spinner spinner;
    ArrayList<String> employeeName;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_search);
        spinner= (Spinner) findViewById(R.id.empSpinner);
        databaseHelper=DatabaseHelper.getInstance(getApplicationContext());
        employeeName=databaseHelper.getEmployeeName();
        adapter=new ArrayAdapter<String>(EmployeeSearchActivity.this,android.R.layout.simple_spinner_item,employeeName);
        spinner.setAdapter(adapter);

    }
}
