package com.example.jannat.prepopulateddbdemo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by JANNAT on 4/25/2016.
 */
public class PrepopulatedDBOpenHelper extends SQLiteOpenHelper {

    private static PrepopulatedDBOpenHelper helperInstance;

    public static final String DB_NAME="task_management";
    public static String DB_PATH="";
    private SQLiteDatabase database;
    private Context context;

    public static final String EMPLOYEE_TABLE="employee";
    public static final String ID_FIELD="_id";
    public static final String NAME="name";
    public static final String EMAIL="email";
    public static final String PHONE="phone";
    public static final String ADDRESS="address";

    /*public PrepopulatedDBOpenHelper(Context context) {
        super(context, DB_NAME, null, 1);
        this.context=context;
        String pkgName=context.getPackageName();
        DB_PATH="/data/data/"+pkgName+"/databases/";
        this.database=openDatabase();
    }*/
    private PrepopulatedDBOpenHelper(Context context) {
        super(context, DB_NAME, null, 1);
        this.context=context;
        String pkgName=context.getPackageName();
        DB_PATH="/data/data/"+pkgName+"/databases/";
        this.database=openDatabase();
    }

    public static PrepopulatedDBOpenHelper getInstance(Context context){
        if(helperInstance==null){
            helperInstance=new PrepopulatedDBOpenHelper(context);
        }
        return helperInstance;
    }


    public SQLiteDatabase getDatabase(){
        return this.database;
    }
    public synchronized void close(){
        if(this.database!=null){
            this.database.close();
        }
    }

    public SQLiteDatabase openDatabase(){
        String path=DB_PATH+DB_NAME;
        if(database==null){
            createDatabase();
            database= SQLiteDatabase.openDatabase(path,null,SQLiteDatabase.OPEN_READWRITE);
        }
        return database;
    }

    private void createDatabase() {
        boolean dbExist=checkDB();
        if(!dbExist){
            this.getReadableDatabase();
            Log.e(getClass().getName(), "Database does not exist copy db from assets");
            copyDatabase();
        }else{
            Log.e(getClass().getName(), "Database already exist");
        }
    }

    private void copyDatabase() {
        try {
            String path=DB_PATH+DB_NAME;
            InputStream dbInputStream=context.getAssets().open(DB_NAME);
            OutputStream dbOutputStream=new FileOutputStream(path);
            byte[] buffer=new byte[4096];
            int readCount=0;
            readCount=dbInputStream.read(buffer);
            while (readCount>0){
                dbOutputStream.write(buffer,0,readCount);
                readCount=dbInputStream.read(buffer);
            }

            dbInputStream.close();
            dbOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private boolean checkDB(){
        String path=DB_PATH+DB_NAME;
        File file=new File(path);
        if(file.exists()){
            Log.e(getClass().getName(),"Database already exist");
            return true;
        }
        Log.e(getClass().getName(),"Database not exist");
        return false;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public ArrayList<Employee> getAllEmployess(){
        ArrayList<Employee> allEmployess=new ArrayList<Employee>();


//        String[] columns={NAME,EMAIL};
//        db.query(EMPLOYEE_TABLE,columns,"name = ? AND address = ?",new String[]{"tarun","dhaka"},null,null,null);

        Cursor cursor=this.database.query(EMPLOYEE_TABLE, null, null, null, null, null, null);
        if(cursor!=null && cursor.getCount()>0){
            cursor.moveToFirst();
            for(int i=0;i<cursor.getCount();i++){
                int id=cursor.getInt(cursor.getColumnIndex(ID_FIELD));
                String name=cursor.getString(cursor.getColumnIndex(NAME));
                String email=cursor.getString(cursor.getColumnIndex(EMAIL));
                String phone=cursor.getString(cursor.getColumnIndex(PHONE));
                String address=cursor.getString(cursor.getColumnIndex(ADDRESS));
                Employee employee=new Employee(id,name,email,phone,address);
                allEmployess.add(employee);
                cursor.moveToNext();
            }
        }
        cursor.close();
        this.database.close();
        return allEmployess;
    }
}
