package com.example.bs151.percelabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText,idEditText,deptEditTExt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText= (EditText) findViewById(R.id.nameEditText);
        idEditText= (EditText) findViewById(R.id.idEditText);
        deptEditTExt= (EditText) findViewById(R.id.deptEditText);
    }

    public void submitButton(View view){
        String name=nameEditText.getText().toString();
        String id=idEditText.getText().toString();
        String dept=deptEditTExt.getText().toString();
        Person person=new Person(name,id,dept);
        Intent intent=new Intent(this,AnotherActivity.class);
        intent.putExtra("info",person);
        startActivity(intent);
    }
}
