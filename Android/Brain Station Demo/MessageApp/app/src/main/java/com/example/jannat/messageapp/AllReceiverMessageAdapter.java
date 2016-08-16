package com.example.jannat.messageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JANNAT on 4/8/2016.
 */
public class AllReceiverMessageAdapter extends ArrayAdapter {

    List list=new ArrayList();

    public AllReceiverMessageAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler
    {
        TextView displayMessage,displayTime;
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
            row= inflater.inflate(R.layout.display_message,parent,false);
            handler=new DataHandler();
            handler.displayMessage=(TextView)row.findViewById(R.id.displaySentMessageTextView);
            handler.displayTime=(TextView)row.findViewById(R.id.displayTimeTextView);
            row.setTag(handler);
        }
        else{
            handler=(DataHandler)row.getTag();
        }
        SmsReceiverInformation smsReceiverInformation;
        smsReceiverInformation=(SmsReceiverInformation)this.getItem(position);
        handler.displayMessage.setText(smsReceiverInformation.getSenderMessage());
        handler.displayTime.setText(smsReceiverInformation.getReceivingTime());
        return row;
    }

    public void ClearData(){
        list.clear();
    }
}
