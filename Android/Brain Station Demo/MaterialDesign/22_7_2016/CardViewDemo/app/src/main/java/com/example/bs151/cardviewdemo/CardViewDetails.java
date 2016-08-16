package com.example.bs151.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CardViewDetails extends AppCompatActivity {
    ImageView imageView;
    TextView nameTextView,roleTextView,phoneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_details);
        imageView= (ImageView) findViewById(R.id.detailsImageView);
        nameTextView= (TextView) findViewById(R.id.detailsNameTextView);
        roleTextView= (TextView) findViewById(R.id.detailsRoleTextView);
        phoneTextView= (TextView) findViewById(R.id.detailsPhoneTextView);

        PLayer pLayer= (PLayer) getIntent().getSerializableExtra("player");
        imageView.setImageResource(pLayer.getImageId());
        nameTextView.setText(pLayer.getName());
        roleTextView.setText(pLayer.getRole());
        phoneTextView.setText(pLayer.getPhone());
    }
}
