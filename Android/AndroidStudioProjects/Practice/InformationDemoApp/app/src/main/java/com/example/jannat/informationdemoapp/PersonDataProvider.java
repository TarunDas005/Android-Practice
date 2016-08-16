package com.example.jannat.informationdemoapp;

/**
 * Created by JANNAT on 3/19/2016.
 */
public class PersonDataProvider {
    private String firstName,lastName,email,dateOfBirth,gender;

    public PersonDataProvider(String firstName,String lastName,String email,String dateOfBirth,String gender){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setDateOfBirth(dateOfBirth);
        this.setGender(gender);
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
