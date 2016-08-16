package com.example.jannat.messageapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by JANNAT on 4/4/2016.
 */
public class MyDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="MessageInformationAPP.db";
    private static final String TABLE_SENT_INFORMATION ="SentInformation";
    private static final String COLUMN_RECEIVERNUMBER="receivernumber";
    private static final String COLUMN_RECEIVERMESSAGE="receivertext";
    private static final String COLUMN_SENDINGTIME="sendingtime";



    private static final String TABLE_RECEIVER_INFORMATION ="ReceivInformation";
    private static final String COLUMN_SENDERNUMBER="sendernumber";
    private static final String COLUMN_SENDERMESSAGE="sendertext";
    private static final String COLUMN_RECEIVINGTIME="receivingtime";


    private static final String TABLE_ALL_INFORMATION ="AllInformation";
    private static final String COLUMN_ALLSENDERNUMBER="allsendernumber";
    private static final String COLUMN_ALLSENDERMESSAGE="allsendermessage";
    private static final String COLUMN_ALLRECEIVERNUMBER="allreceivernumber";
    private static final String COLUMN_ALLRECEIVERMESSAGE="allreceivermessage";
    private static final String COLUMN_ALLIDENTIFYTAG="allidentifytag";
    private static final String COLUMN_ALLTIME="alltime";


    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_SENT_INFORMATION);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_RECEIVER_INFORMATION);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_ALL_INFORMATION);
        onCreate(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_SENT_INFORMATION + "(" +
                COLUMN_RECEIVERNUMBER + " TEXT, " +
                COLUMN_RECEIVERMESSAGE + " TEXT, " +
                COLUMN_SENDINGTIME + " TEXT " +
                ");";
        db.execSQL(query);
        String newQuery = "CREATE TABLE " + TABLE_RECEIVER_INFORMATION + "(" +
                COLUMN_SENDERNUMBER + " TEXT, " +
                COLUMN_SENDERMESSAGE + " TEXT, " +
                COLUMN_RECEIVINGTIME + " TEXT " +
                ");";
        db.execSQL(newQuery);

        String allQuery = "CREATE TABLE " + TABLE_ALL_INFORMATION + "(" +
                COLUMN_ALLSENDERNUMBER + " TEXT, " +
                COLUMN_ALLSENDERMESSAGE + " TEXT, " +
                COLUMN_ALLRECEIVERNUMBER + " TEXT, " +
                COLUMN_ALLRECEIVERMESSAGE + " TEXT, " +
                COLUMN_ALLIDENTIFYTAG + " TEXT, " +
                COLUMN_ALLTIME + " TEXT " +
                ");";
        db.execSQL(allQuery);

    }

    public void addSentInfo(SmsSentInformation smsSentInformation){
        ContentValues values = new ContentValues();
        values.put(COLUMN_RECEIVERNUMBER, smsSentInformation.getReceiverNumber());
        values.put(COLUMN_RECEIVERMESSAGE, smsSentInformation.getReceiverMessage());
        values.put(COLUMN_SENDINGTIME, smsSentInformation.getSendingtime());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_SENT_INFORMATION, null, values);
        db.close();

        ContentValues allValue=new ContentValues();
        allValue.put(COLUMN_ALLSENDERNUMBER, "");
        allValue.put(COLUMN_ALLSENDERMESSAGE, "");
        allValue.put(COLUMN_ALLRECEIVERNUMBER, smsSentInformation.getReceiverNumber());
        allValue.put(COLUMN_ALLRECEIVERMESSAGE, smsSentInformation.getReceiverMessage());
        allValue.put(COLUMN_ALLIDENTIFYTAG, "S");
        allValue.put(COLUMN_ALLTIME, smsSentInformation.getSendingtime());
        db = getWritableDatabase();
        db.insert(TABLE_ALL_INFORMATION, null, allValue);
        db.close();

    }

    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_SENT_INFORMATION + " WHERE 1";

        //Cursor points to a location in your results
        Cursor c = db.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {
            /*if (c.getString(c.getColumnIndex("receivernumber")) != null) {
                dbString += c.getString(c.getColumnIndex("receivernumber"));
                dbString += "\n";
            }*/
            dbString += c.getString(c.getColumnIndex("receivernumber"));
            dbString += ": ";
            dbString += c.getString(c.getColumnIndex("receivertext"));
            dbString += ": ";
            dbString += c.getString(c.getColumnIndex("sendingtime"));
            dbString += "\n";
            c.moveToNext();
        }
        db.close();
        return dbString;
    }

    public ArrayList<SmsSentInformation> getAllSentInfo(){
        ArrayList<SmsSentInformation> smsSentInformations=new ArrayList<SmsSentInformation>();
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_SENT_INFORMATION + " WHERE 1";

        //Cursor points to a location in your results
        Cursor c = db.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {
            /*if (c.getString(c.getColumnIndex("receivernumber")) != null) {
                dbString += c.getString(c.getColumnIndex("receivernumber"));
                dbString += "\n";
            }*/
            SmsSentInformation smsInformation=new SmsSentInformation();
            smsInformation.setReceiverNumber(c.getString(c.getColumnIndex("receivernumber")));
            smsInformation.setReceiverMessage(c.getString(c.getColumnIndex("receivertext")));
            smsInformation.setSendingtime(c.getString(c.getColumnIndex("sendingtime")));
            smsSentInformations.add(smsInformation);
            c.moveToNext();
        }
        db.close();
        return smsSentInformations;
    }

    public ArrayList<SmsSentInformation> getSingleInfoForSending(){
        ArrayList<SmsSentInformation> allSentInformation=getAllSentInfo();
        ArrayList<SmsSentInformation> singleInfo=new ArrayList<SmsSentInformation>();
        for (SmsSentInformation information:allSentInformation) {
            int flag=0;
            String number=information.getReceiverNumber();
            for (SmsSentInformation sentInformation:singleInfo) {
                if(sentInformation.getReceiverNumber().equals(number)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                singleInfo.add(information);
            }
        }
        return singleInfo;
    }

    public void deleteMessageByReceiverNumber(String number){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("DELETE FROM "+ TABLE_SENT_INFORMATION + " WHERE "+ COLUMN_RECEIVERNUMBER + "=\"" + number + "\"");
        db.close();
    }

    public void deleteMessageBySenderNumber(String number){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("DELETE FROM "+ TABLE_RECEIVER_INFORMATION + " WHERE "+ COLUMN_SENDERNUMBER + "=\"" + number + "\"");
        db.close();
    }



    public void addReceivingInfo(SmsReceiverInformation smsReceiverInformation){
        ContentValues receiveValue = new ContentValues();

        Log.e("A", smsReceiverInformation.getSenderNumber() + ": " + smsReceiverInformation.getSenderMessage() + ": " + smsReceiverInformation.getReceivingTime());

        receiveValue.put(COLUMN_SENDERNUMBER, smsReceiverInformation.getSenderNumber());
        receiveValue.put(COLUMN_SENDERMESSAGE, smsReceiverInformation.getSenderMessage());
        receiveValue.put(COLUMN_RECEIVINGTIME, smsReceiverInformation.getReceivingTime());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_RECEIVER_INFORMATION, null, receiveValue);
        db.close();

        ContentValues allReceiveValues= new ContentValues();;

        allReceiveValues.put(COLUMN_ALLSENDERNUMBER, smsReceiverInformation.getSenderNumber());
        allReceiveValues.put(COLUMN_ALLSENDERMESSAGE, smsReceiverInformation.getSenderMessage());
        allReceiveValues.put(COLUMN_ALLRECEIVERNUMBER, "");
        allReceiveValues.put(COLUMN_ALLRECEIVERMESSAGE, "");
        allReceiveValues.put(COLUMN_ALLIDENTIFYTAG, "R");
        allReceiveValues.put(COLUMN_ALLTIME, smsReceiverInformation.getReceivingTime());

        db = getWritableDatabase();
        db.insert(TABLE_ALL_INFORMATION, null, allReceiveValues);
        db.close();

    }

    public String databaseToStringReceiveInfo(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_RECEIVER_INFORMATION + " WHERE 1";

        //Cursor points to a location in your results
        Cursor c = db.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {

            dbString += c.getString(c.getColumnIndex("sendernumber"));
            dbString += ": ";
            dbString += c.getString(c.getColumnIndex("sendertext"));
            dbString += ": ";
            dbString += c.getString(c.getColumnIndex("receivingtime"));
            dbString += "\n";
            c.moveToNext();
        }
        db.close();
        return dbString;
    }

    public ArrayList<SmsReceiverInformation> getAllReceiveInfo(){
        ArrayList<SmsReceiverInformation> smsReceiverInformations=new ArrayList<SmsReceiverInformation>();
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_RECEIVER_INFORMATION + " WHERE 1";

        //Cursor points to a location in your results
        Cursor c = db.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {
            /*if (c.getString(c.getColumnIndex("receivernumber")) != null) {
                dbString += c.getString(c.getColumnIndex("receivernumber"));
                dbString += "\n";
            }*/
            SmsReceiverInformation smsInformation=new SmsReceiverInformation();
            smsInformation.setSenderNumber(c.getString(c.getColumnIndex("sendernumber")));
            smsInformation.setSenderMessage(c.getString(c.getColumnIndex("sendertext")));
            smsInformation.setReceivingTime(c.getString(c.getColumnIndex("receivingtime")));
            smsReceiverInformations.add(smsInformation);
            c.moveToNext();
        }
        db.close();
        return smsReceiverInformations;
    }

    public ArrayList<SmsReceiverInformation> getSingleInfoForReceiving(){
        ArrayList<SmsReceiverInformation> allReceiveInformations=getAllReceiveInfo();
        ArrayList<SmsReceiverInformation> singleInfo=new ArrayList<SmsReceiverInformation>();
        for (SmsReceiverInformation information:allReceiveInformations) {
            int flag=0;
            String number=information.getSenderNumber();
            for (SmsReceiverInformation receiveInformation:singleInfo) {
                if(receiveInformation.getSenderNumber().equals(number)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                singleInfo.add(information);
            }
        }
        return singleInfo;
    }

    public ArrayList<AllMessage> getAllMessageInfo(){
        ArrayList<AllMessage> allMessages=new ArrayList<AllMessage>();
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_ALL_INFORMATION + " WHERE 1";

        //Cursor points to a location in your results
        Cursor c = db.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Log.e("Name: ",  "Aronno");

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {
            /*if (c.getString(c.getColumnIndex("receivernumber")) != null) {
                dbString += c.getString(c.getColumnIndex("receivernumber"));
                dbString += "\n";
            }*/
            AllMessage message=new AllMessage();
            message.setSenderNumber(c.getString(c.getColumnIndex("allsendernumber")));
            message.setSenderMessage(c.getString(c.getColumnIndex("allsendermessage")));
            message.setTime(c.getString(c.getColumnIndex("alltime")));
            message.setReceiverNumber(c.getString(c.getColumnIndex("allreceivernumber")));
            message.setReceiverMessage(c.getString(c.getColumnIndex("allreceivermessage")));
            message.setIdentifyTag(c.getString(c.getColumnIndex("allidentifytag")));

            allMessages.add(message);
            c.moveToNext();
        }
        db.close();
        return allMessages;
    }

    public ArrayList<AllMessage> getAllSingleInfo(){
        ArrayList<AllMessage> messages=getAllMessageInfo();
        ArrayList<AllMessage> singleInfo=new ArrayList<AllMessage>();
        for (AllMessage message:messages) {
            int flag=0;
            String senderNumber=message.getSenderNumber();
            String receiverNumber=message.getReceiverNumber();
            for (AllMessage message1:singleInfo) {
                if((message1.getReceiverNumber().equals(senderNumber) && message1.getSenderNumber().equals(receiverNumber))||
                        (message1.getReceiverNumber().equals(receiverNumber) && message1.getSenderNumber().equals(senderNumber)))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                singleInfo.add(message);
            }
        }
        return singleInfo;
    }

    public void deleteMessageByNumberAndMessage(String number,String message,String time){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("DELETE FROM "+ TABLE_ALL_INFORMATION + " WHERE ("+ COLUMN_ALLSENDERNUMBER + "=\"" + number + "\""+" OR "+ COLUMN_ALLRECEIVERNUMBER + "=\"" + number + "\""+") "+
        "AND "+"("+COLUMN_ALLSENDERMESSAGE + "=\"" + message + "\""+" OR "+ COLUMN_ALLRECEIVERMESSAGE + "=\"" + message + "\""+")"+" AND "+ COLUMN_ALLTIME + "=\"" + time + "\"");
        db.close();
    }
}
