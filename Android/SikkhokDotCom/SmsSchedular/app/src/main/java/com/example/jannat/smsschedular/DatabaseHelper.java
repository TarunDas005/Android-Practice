package com.example.jannat.smsschedular;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by JANNAT on 4/29/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    Context context;
    private static DatabaseHelper helper;

    private static final String DB_NAME="alarm_list";
    private static final int DB_VERSION=1;

    private static final String MESSAGE_TABLE="messagelist";
    private static final String MESSAGE_ID="_id";
    private static final String NUMBER_FIELD="number";
    private static final String MESSAGE_FIELD="message";
    private static final String TIME_FIELD="time";
    private static final String MESSAGE_TABLE_QUERY="CREATE TABLE IF NOT EXISTS "+MESSAGE_TABLE+" ("+MESSAGE_ID+" INTEGER PRIMARY KEY, "+NUMBER_FIELD+" TEXT, "+MESSAGE_FIELD+" TEXT, "+TIME_FIELD+" TEXT)";

    private static final String ALARM_ID="_aid";
    private static final String ALARM_NUMBER="_aidNumber";
    private static final String ALARM_ID_TABLE="alarm_table";
    private static final String ALARM_TABLE_QUERY="CREATE TABLE IF NOT EXISTS "+ALARM_ID_TABLE+" ("+ALARM_ID+" INTEGER PRIMARY KEY, "+ALARM_NUMBER+" TEXT)";
    private DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context=context;
    }
    public static DatabaseHelper getInstance(Context context){
        if(helper==null){
            helper=new DatabaseHelper(context);
        }
        return helper;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(MESSAGE_TABLE_QUERY);
        db.execSQL(ALARM_TABLE_QUERY);
    }
    public void insertId(){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(ALARM_NUMBER, "a");
        db.insert(ALARM_ID_TABLE, null, values);
    }


    public void insertMessage(MessageList messageList){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(NUMBER_FIELD,messageList.getNumber());
        values.put(MESSAGE_FIELD,messageList.getBody());
        values.put(TIME_FIELD, messageList.getTime());
        db.insert(MESSAGE_TABLE, null, values);
    }

    public ArrayList<MessageList> getAllMessages(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query(MESSAGE_TABLE, null, null, null, null, null, null);
        ArrayList<MessageList> messageLists=new ArrayList<MessageList>();
        if(cursor!=null && cursor.getCount()>0){
            cursor.moveToFirst();
            for(int i=0;i<cursor.getCount();i++){
                int id=cursor.getInt(cursor.getColumnIndex(MESSAGE_ID));
                String number=cursor.getString(cursor.getColumnIndex(NUMBER_FIELD));
                String message=cursor.getString(cursor.getColumnIndex(MESSAGE_FIELD));
                String time=cursor.getString(cursor.getColumnIndex(TIME_FIELD));
                //Toast.makeText(context, number + " " + message + " " + time, Toast.LENGTH_LONG).show();
                MessageList list=new MessageList(id,number,message,time);
                messageLists.add(list);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return messageLists;
    }


    public int getMessageId(){
        int id=0;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query(MESSAGE_TABLE, null, null, null, null, null, null);
        if(cursor!=null && cursor.getCount()>0){
            cursor.moveToLast();
            id=cursor.getInt(cursor.getColumnIndex(MESSAGE_ID));
        }
        cursor.close();
        return id;
    }

    public int getMessageIdByParticularInfo(String number,String msg,String time){
        ArrayList<MessageList> messageLists=getAllMessages();
        for(MessageList list:messageLists){
            if(list.getNumber().equals(number) && list.getBody().equals(msg) && list.getTime().equals(time)){
                int id=Integer.parseInt(String.valueOf(list.getId()));
                return id;
            }
        }
        return -1;
    }

    /*public int getId(){
        int id=0;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query(ALARM_ID_TABLE, null, null, null, null, null, null);
        if(cursor!=null && cursor.getCount()>0){
            cursor.moveToLast();
            id=cursor.getInt(cursor.getColumnIndex(ALARM_ID));
        }
        cursor.close();
        return id;
    }*/

    public void deleteMessage(String number,String message,String time){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("DELETE FROM "+ MESSAGE_TABLE + " WHERE "+ NUMBER_FIELD + "=\"" + number + "\""+" AND "+ MESSAGE_FIELD + "=\"" + message + "\""+" AND "+ TIME_FIELD + "=\"" + time + "\"");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
