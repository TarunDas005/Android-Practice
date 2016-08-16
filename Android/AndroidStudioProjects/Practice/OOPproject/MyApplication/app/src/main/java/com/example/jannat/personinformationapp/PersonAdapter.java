package com.example.jannat.personinformationapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends ArrayAdapter {
    List list=new ArrayList();
    public PersonAdapter(Context context, int resource) {
        super(context, resource);
    }
    static class DataHandler
    {
        TextView firstName,lastName,email,dateOfBirth,gender;
    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();//return total number Of Object in this list
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row=convertView;
        DataHandler handler;
        if(convertView==null){
            LayoutInflater inflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= inflater.inflate(R.layout.row_layout,parent,false);
            handler=new DataHandler();
            handler.firstName=(TextView)row.findViewById(R.id.firstNameOfRowLayout);
            handler.lastName=(TextView)row.findViewById(R.id.lastNameOfRowLayout);
            handler.email=(TextView)row.findViewById(R.id.emailOfRowLayout);
            handler.dateOfBirth=(TextView)row.findViewById(R.id.dateOfRowLayout);
            handler.gender=(TextView)row.findViewById(R.id.genderOfRowLayout);
            row.setTag(handler);
        }
        else{
            handler=(DataHandler)row.getTag();
        }
        Person aPerson;
        aPerson=(Person)this.getItem(position);
        handler.firstName.setText(aPerson.getFirstName());
        handler.lastName.setText(aPerson.getLastName());
        handler.email.setText(aPerson.getEmail());
        handler.dateOfBirth.setText(aPerson.getDateOfBirth());
        handler.gender.setText(aPerson.getGender());
        return row;
    }

    public void ClearData(){
        list.clear();
    }
}
