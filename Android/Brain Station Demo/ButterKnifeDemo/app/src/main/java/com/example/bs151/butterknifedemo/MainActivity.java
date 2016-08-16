package com.example.bs151.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.name) TextView nameTextView;
    @BindView(R.id.id) TextView idTextView;
    @BindView(R.id.dep) TextView depTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        nameTextView.setText("Aronno");
        idTextView.setText("2012-1-60-005");
        depTextView.setText("CSE");
    }
}
