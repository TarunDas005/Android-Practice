package com.example.jannat.productdatabaseapp;


public class Products {
    private int _id;
    private String _productname;

    public Products(){

    }

    public Products(String productname) {
        this._productname = productname;
    }

    public String get_productname() {
        return _productname;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
