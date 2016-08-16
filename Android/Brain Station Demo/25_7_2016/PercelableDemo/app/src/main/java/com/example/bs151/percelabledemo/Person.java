package com.example.bs151.percelabledemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by BS151 on 7/25/2016.
 */
public class Person implements Parcelable{
    private String name;
    private String id;
    private String department;

    public Person(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    protected Person(Parcel in) {
        name = in.readString();
        id = in.readString();
        department = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(id);
        parcel.writeString(department);
    }
}
