package com.example.jannat.productdatabaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView myText;
    private MyDBHandler myDBHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.aronnoTextField);
        myText = (TextView) findViewById(R.id.showText);
        myDBHandler=new MyDBHandler(MainActivity.this,null,null,1);
        printDatabase();
    }

    private void printDatabase() {
        String dbString = myDBHandler.databaseToString();
        //Log.i("Aronno",dbString);
        myText.setText(dbString);
        editText.setText("");
    }

    public void addButtonClicked(View view){
        //myText.setText("POKKOS");
        Products product=new Products(editText.getText().toString());
        myDBHandler.addProduct(product);
        printDatabase();

    }
    public  void deleteButtonClicked(View view){
        String productName=editText.getText().toString();
        myDBHandler.deleteProduct(productName);
        printDatabase();
    }
}
