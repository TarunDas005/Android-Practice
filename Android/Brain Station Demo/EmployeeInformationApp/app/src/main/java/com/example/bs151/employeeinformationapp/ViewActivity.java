package com.example.bs151.employeeinformationapp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {
    DBHandler dbHandler;
    ListView listView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        dbHandler=new DBHandler(ViewActivity.this);
        listView= (ListView) findViewById(R.id.listView);
        ArrayList<Person> persons=new ArrayList<Person>();
        persons=dbHandler.getAllEmployee();
        adapter=new CustomAdapter(this,persons);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, final View view, int position, long id) {
                final Dialog dialog = new Dialog(ViewActivity.this);
                dialog.setContentView(R.layout.dialog_demo);
                dialog.setTitle("Title...");
                TextView deleteTextView = (TextView) dialog.findViewById(R.id.deleteTextView);
                TextView cancelTextView = (TextView) dialog.findViewById(R.id.cancelTextView);
                deleteTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView idTextView= (TextView) view.findViewById(R.id.idTextView);
                        int id=Integer.parseInt(idTextView.getText().toString());
                        dbHandler.deleteEmployee(id);
                        update();
                        Toast.makeText(getApplicationContext(),"Delete Successfully",Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });
                cancelTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                return true;
            }
        });
    }

    public void update(){

        ArrayList<Person> persons=new ArrayList<Person>();
        persons.clear();
        persons=dbHandler.getAllEmployee();
        adapter=new CustomAdapter(this,persons);
        listView.setAdapter(adapter);
    }
}
