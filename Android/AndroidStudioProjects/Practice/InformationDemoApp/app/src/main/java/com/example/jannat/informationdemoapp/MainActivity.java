package com.example.jannat.informationdemoapp;


import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String firstName,lastName,email,dateOfBirth,gender;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private EditText firstNameText, lastNameText, emailText, dateOfBirthText;
    private ArrayList<Person> persons=new ArrayList<Person>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroupId);
        Button saveButton=(Button)findViewById(R.id.saveButton);
        saveButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int selectedId= radioGroup.getCheckedRadioButtonId();
                        radioButton=(RadioButton)findViewById(selectedId);
                        //Toast.makeText(getApplicationContext(),radioButton.getText(),Toast.LENGTH_SHORT).show();*/
                        firstNameText =(EditText)findViewById(R.id.firstNameTextField);
                        lastNameText =(EditText)findViewById(R.id.lastNameTextField);
                        emailText =(EditText)findViewById(R.id.emailTextField);
                        dateOfBirthText =(EditText)findViewById(R.id.dateTextField);
                        firstName=firstNameText.getText().toString();
                        lastName=lastNameText.getText().toString();
                        email=emailText.getText().toString();
                        dateOfBirth=dateOfBirthText.getText().toString();
                        gender=radioButton.getText().toString();
                        Person aPerson=new Person(firstName,lastName,email,dateOfBirth,gender);
                        boolean flag=addPerson(aPerson);
                        if(flag){
                            Toast.makeText(getApplicationContext(),"Email Already Added", Toast.LENGTH_SHORT).show();

                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Person Added Successfully", Toast.LENGTH_SHORT).show();
                            firstNameText.setText("");
                            lastNameText.setText("");
                            emailText.setText("");
                            dateOfBirthText.setText("");
                            radioGroup.clearCheck();
                        }
                    }
                }
        );

        Button showButton=(Button)findViewById(R.id.showButton);
        showButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,InformationShow.class);
                        //Log.e("Person",persons.get(0).getEmail());
                        intent.putExtra("P",persons);
                        startActivity(intent);
                    }
                }
        );
    }

    public boolean addPerson(Person aPerson){
        for(Person person:persons){
            if(person.getEmail().equals(aPerson.getEmail())){
                return true;
            }
        }
        persons.add(aPerson);
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
