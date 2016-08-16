package com.example.jannat.practiceondatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nameTextField,emailTextField,phoneTextField,addressTextField,taskNameTextField;
    Spinner employeeIdSpinner,taskIdSpinner;
    DatabaseHelper databaseHelper;
    ArrayList<String> employeeName;
    ArrayList<String> taskName;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextField= (EditText) findViewById(R.id.nameTextField);
        emailTextField= (EditText) findViewById(R.id.emailTextField);
        phoneTextField= (EditText) findViewById(R.id.phoneTextField);
        addressTextField= (EditText) findViewById(R.id.addressTextField);
        taskNameTextField= (EditText) findViewById(R.id.taskNameTextField);
        employeeIdSpinner= (Spinner) findViewById(R.id.employeeIdSpinner);
        taskIdSpinner= (Spinner) findViewById(R.id.taskIdSpinner);

        databaseHelper=DatabaseHelper.getInstance(getApplicationContext());
        addEmployeeIdSpinner();
        addTaskIdSpinner();

    }

    public void addEmployeeIdSpinner(){
        employeeName=databaseHelper.getEmployeeName();
        adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,employeeName);
        employeeIdSpinner.setAdapter(adapter);

    }

    public void addTaskIdSpinner(){
        taskName=databaseHelper.getAllTaskName();
        adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,taskName);
        taskIdSpinner.setAdapter(adapter);
    }

    public void AddEmployee(View view){
        String name=nameTextField.getText().toString();
        String email=emailTextField.getText().toString();
        String phone=phoneTextField.getText().toString();
        String address=addressTextField.getText().toString();
        Employee employee=new Employee(name,email,phone,address);
        databaseHelper.InsertEmployee(employee);
        Toast.makeText(getApplicationContext(),"Insert Successfully",Toast.LENGTH_LONG).show();
        addEmployeeIdSpinner();
        nameTextField.setText("");
        emailTextField.setText("");
        phoneTextField.setText("");
        addressTextField.setText("");
    }

    public void ShowEmployee(View view){
        ArrayList<Employee> employees=databaseHelper.getAllEmployee();
        if(employees!=null && employees.size()>0){
            for(Employee employee:employees){
                Toast.makeText(getApplicationContext(), employee.toString(), Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getApplicationContext(),"No data found",Toast.LENGTH_SHORT).show();
        }
    }


    public void AddTask(View view){
        String taskName=taskNameTextField.getText().toString();
        Task task=new Task(taskName);
        databaseHelper.InsertTask(task);
        Toast.makeText(getApplicationContext(),"Insert Successfully",Toast.LENGTH_LONG).show();
        addTaskIdSpinner();
        taskNameTextField.setText("");
    }

    public void ShowTask(View view){
        ArrayList<Task> tasks=databaseHelper.getAllTask();
        if(tasks!=null && tasks.size()>0){
            for(Task task:tasks){
                Toast.makeText(getApplicationContext(), task.toString(), Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getApplicationContext(),"No data found",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        databaseHelper.DatabaseClose();
    }


    public void assign(View view){
        String empName= (String) employeeIdSpinner.getSelectedItem();
        String taskName= (String) taskIdSpinner.getSelectedItem();

        if(empName.equals("") || taskName==null){
            Toast.makeText(getApplicationContext(), "Empty Data", Toast.LENGTH_SHORT).show();
        }
        else{
            StringBuffer empBuffer=new StringBuffer(empName);
            StringBuffer empIdBuffer=new StringBuffer();
            for(int i=empBuffer.length()-1;i>=0;i--){
                if(empBuffer.charAt(i)>='0' &&empBuffer.charAt(i)<='9')
                    empIdBuffer.append(empBuffer.charAt(i));
                else
                    break;
            }

            String employeeId=empIdBuffer.toString();



            StringBuffer taskBuffer=new StringBuffer(taskName);
            StringBuffer taskIdBuffer=new StringBuffer();
            for(int i=taskBuffer.length()-1;i>=0;i--){
                if(taskBuffer.charAt(i)>='0' &&taskBuffer.charAt(i)<='9')
                    taskIdBuffer.append(taskBuffer.charAt(i));
                else
                    break;
            }

            String taskId=taskIdBuffer.toString();
            TaskAssignment taskAssignment=new TaskAssignment(Integer.parseInt(employeeId),Integer.parseInt(taskId));
            databaseHelper.InsertTaskAssignment(taskAssignment);
            Toast.makeText(getApplicationContext(),"Assign Successfully", Toast.LENGTH_SHORT).show();
        }

    }


    public void showAllInformation(View view){
        ArrayList<String> informations=databaseHelper.getAllInformation();
        for (String s:informations){
            Toast.makeText(getApplicationContext(),s, Toast.LENGTH_LONG).show();
        }
    }

    public void SearchEmployee(View view){
        Intent intent=new Intent(MainActivity.this,EmployeeSearchActivity.class);
        startActivity(intent);
    }

     /*@Override
    protected void onStart() {
        super.onStart();
        databaseHelper=DatabaseHelper.getInstance(getApplicationContext());
    }

    @Override
    protected void onStop() {
        super.onStop();
        databaseHelper.DatabaseClose();
    }*/
}
