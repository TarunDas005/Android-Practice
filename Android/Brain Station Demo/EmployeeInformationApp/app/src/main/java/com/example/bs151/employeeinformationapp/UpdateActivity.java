package com.example.bs151.employeeinformationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class UpdateActivity extends AppCompatActivity {
    String sid;
    Button updateButton,cancelButton;
    EditText updateNameEditText,updateDesignationEditText,updateEmailEditText,updatePhoneEditText;
    Spinner spinner;
    DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        updateNameEditText= (EditText) findViewById(R.id.updateNameEditTExt);
        updateDesignationEditText= (EditText) findViewById(R.id.updateDesignationEditTExt);
        updateEmailEditText= (EditText) findViewById(R.id.updateEmailEditTExt);
        updatePhoneEditText= (EditText) findViewById(R.id.updatePhoneEditTExt);
        updateButton= (Button) findViewById(R.id.updateButton);
        cancelButton= (Button) findViewById(R.id.cancelButton);
        updateNameEditText.setVisibility(View.GONE);
        updateDesignationEditText.setVisibility(View.GONE);
        updateEmailEditText.setVisibility(View.GONE);
        updatePhoneEditText.setVisibility(View.GONE);
        updateButton.setVisibility(View.GONE);
        cancelButton.setVisibility(View.GONE);
        dbHandler=new DBHandler(UpdateActivity.this);
        ArrayList<String> allEmployeeId=new ArrayList<String>();
        final ArrayList<Person> persons=dbHandler.getAllEmployee();
        allEmployeeId.add("Select");
        for(Person person:persons){
            allEmployeeId.add(String.valueOf(person.getId()));
        }
        spinner= (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, allEmployeeId);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectId= (String) parent.getItemAtPosition(position);
                sid=selectId;
                if(selectId.charAt(0)=='S'){

                }else{
                    updateNameEditText.setVisibility(View.VISIBLE);
                    updateDesignationEditText.setVisibility(View.VISIBLE);
                    updateEmailEditText.setVisibility(View.VISIBLE);
                    updatePhoneEditText.setVisibility(View.VISIBLE);
                    updateButton.setVisibility(View.VISIBLE);
                    cancelButton.setVisibility(View.VISIBLE);
                    for (Person person:persons){
                        if (person.getId()==Integer.parseInt(selectId)){
                            String name=person.getName();
                            String designation=person.getDesignation();
                            String email=person.getEmail();
                            String phone=person.getPhone();
                            updateNameEditText.setText(name);
                            updateDesignationEditText.setText(designation);
                            updateEmailEditText.setText(email);
                            updatePhoneEditText.setText(phone);
                        }
                    }
                //    Toast.makeText(getApplicationContext(),selectId,Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void Update(View view){
        int id=Integer.parseInt(sid);
        String name=updateNameEditText.getText().toString();
        String designation=updateDesignationEditText.getText().toString();
        String email=updateEmailEditText.getText().toString();
        String phone=updatePhoneEditText.getText().toString();
        if(name.equals("")||designation.equals("")||email.equals("")||phone.equals("")){
            Toast.makeText(getApplicationContext(),"Can not be empty",Toast.LENGTH_LONG).show();
        }
        else{
            dbHandler.updateEmployee(id,name,designation,email,phone);
            updateNameEditText.setVisibility(View.GONE);
            updateDesignationEditText.setVisibility(View.GONE);
            updateEmailEditText.setVisibility(View.GONE);
            updatePhoneEditText.setVisibility(View.GONE);
            updateButton.setVisibility(View.GONE);
            cancelButton.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(),"Update Successfully",Toast.LENGTH_LONG).show();
        }

    }

    public void CancelClick(View view){
        Intent intent=new Intent(UpdateActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
