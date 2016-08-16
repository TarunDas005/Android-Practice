package com.example.jannat.multiplteventlistner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton=(Button)findViewById(R.id.clickButton);
        clickButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View V) {
                        EditText editText1 = (EditText) findViewById(R.id.editText1);
                        editText1.setText("Aronno");
                    }
                }
        );

        clickButton.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View V) {
                        EditText editText2 = (EditText) findViewById(R.id.editText2);
                        editText2.setText("EWU");
                        return true;
                    }
                }
        );

        Button resetButton=(Button)findViewById(R.id.resetButton);
        resetButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View V){
                        EditText editText1 = (EditText) findViewById(R.id.editText1);
                        EditText editText2 = (EditText) findViewById(R.id.editText2);
                        editText1.setText("");
                        editText2.setText("");
                    }
                }
        );
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
