package com.example.jannat.listviewdemo7c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;


public class DatabaseHelper extends SQLiteOpenHelper {

    private static DatabaseHelper sInstance;

    public static final String DB_NAME="task_management";
    public static final int DB_version=1;

    public static final String EMPLOYEE_TABLE="employee";
    public static final String ID_FIELD="_id";
    public static final String NAME="name";
    public static final String EMAIL="email";
    public static final String PHONE="phone";
    public static final String ADDRESS="address";

    public static final String EMPLOYEE_TABLE_SQL="CREATE TABLE "+EMPLOYEE_TABLE+" ("+ID_FIELD+" INTEGER PRIMARY KEY, "+NAME+" TEXT, "
            +EMAIL+" TEXT, "+PHONE+" TEXT, "+ADDRESS+" TEXT)";


    /*public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_version);
    }*/

    private DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_version);
    }

    public static  DatabaseHelper getInstance(Context context){
        if(sInstance==null){
            sInstance=new DatabaseHelper(context);
        }
        return sInstance;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EMPLOYEE_TABLE_SQL);
        Log.e("Table Created", EMPLOYEE_TABLE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long insertEmployee(Employee employee){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(NAME,employee.getName());
        values.put(EMAIL,employee.getEmail());
        values.put(PHONE,employee.getPhone());
        values.put(ADDRESS,employee.getAddress());
        long inserted=db.insert(EMPLOYEE_TABLE,null,values);
        db.close();
        return inserted;
    }

    public ArrayList<Employee> getAllEmployess(){
        ArrayList<Employee> allEmployess=new ArrayList<Employee>();
        SQLiteDatabase db=this.getReadableDatabase();

//        String[] columns={NAME,EMAIL};
//        db.query(EMPLOYEE_TABLE,columns,"name = ? AND address = ?",new String[]{"tarun","dhaka"},null,null,null);

        Cursor cursor=db.query(EMPLOYEE_TABLE, null, null, null, null, null, null);
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
        db.close();
        return allEmployess;
    }

    public ArrayList<Employee> searchEmployee(String keyword){
        ArrayList<Employee> employees=new ArrayList<Employee>();
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query(EMPLOYEE_TABLE,null,"name LIKE '%"+keyword+"%' or email LIKE '%"+keyword+"%' or phone LIKE '%"+keyword+"%' or address LIKE '%"+keyword+"%'",null,null,null,null);

        //Cursor cursor=db.rawQuery("select * from employee where name LIKE '%"+keyword+"%' or email LIKE '%"+keyword+"%' or phone LIKE '%"+keyword+"%' or address LIKE '%"+keyword+"%'",null);
        if(cursor!=null && cursor.getCount()>0){
            cursor.moveToFirst();
            for(int i=0;i<cursor.getCount();i++){
                int id=cursor.getInt(cursor.getColumnIndex(ID_FIELD));
                String name=cursor.getString(cursor.getColumnIndex(NAME));
                String email=cursor.getString(cursor.getColumnIndex(EMAIL));
                String phone=cursor.getString(cursor.getColumnIndex(PHONE));
                String address=cursor.getString(cursor.getColumnIndex(ADDRESS));
                Employee employee=new Employee(id,name,email,phone,address);
                employees.add(employee);
                cursor.moveToNext();
            }
        }
        cursor.close();
        db.close();
        return employees;
    }
    public int updateEmployeeName(int eId,String newName){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(NAME,newName);
        int updated=db.update(EMPLOYEE_TABLE,values,ID_FIELD+"=?",new String[]{String.valueOf(eId)});
        db.close();
        return updated;
    }
}
