package com.example.jannat.currecyusingapi;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class ParseJSON {

    ArrayList<Currency> tk=new ArrayList<Currency>();

    public static final String JSON_ARRAY = "quotes";
    public static final String KEY_ID = '"'+"USDBDT"+'"';
//    public static final String KEY_TITLE = "title";
//    public static final String KEY_AUTHOR = "author";
//    public static final String KEY_CATEGORY = "category";
//    public static final String KEY_ISBN = "ISBN";
//    public static final String KEY_PRICE = "price";
    private JSONArray users = null;

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    protected String parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            String s = jsonObject.getString(JSON_ARRAY);
            //Log.e("S",s);
            for (String retval: s.split(",")){
                String[] parts = retval.split(":");
                String parts0=parts[0];
                String parts1=parts[1];
                if(parts0.equals(KEY_ID)){
                    return parts1;
                }
                    //Log.e("S",parts1);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "";
    }
}