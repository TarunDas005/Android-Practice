package com.example.jannat.practiceondatabase;

/**
 * Created by JANNAT on 4/26/2016.
 */
public class TaskAssignment {

    private int emp_id;
    private int emp_task_id;

    public TaskAssignment(int emp_id, int emp_task_id) {
        this.emp_id = emp_id;
        this.emp_task_id = emp_task_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getEmp_task_id() {
        return emp_task_id;
    }

    public void setEmp_task_id(int emp_task_id) {
        this.emp_task_id = emp_task_id;
    }

    @Override
    public String toString() {
        return "TaskAssignment{" +
                "emp_id=" + emp_id +
                ", emp_task_id=" + emp_task_id +
                '}';
    }
}
