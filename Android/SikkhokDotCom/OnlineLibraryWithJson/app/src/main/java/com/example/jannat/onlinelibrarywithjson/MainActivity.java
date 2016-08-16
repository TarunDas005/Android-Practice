package com.example.jannat.onlinelibrarywithjson;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final int SUCCESS = 1;
    public static final int FAILURE = 0;
    public static final String REQ_URL = "http://192.168.0.100/online_library/getAllBooks.php";
    public static final String POST_URL = "http://192.168.0.100/online_library/addBook.php";
    EditText titleTextField, authorTextField, categoryTextField, isbnTextField, priceTextField;
    private ArrayList<Book> allBooks;
    private ProgressDialog pd;
    Handler PostHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            pd.dismiss();
            switch (msg.what) {
                case SUCCESS:

                    Toast.makeText(getApplicationContext(),
                            "Insert successfully", Toast.LENGTH_LONG).show();

                    break;
                case FAILURE:
                    Toast.makeText(getApplicationContext(), "error",
                            Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
        }
    };
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            pd.dismiss();
            switch (msg.what) {
                case SUCCESS:
                    if (allBooks != null) {
                        for (Book book : allBooks) {
                            Toast.makeText(getApplicationContext(),
                                    book.toString(), Toast.LENGTH_LONG).show();
                        }
                    }
                    break;
                case FAILURE:
                    Toast.makeText(getApplicationContext(), "Books not found",
                            Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextField = (EditText) findViewById(R.id.titleTextField);
        authorTextField = (EditText) findViewById(R.id.authorTextField);
        categoryTextField = (EditText) findViewById(R.id.categoryTextField);
        isbnTextField = (EditText) findViewById(R.id.isbnTextField);
        priceTextField = (EditText) findViewById(R.id.priceTextField);
    }

    public void SaveButtonClick(View view) {
        String title = titleTextField.getText().toString();
        String author = authorTextField.getText().toString();
        String category = categoryTextField.getText().toString();
        String isbn = isbnTextField.getText().toString();
        double price = Double.parseDouble(priceTextField.getText().toString());

        Book book = new Book(title, author, category, isbn, price);
        if (isNetworkAvailable()) {
            pd = ProgressDialog.show(this, "", "Fetching data..", false, true);
            Postthread pt = new Postthread(book);
            pt.start();
        }
    }

    public void viewButtonClick(View view) {
        if (isNetworkAvailable()) {
            pd = ProgressDialog.show(this, "", "Fetching data..", false, true);
            RequestThread thread = new RequestThread();
            thread.start();
        }
    }

    public boolean isNetworkAvailable() {
        ConnectivityManager cManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cManager.getActiveNetworkInfo();
        if (networkInfo != null) {
            if (networkInfo.isAvailable() && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    class Postthread extends Thread {

        private Book book;

        public Postthread(Book book) {
            this.book = book;
        }

        @Override
        public void run() {
            //post data to server;
            StringRequest stringRequest = new StringRequest(Request.Method.POST, POST_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject respObject = new JSONObject(response);
                                int success = respObject.getInt("success");
                                if (success == 1) {
                                    PostHandler.sendEmptyMessage(SUCCESS);
                                } else {
                                    PostHandler.sendEmptyMessage(FAILURE);
                                }
                            } catch (JSONException e) {
                                PostHandler.sendEmptyMessage(FAILURE);
                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            PostHandler.sendEmptyMessage(FAILURE);
                        }
                    }) {
                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("title", book.getTitle());
                    params.put("author", book.getAuthor());
                    params.put("category", book.getCategory());
                    params.put("ISBN", book.getISBN());
                    params.put("price", String.valueOf(book.getPrice()));
                    return params;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
            requestQueue.add(stringRequest);
        }
    }

    class RequestThread extends Thread {
        @Override
        public void run() {
            //String url=REQ_URL+"?category=mathmatics";
            StringRequest stringRequest = new StringRequest(REQ_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject respObject = new JSONObject(response);
                                int success = respObject.getInt("success");
                                if (success == 1) {
                                    //showJSON(response);
                                    ParseJSON pj = new ParseJSON(response);
                                    allBooks = new ArrayList<Book>();
                                    allBooks = pj.parseJSON();
                                    handler.sendEmptyMessage(SUCCESS);
                                } else {
                                    handler.sendEmptyMessage(FAILURE);
                                }

                            } catch (JSONException e) {
                                handler.sendEmptyMessage(FAILURE);
                            }

                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                            handler.sendEmptyMessage(FAILURE);
                        }
                    });

            RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
            requestQueue.add(stringRequest);
        }
    }
}
