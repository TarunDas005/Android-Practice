package com.example.jannat.smsschedular;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberSubActivity extends AppCompatActivity {
    int pos;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number_sub);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.GONE);
        toolbar.setVisibility(View.GONE);
        final List<String> numbers=getAllContactNumber();
        final List<String> names=getAllContactNames();
        listView= (ListView) findViewById(R.id.phoneListView);
        listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), R.layout.single_contact, R.id.tv_ContactName, names));
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String name = (String) parent.getItemAtPosition(position);
                        pos = 0;
                        for (String s : names) {
                            if (s.equals(name)) {
                                break;
                            }
                            pos++;
                        }
                        //Toast.makeText(getApplicationContext(), "" + numbers.get(pos), Toast.LENGTH_LONG).show();
                        String number=numbers.get(pos);
                        Intent data=new Intent();
                        data.putExtra("number_from_list",number);
                        setResult(Activity.RESULT_OK,data);
                        finish();
                    }

                }

        );

    }
    private List<String> getAllContactNames() {
        List<String> lContactNamesList = new ArrayList<String>();
        try {
            // Get all Contacts
            //Cursor lPeople = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
            Cursor lPeople = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
            if (lPeople != null) {
                while (lPeople.moveToNext()) {
                    // Add Contact's Name into the List
                    //lContactNamesList.add(lPeople.getString(lPeople.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)));
                    lContactNamesList.add(lPeople.getString(lPeople.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)));
                }
            }
        } catch (NullPointerException e) {
            Log.e("getAllContactNames()", e.getMessage());
        }
        return lContactNamesList;
    }
    private List<String> getAllContactNumber() {
        List<String> lContactNamesList = new ArrayList<String>();
        try {
            // Get all Contacts
            //Cursor lPeople = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
            Cursor lPeople = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
            if (lPeople != null) {
                while (lPeople.moveToNext()) {
                    // Add Contact's Name into the List
                    //lContactNamesList.add(lPeople.getString(lPeople.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)));
                    lContactNamesList.add(lPeople.getString(lPeople.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)));
                }
            }
        } catch (NullPointerException e) {
            Log.e("getAllContactNames()", e.getMessage());
        }
        return lContactNamesList;
    }
}
