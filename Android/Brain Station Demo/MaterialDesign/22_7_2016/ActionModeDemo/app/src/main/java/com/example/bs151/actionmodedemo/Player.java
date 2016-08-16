package com.example.bs151.actionmodedemo;

/**
 * Created by BS151 on 7/22/2016.
 */
public class Player {
    private int imageId;
    private String name;
    private String role;

    public Player(int imageId, String name, String role) {
        this.imageId = imageId;
        this.name = name;
        this.role = role;
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
}
