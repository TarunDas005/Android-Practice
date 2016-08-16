package com.example.bs151.employeeinformationapp;

/**
 * Created by BS151 on 7/18/2016.
 */
public class Person {
    public int id;
    public String name;
    public String designation;
    public String email;
    public String phone;

    public Person(String name, String designation, String email, String phone) {
        this.name = name;
        this.designation = designation;
        this.email = email;
        this.phone = phone;
    }

    public Person(int id, String name, String designation, String email, String phone) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
