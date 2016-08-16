package com.example.jannat.informationdemoapp;

import android.os.Parcelable;

import java.io.Serializable;

public class Person implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String gender;

    public Person(String firstName,String lastName,String email,String dateOfBirth,String gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.dateOfBirth=dateOfBirth;
        this.gender=gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {

        return email;
    }
}
