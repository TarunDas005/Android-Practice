package com.example.jannat.practiceondatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by JANNAT on 4/26/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper{
    private static DatabaseHelper helperInstance;
    private static final String DB_NAME="task_management";
    private static String DB_PATH="";
    private SQLiteDatabase database;
    Context context;

    public static final String EMPLOYEE_TABLE="employee";
    public static final String ID_FIELD="_id";
    public static final String NAME="name";
    public static final String EMAIL="email";
    public static final String PHONE="phone";
    public static final String ADDRESS="address";


    private static final String TASK_TABLE="task";
    private static final String TASK_ID="_taskID";
    private static final String TASK_NAME="taskName";


    private static final String TASK_ASSIGNMENT_TABLE="task_assignment";
    public static final String EMP_ID="empId";
    public static final String EMP_TASK_ID="taskID";


    private static final String TASK_TABLE_QUERY="CREATE TABLE IF NOT EXISTS "+TASK_TABLE+" ("+TASK_ID+" INTEGER PRIMARY KEY, "+TASK_NAME+" TEXT)";

    private static final String TASK_ASSIGNMENT_QUERY="CREATE TABLE IF NOT EXISTS "+TASK_ASSIGNMENT_TABLE+" ("+EMP_ID+" INTEGER, "+EMP_TASK_ID+" INTEGER)";

    private DatabaseHelper(Context context) {
        super(context, DB_NAME, null, 1);
        String pkgName=context.getPackageName();
        DB_PATH="/data/data/"+pkgName+"/databases/";
        this.context=context;
        this.database=OpenDatabase();
        this.database.execSQL(TASK_TABLE_QUERY);
        this.database.execSQL(TASK_ASSIGNMENT_QUERY);
    }

    private SQLiteDatabase OpenDatabase() {
        String path=DB_PATH + DB_NAME;
        if(database==null){
            CreateDatabase();
            database=SQLiteDatabase.openDatabase(path,null,SQLiteDatabase.OPEN_READWRITE);
        }
        return database;
    }

    private void CreateDatabase() {
        boolean dbEXist=checkDatabase();
        if(!dbEXist){
            this.getReadableDatabase();
            CopyDatabase();
        }
    }

    private void CopyDatabase() {
        try{
            String path=DB_PATH+DB_NAME;
            InputStream dbInputStream=context.getAssets().open(DB_NAME);
            OutputStream dbOutputStream=new FileOutputStream(path);
            byte[] buffer=new byte[4096];
            int readCount=0;
            readCount=dbInputStream.read(buffer);
            while(readCount>0){
                dbOutputStream.write(buffer,0,readCount);
                readCount=dbInputStream.read(buffer);

            }
            dbInputStream.close();
            dbOutputStream.close();
        }catch (IOException e){

        }

    }

    private boolean checkDatabase(){
        String path=DB_PATH+DB_NAME;
        File file=new File(path);
        if(file.exists()){
            return true;
        }
        return false;
    }

    public static DatabaseHelper getInstance(Context context){
        if(helperInstance==null){
            helperInstance=new DatabaseHelper(context);
        }
        return helperInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public ArrayList<Employee> getAllEmployee(){
        ArrayList<Employee> employees=new ArrayList<Employee>();

        Cursor cursor=this.database.query(EMPLOYEE_TABLE,null,null,null,null,null,null);

        if(cursor!=null &&cursor.getCount()>0){
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
        return employees;
    }

    public void InsertEmployee(Employee employee){
        ContentValues values=new ContentValues();
        values.put(NAME,employee.getName());
        values.put(EMAIL,employee.getEmail());
        values.put(PHONE,employee.getPhone());
        values.put(ADDRESS,employee.getAddress());
        this.database.insert(EMPLOYEE_TABLE, null, values);
    }

    public void InsertTask(Task task){
        ContentValues values=new ContentValues();
        values.put(TASK_NAME,task.getTaskName());
        this.database.insert(TASK_TABLE,null,values);
    }

    public ArrayList<Task> getAllTask(){
        ArrayList<Task> tasks=new ArrayList<Task>();

        Cursor cursor=this.database.query(TASK_TABLE,null,null,null,null,null,null);

        if(cursor!=null &&cursor.getCount()>0){
            cursor.moveToFirst();
            for(int i=0;i<cursor.getCount();i++){
                int id=cursor.getInt(cursor.getColumnIndex(TASK_ID));
                String name=cursor.getString(cursor.getColumnIndex(TASK_NAME));
                Task task=new Task(id,name);
                tasks.add(task);
                cursor.moveToNext();
            }
        }
        cursor.close();
        return tasks;
    }
    public void DatabaseClose(){
        this.database.close();
    }

    public ArrayList<String> getEmployeeName(){
        ArrayList<String> employeeInformation=new ArrayList<String>();
        ArrayList<Employee> employees=getAllEmployee();
        for(Employee employee: employees){
            String name=employee.getName();
            String id=String.valueOf(employee.getId());
            String total="Name: "+name+" Id: "+id;
            employeeInformation.add(total);
        }

        return employeeInformation;
    }
    public ArrayList<String> getAllTaskName(){
        ArrayList<String> taskInformation=new ArrayList<String>();
        ArrayList<Task> tasks=getAllTask();
        for(Task task: tasks){
            String name=task.getTaskName();
            String id=String.valueOf(task.getTaskId());
            String total="Name: "+name+" Id: "+id;
            taskInformation.add(total);
        }

        return taskInformation;
    }

    public void InsertTaskAssignment(TaskAssignment taskAssignment){
        ContentValues values=new ContentValues();
        values.put(EMP_ID,taskAssignment.getEmp_id());
        values.put(EMP_TASK_ID,taskAssignment.getEmp_task_id());
        this.database.insert(TASK_ASSIGNMENT_TABLE,null,values);
    }


    public ArrayList<TaskAssignment> getAllTaskAssignment(){
        ArrayList<TaskAssignment> taskAssignments=new ArrayList<TaskAssignment>();

        Cursor cursor=this.database.query(TASK_ASSIGNMENT_TABLE,null,null,null,null,null,null);

        if(cursor!=null &&cursor.getCount()>0){
            cursor.moveToFirst();
            for(int i=0;i<cursor.getCount();i++){
                int emp_id=cursor.getInt(cursor.getColumnIndex(EMP_ID));
                int emp_task_id=cursor.getInt(cursor.getColumnIndex(EMP_TASK_ID));
                TaskAssignment assignment=new TaskAssignment(emp_id,emp_task_id);
                taskAssignments.add(assignment);
                cursor.moveToNext();
            }
        }
        cursor.close();
        return taskAssignments;
    }

    public ArrayList<String> getAllInformation(){
        ArrayList<String> information=new ArrayList<String>();
        ArrayList<TaskAssignment> taskAssignments=getAllTaskAssignment();
        ArrayList<Employee> employees=getAllEmployee();
        ArrayList<Task> tasks=getAllTask();
        for(TaskAssignment assignment:taskAssignments){
            String info="";
            for(Employee employee:employees){
                if(assignment.getEmp_id()==employee.getId()){
                    String id=String.valueOf(assignment.getEmp_id());
                    String name=employee.getName();
                    String email=employee.getEmail();
                    String phone=employee.getPhone();
                    String address=employee.getAddress();

                    info+="Id: "+id+" Name: "+name+" Email: "+email+" Phone: "+phone+" Address: "+address;
                    break;
                }
            }
            for (Task task:tasks){
                if(task.getTaskId()==assignment.getEmp_task_id()){
                    String taskName=task.getTaskName();
                    info+=" Task: "+taskName;
                }
            }
            information.add(info);
        }
        return information;
    }
}
