package com.example.jannat.currencyconverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView texts;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_main);

        Button button = (Button) findViewById(R.id.calculateCmd);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new DownloadData().execute();
            }
        });

        texts = (TextView) findViewById(R.id.txtCurrency);

    }

    public String getJson(String url) throws ClientProtocolException,
            IOException {
        StringBuilder build = new StringBuilder();
        HttpClient client = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = client.execute(httpGet);
        HttpEntity entity = response.getEntity();
        InputStream content = entity.getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                content));
        String con;
        while ((con = reader.readLine()) != null) {
            build.append(con);
        }
        return build.toString();
    }

    class DownloadData extends AsyncTask<Void, Integer, String> {

        ProgressDialog pd = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(CurrencyActivity.this);
            pd.setTitle("Converting...");
            pd.setMessage("Please wait...");
            pd.setCancelable(false);
            pd.show();

        }

        @Override
        protected String doInBackground(Void... params) {

            String s;
            String theResult = "";
            try {
                s = getJson("http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22USDSGD%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=");
                JSONObject jObj;
                jObj = new JSONObject(s);
                theResult = jObj.getJSONObject("query")
                        .getJSONObject("results").getJSONObject("rate")
                        .getString("Rate");

                System.out.println(theResult);
            }

            catch (JSONException e) {
                e.printStackTrace();
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return theResult;
        }

        @Override
        protected void onPostExecute(String theResult) {
            super.onPostExecute(theResult);
            pd.dismiss();

            System.out.println("theResult:" + theResult);
            texts.setText(theResult);
        }
    }

}
