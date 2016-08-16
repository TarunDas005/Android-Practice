package com.example.bs151.percelabledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    TextView nameTextView,idTextView,departmentTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        nameTextView= (TextView) findViewById(R.id.nameTextView);
        idTextView= (TextView) findViewById(R.id.idTextView);
        departmentTextView= (TextView) findViewById(R.id.deptTextView);

        Person person=getIntent().getExtras().getParcelable("info");
        nameTextView.setText(person.getName());
        idTextView.setText(person.getId());
        departmentTextView.setText(person.getDepartment());
    }
}
