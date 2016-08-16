package com.example.jannat.activitylifecycle;

import java.io.Serializable;

/**
 * Created by JANNAT on 4/10/2016.
 */
public class Person implements Serializable{

    String personName;
    String email;
    String phone;

    public Person(String email, String personName, String phone) {
        this.email = email;
        this.personName = personName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", personName='" + personName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
