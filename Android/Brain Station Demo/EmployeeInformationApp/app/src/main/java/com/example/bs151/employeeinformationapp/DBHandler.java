package com.example.bs151.employeeinformationapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by BS151 on 7/18/2016.
 */
public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "EmployeeInformation";
    private static final String TABLE_EMPLOYEE = "employee";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_DESIGNATION = "designation";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PHONE = "phone";
    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String employeeSql = "CREATE TABLE " + TABLE_EMPLOYEE + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_NAME + " TEXT,"
                + KEY_DESIGNATION + " TEXT,"+ KEY_EMAIL + " TEXT,"+ KEY_PHONE + " TEXT" + ")";
        db.execSQL(employeeSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMPLOYEE);
        onCreate(db);
    }

    public void addEmployee(Person person) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, person.getName());
        values.put(KEY_DESIGNATION, person.getDesignation());
        values.put(KEY_EMAIL,person.getEmail());
        values.put(KEY_PHONE,person.getPhone());

        db.insert(TABLE_EMPLOYEE, null, values);
        db.close();
    }

    public int getEmployeeCount() {
        int p;
        String countQuery = "SELECT * FROM " + TABLE_EMPLOYEE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        p=cursor.getCount();
        cursor.close();
        return p;
    }

    public ArrayList<Person> getAllEmployee() {
        ArrayList<Person> persons = new ArrayList<Person>();
        String selectQuery = "SELECT * FROM " + TABLE_EMPLOYEE;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {

                int id=Integer.parseInt(cursor.getString(0));
                String name=cursor.getString(1);
                String designation=cursor.getString(2);
                String email=cursor.getString(3);
                String phone=cursor.getString(4);
                Person person = new Person(id,name,designation,email,phone);
                persons.add(person);
            } while (cursor.moveToNext());
        }
        return persons;
    }
    public void deleteEmployee(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        if (db == null) {
            return;
        }
        db.delete(TABLE_EMPLOYEE,KEY_ID+"="+id,null);
        db.close();
    }

    public void updateEmployee(int id,String name,String designation,String email,String phone){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, name);
        values.put(KEY_DESIGNATION, designation);
        values.put(KEY_EMAIL, email);
        values.put(KEY_PHONE, phone);
        // updating row
        db.update(TABLE_EMPLOYEE, values, KEY_ID + " LIKE ?", new String[] { String.valueOf(id) });
        db.close();
    }
}
