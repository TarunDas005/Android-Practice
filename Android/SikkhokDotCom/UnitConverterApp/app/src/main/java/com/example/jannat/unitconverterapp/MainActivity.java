package com.example.jannat.unitconverterapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private Spinner coversionTypeSpinner,fromSpinner,toSpinner;
    private EditText fromTextField,toTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        coversionTypeSpinner= (Spinner) findViewById(R.id.conversionTypeSpinner);
        fromSpinner= (Spinner) findViewById(R.id.fromSpinner);
        toSpinner= (Spinner) findViewById(R.id.toSpinner);
        fromTextField= (EditText) findViewById(R.id.fromTextField);
        toTextField= (EditText) findViewById(R.id.toTextField);
        ArrayList<String> list=new ArrayList<String>();
        list.add("Aronno");
        list.add("Jannat");
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,list);
        fromSpinner.setAdapter(new CustomAdapter(MainActivity.this,R.layout.spinner_design,list));

        fromSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if (view != null) {
                            TextView textView = (TextView) view.findViewById(R.id.spinnerTextView);
                            String name = (String) textView.getText().toString();
                            Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();

                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
    }

    public class CustomAdapter extends ArrayAdapter<String>{

        ArrayList<String> mLs;
        Context mContext;

        public CustomAdapter(Context context, int resource, ArrayList<String> list) {
            super(context, resource);
            mLs=list;
            mContext=context;
        }
        @Override
        public int getCount() {
            return mLs.size();//return total number Of Object in this list
        }

        @Override
        public String getItem(int position) {
            return mLs.get(position);
        }
        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater=getLayoutInflater();
            View mySpinnerView=inflater.inflate(R.layout.spinner_design, parent, false);

            TextView textView=(TextView)mySpinnerView.findViewById(R.id.spinnerTextView);
            String name=(String)mLs.get(position);
            textView.setText(name);
            return mySpinnerView;
        }
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
