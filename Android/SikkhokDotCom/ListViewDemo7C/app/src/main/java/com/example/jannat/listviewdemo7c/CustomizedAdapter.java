package com.example.jannat.listviewdemo7c;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JANNAT on 4/27/2016.
 */
public class CustomizedAdapter extends ArrayAdapter<Employee> {

    Activity con;
    ArrayList<Employee> employeeList;

    public CustomizedAdapter(Context context , ArrayList<Employee> employees) {
        super(context, R.layout.list_item, employees);
        this.con=(Activity)context;
        this.employeeList=employees;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if(convertView==null){
            //getnerate a view
            LayoutInflater inflater=con.getLayoutInflater();
            v=inflater.inflate(R.layout.list_item,null);
            TextView txtName=(TextView)v.findViewById(R.id.txtName);
            TextView txtPhone=(TextView)v.findViewById(R.id.txtPhone);
            TextView txtEmail=(TextView)v.findViewById(R.id.txtEmail);
            TextView txtAddress=(TextView)v.findViewById(R.id.txtAddress);
            Employee employee=employeeList.get(position);
            txtName.setText(employee.getName());
            txtPhone.setText(employee.getPhone());
            txtEmail.setText(employee.getEmail());
            txtAddress.setText(employee.getAddress());

        }else{
            v=convertView;
        }

        return v;
    }
}
