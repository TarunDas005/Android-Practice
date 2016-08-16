package com.example.jannat.multiplejsonofcurrency;

import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Currency;

public class ParseJSON {


    public static final String JSON_ARRAY = "quotes";
    public static final String KEY_ID = "USDBDT";
//    public static final String KEY_TITLE = "title";
//    public static final String KEY_AUTHOR = "author";
//    public static final String KEY_CATEGORY = "category";
//    public static final String KEY_ISBN = "ISBN";
//    public static final String KEY_PRICE = "price";
    //private JSONArray users = new JSONArray();
    private JSONObject users = new JSONObject();

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    protected double parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject=new JSONObject(json);

            users=jsonObject.getJSONObject(JSON_ARRAY);
            //JSONObject object=users.getJSONObject(KEY_ID);

            double v=Double.parseDouble(String.valueOf(users.getDouble(KEY_ID)));
            return v;
        } catch (JSONException e) {
            e.printStackTrace();
            Log.e("TAG",e.getMessage());
        }
        return -1.0;
    }
}