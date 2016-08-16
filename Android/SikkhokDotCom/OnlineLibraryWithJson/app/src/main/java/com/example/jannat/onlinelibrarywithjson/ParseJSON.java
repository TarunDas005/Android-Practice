package com.example.jannat.onlinelibrarywithjson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class ParseJSON {
    /*public static String[] ids;
    public static String[] titles;
    public static String[] authors;
    public static String[] categories;
    public static String[] isbns;
    public static String[] prices;*/

    ArrayList<Book> books=new ArrayList<Book>();

    public static final String JSON_ARRAY = "books";
    public static final String KEY_ID = "id";
    public static final String KEY_TITLE = "title";
    public static final String KEY_AUTHOR = "author";
    public static final String KEY_CATEGORY = "category";
    public static final String KEY_ISBN = "ISBN";
    public static final String KEY_PRICE = "price";
    private JSONArray users = null;

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    protected ArrayList<Book> parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            /*ids = new String[users.length()];
            titles = new String[users.length()];
            authors = new String[users.length()];
            categories = new String[users.length()];
            isbns = new String[users.length()];
            prices = new String[users.length()];*/

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                /*ids[i] = jo.getString(KEY_ID);
                titles[i] = jo.getString(KEY_TITLE);
                authors[i] = jo.getString(KEY_AUTHOR);
                categories[i] = jo.getString(KEY_CATEGORY);
                isbns[i] = jo.getString(KEY_ISBN);
                prices[i] = jo.getString(KEY_PRICE);*/

                int id=Integer.parseInt(jo.getString(KEY_ID));
                String title=jo.getString(KEY_TITLE);
                String author=jo.getString(KEY_AUTHOR);
                String category=jo.getString(KEY_CATEGORY);
                String isbn=jo.getString(KEY_ISBN);
                double price=Double.parseDouble(jo.getString(KEY_PRICE));
                Book book=new Book(id,title,author,category,isbn,price);
                books.add(book);
            }
            return books;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}