package com.example.jannat.contactlistapp2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView mContactsAt;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<String> numbers=getAllContactNumber();
        final List<String> names=getAllContactNames();
        mContactsAt = (AutoCompleteTextView) findViewById(R.id.at_Contacts);
        mContactsAt.setAdapter(new ArrayAdapter<String>(getApplicationContext(), R.layout.single_contact, R.id.tv_ContactName, names));
        mContactsAt.setOnItemClickListener(
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
                        Toast.makeText(getApplicationContext(), "" + numbers.get(pos), Toast.LENGTH_LONG).show();
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
