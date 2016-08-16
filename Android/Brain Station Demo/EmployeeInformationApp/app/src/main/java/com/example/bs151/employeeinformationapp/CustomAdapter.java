package com.example.bs151.employeeinformationapp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BS151 on 7/18/2016.
 */
public class CustomAdapter extends ArrayAdapter<Person>{
    Activity con;
    ArrayList<Person> persons=new ArrayList<Person>();
    public CustomAdapter(Context context, ArrayList<Person> persons) {
        super(context, R.layout.raw_layout, persons);
        this.persons=persons;
        this.con=(Activity)context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=null;
        if(convertView==null){
            LayoutInflater inflater= con.getLayoutInflater();
            view=inflater.inflate(R.layout.raw_layout,null);
            TextView id= (TextView) view.findViewById(R.id.idTextView);
            TextView name= (TextView) view.findViewById(R.id.nameTextView);
            TextView designation= (TextView) view.findViewById(R.id.designationTextView);
            TextView email= (TextView) view.findViewById(R.id.emailTextView);
            TextView phone= (TextView) view.findViewById(R.id.phoneTextView);
            Person person=persons.get(position);
            id.setText(String.valueOf(person.getId()));
            name.setText(person.getName());
            designation.setText(person.getDesignation());
            email.setText(person.getEmail());
            phone.setText(person.getPhone());

        }else{
            view=convertView;
        }
        return view;
    }
}
