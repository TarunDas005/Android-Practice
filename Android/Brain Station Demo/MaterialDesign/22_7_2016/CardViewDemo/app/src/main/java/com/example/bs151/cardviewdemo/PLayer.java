package com.example.bs151.cardviewdemo;

import java.io.Serializable;

/**
 * Created by BS151 on 7/22/2016.
 */
public class PLayer implements Serializable{
    private int imageId;
    private String name,role,phone;

    public PLayer(int imageId, String name, String role, String phone) {
        this.imageId = imageId;
        this.name = name;
        this.role = role;
        this.phone = phone;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
