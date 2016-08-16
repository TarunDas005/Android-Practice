package com.example.bs151.listviewwithbindview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by BS151 on 7/25/2016.
 */
public class CustomAdapter extends ArrayAdapter<Person> {
    ArrayList<Person> persons;
    public CustomAdapter(Context context, ArrayList<Person> persons) {
        super(context, R.layout.raw_layout);
        this.persons=persons;
    }

    @Override
    public int getCount() {
        return this.persons.size();
    }

    @Override
    public Person getItem(int position) {
        return this.persons.get(position);
    }

    public static class DataHandler{
        @BindView(R.id.nameTextView) TextView nameTextView;
        @BindView(R.id.idTextView) TextView idTextView;
        @BindView(R.id.deptTextView) TextView deptTextView;
        public DataHandler(View view) {
            ButterKnife.bind(this, view);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view=convertView;
        DataHandler dataHandler;
        if(convertView==null){
            LayoutInflater inflater= (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.raw_layout,parent,false);
            dataHandler=new DataHandler(view);
            view.setTag(dataHandler);
        }else{
            dataHandler=(DataHandler) view.getTag();
        }
        Person person=(Person) this.getItem(position);
        dataHandler.nameTextView.setText(person.getName());
        dataHandler.idTextView.setText(person.getId());
        dataHandler.deptTextView.setText(person.getDepartment());
        return view;

    }
}
