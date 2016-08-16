package com.example.jannat.smsschedular;

import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final int PHONE_NO=0;
    RadioGroup radioGroup;
    RadioButton radioButton1,radioButton2;
    ArrayList<PendingIntent> pendingIntents;
    DatabaseHelper databaseHelper;
    TimePicker timePicker;
    EditText etNumber,etMessage;
    ListView listView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pendingIntents=new ArrayList<PendingIntent>();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setVisibility(View.GONE);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.GONE);
        timePicker= (TimePicker) findViewById(R.id.timePicker);
        etNumber= (EditText) findViewById(R.id.numberTextField);
        etMessage= (EditText) findViewById(R.id.messageTextField);
        listView= (ListView) findViewById(R.id.listView);
        databaseHelper=DatabaseHelper.getInstance(getApplicationContext());
        showListView();
        radioGroup= (RadioGroup) findViewById(R.id.radioGroup);
        radioButton1=(RadioButton)findViewById(R.id.sim1Button);
        radioButton2=(RadioButton)findViewById(R.id.sim2Button);
        radioGroup.setVisibility(View.INVISIBLE);
        radioButton1.setVisibility(View.INVISIBLE);
        radioButton2.setVisibility(View.INVISIBLE);
        setSim();
        listView.setOnItemLongClickListener(
                new AdapterView.OnItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                        TextView numberTextView = (TextView) view.findViewById(R.id.customNumberTextView);
                        TextView messgaeTextView=(TextView) view.findViewById(R.id.customBodyTextView);
                        TextView timeTextView=(TextView)view.findViewById(R.id.customeTimeTextView);

                        final String number=numberTextView.getText().toString();
                        final String time=timeTextView.getText().toString();
                        final String msg=messgaeTextView.getText().toString();

                        final Dialog dialog = new Dialog(MainActivity.this);
                        dialog.setTitle("Custom Dialog");
                        dialog.setContentView(R.layout.custom_dialog);
                        dialog.show();

                        final TextView deleteMessage = (TextView) dialog.findViewById(R.id.deleteMessageTextView);
                        final TextView cancelMessage = (TextView) dialog.findViewById(R.id.cancelTextView);

                        deleteMessage.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int id=databaseHelper.getMessageIdByParticularInfo(number,msg,time);
                                        Intent alarmIntent=new Intent(MainActivity.this,MessageReceiver.class);
                                        AlarmManager alarmManager= (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                                        PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, id, alarmIntent, 0);
                                        /*PendingIntent pendingIntent = PendingIntent.getActivity(CellManageAddShowActivity.this,
                                                id, myIntent, PendingIntent.FLAG_UPDATE_CURRENT);*/
                                        pendingIntent.cancel();
                                        alarmManager.cancel(pendingIntent);
                                        deleteMessage.setTextColor(Color.GREEN);
                                        databaseHelper.deleteMessage(number, msg, time);
                                        showListView();
                                        Toast.makeText(MainActivity.this,"Deleted Successfully: "+id,Toast.LENGTH_LONG).show();
                                        dialog.cancel();
                                    }
                                }
                        );

                        cancelMessage.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        cancelMessage.setTextColor(Color.GREEN);
                                        dialog.cancel();
                                    }
                                }
                        );
                        return true;
                    }
                }
        );
    }

    public void setSim(){
        ArrayList<String>sim = new ArrayList<String>();
        List<SimInfo> simInfos=getSIMInfo(getApplicationContext());
        for(SimInfo simInfo: simInfos){
            if(simInfo.getSlot()==0 || simInfo.getSlot()==1){
                String simName=simInfo.getDisplay_name();
                sim.add(simName);
            }
                //Toast.makeText(getApplicationContext(),simInfo.toString(),Toast.LENGTH_LONG).show();
        }
        radioGroup.setVisibility(View.VISIBLE);
        if(sim.size()==1){
            radioButton1.setText(sim.get(0));
            radioButton1.setVisibility(View.VISIBLE);
        }else{
            radioButton1.setText(sim.get(0));
            radioButton2.setText(sim.get(1));
            radioButton1.setVisibility(View.VISIBLE);
            radioButton2.setVisibility(View.VISIBLE);
        }
    }
    public static List<SimInfo> getSIMInfo(Context context) {
        List<SimInfo> simInfoList = new ArrayList<>();
        Uri URI_TELEPHONY = Uri.parse("content://telephony/siminfo/");
        Cursor c = context.getContentResolver().query(URI_TELEPHONY, null, null, null, null);
        if (c.moveToFirst()) {
            do {
                int id = c.getInt(c.getColumnIndex("_id"));
                int slot = c.getInt(c.getColumnIndex("slot"));
                String display_name = c.getString(c.getColumnIndex("display_name"));
                String icc_id = c.getString(c.getColumnIndex("icc_id"));
                SimInfo simInfo = new SimInfo(id, display_name, icc_id, slot);
                Log.d("apipas_sim_info", simInfo.toString());
                simInfoList.add(simInfo);
            } while (c.moveToNext());
        }
        c.close();

        return simInfoList;
    }
    public void showListView(){
        ArrayList<MessageList> ls=databaseHelper.getAllMessages();
        if(ls.size()==0){
            listView.setAdapter(null);
        }
        if(ls!=null && ls.size()>0){
            adapter=new CustomAdapter(MainActivity.this,ls);
            listView.setAdapter(adapter);
        }
    }
    public void setClick(View view){
        int hour,minute;
        if (Build.VERSION.SDK_INT >= 23 ){
            hour=timePicker.getHour();
            minute=timePicker.getMinute();
        }

        else{
            hour=timePicker.getCurrentHour();
            minute=timePicker.getCurrentMinute();
        }
        boolean is24Hour=timePicker.is24HourView();
        String ampm="";
        if(is24Hour){

        }else{
            if(hour>=12){
                ampm="PM";
            }else{
                ampm="AM";
            }
        }
        String time=hour +" : "+minute+" "+ampm;
        String number=etNumber.getText().toString();
        String message=etMessage.getText().toString();
        int selecTedSim=checkRadioButton();
        if(number.equals("") ||message.equals("")){
            Toast.makeText(getApplicationContext(), "Please Enter Value" , Toast.LENGTH_LONG).show();
        }else{
            /*MessageList msg=new MessageList(number,message,time);
            databaseHelper.insertMessage(msg);
            showListView();
            Toast.makeText(getApplicationContext(),"Set successfully",Toast.LENGTH_LONG).show();
            int hourTosec=(hour)*60*60;
            int minToSec=minute*60;
            Calendar c = Calendar.getInstance();
            int Hr24=c.get(Calendar.HOUR_OF_DAY);
            int Min=c.get(Calendar.MINUTE);

            if((hour<=Hr24 && minute<Min)){
                hour=hour+24;
            }
            long totalTime=(long)((hour-Hr24)*60*60)+((minute-Min)*60);
            Toast.makeText(getApplicationContext(),""+totalTime,Toast.LENGTH_LONG).show();
            //long interval= (long) (System.currentTimeMillis()-(totaslSec*1000.0));
            Intent alarmIntent=new Intent(this,MessageReceiver.class);
            AlarmManager alarmManager= (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            alarmIntent.putExtra("number", number);
            alarmIntent.putExtra("message", message);
            alarmIntent.putExtra("selectedSim",String.valueOf(selecTedSim));
            alarmIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            databaseHelper.insertId();
            int id=databaseHelper.getId();
            Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_LONG).show();
            PendingIntent pendingIntent=PendingIntent.getBroadcast(this, id, alarmIntent, 0);
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+(totalTime*1000), pendingIntent);
            pendingIntents.add(pendingIntent);*/
            MessageList msg=new MessageList(number,message,time);
            databaseHelper.insertMessage(msg);
            showListView();
            Toast.makeText(getApplicationContext(),"Set successfully",Toast.LENGTH_LONG).show();
            int hourTosec=(hour)*60*60;
            int minToSec=minute*60;
            Calendar c = Calendar.getInstance();
            int Hr24=c.get(Calendar.HOUR_OF_DAY);
            int Min=c.get(Calendar.MINUTE);

            if((hour<Hr24)){
                hour=hour+24;
            }
           else  if((hour<=Hr24) && minute<Min)
                hour=hour+24;


            long totalTime=(long)((hour-Hr24)*60*60)+((minute-Min)*60);
            Toast.makeText(getApplicationContext(),""+totalTime,Toast.LENGTH_LONG).show();
            //long interval= (long) (System.currentTimeMillis()-(totaslSec*1000.0));
            Intent alarmIntent=new Intent(this,MessageReceiver.class);
            AlarmManager alarmManager= (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            alarmIntent.putExtra("number", number);
            alarmIntent.putExtra("message", message);
            alarmIntent.putExtra("selectedSim", String.valueOf(selecTedSim));
            alarmIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //databaseHelper.insertId();
            //int id=databaseHelper.getId();
            int id=databaseHelper.getMessageId();
            Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_LONG).show();
            PendingIntent pendingIntent=PendingIntent.getBroadcast(this, id, alarmIntent, 0);
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+(totalTime*1000), pendingIntent);
            pendingIntents.add(pendingIntent);
        }
    }

    public int checkRadioButton(){
        int checked=radioGroup.getCheckedRadioButtonId();
        switch (checked){
            case R.id.sim1Button:
                return 0;
            case R.id.sim2Button:
                return 1;
            default:
                return 0;
        }
    }

    public void GetPhoneNumberFromPHONE(View view){
        //Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(MainActivity.this,PhoneNumberSubActivity.class);
        startActivityForResult(intent, PHONE_NO);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==PHONE_NO){
            if(resultCode==RESULT_OK){
                String number=data.getStringExtra("number_from_list");
                etNumber.setText(number);
            }
            else{
                //Log.e("Mainactivity","Sub-Activity Canceled");
            }
        }
    }
}
