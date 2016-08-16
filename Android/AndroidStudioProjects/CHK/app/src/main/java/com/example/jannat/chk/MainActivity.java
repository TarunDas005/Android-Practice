package com.example.jannat.chk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //SimUtil.sendSMS(this, 0, "+8801957956805", null, "Hi Stackoverflow! its me Maher. Sent by sim1", null, null);
        //SimUtil.sendSMS(this,1,"+8801957956805",null,"Hi Stackoverflow! its me Maher. Sent by sim2",null,null);

//        TelephonyManager telephonyManager=(TelephonyManager) getSystemService(TELEPHONY_SERVICE);
//        Toast.makeText(getApplicationContext(),telephonyManager.getSimOperatorName(),Toast.LENGTH_LONG).show();


        List<SimInfo> simInfos=getSIMInfo(getApplicationContext());
        for(SimInfo simInfo: simInfos){
            if(simInfo.getSlot()==0 || simInfo.getSlot()==1)
                Toast.makeText(getApplicationContext(),simInfo.toString(),Toast.LENGTH_LONG).show();
        }
    }

    public static List<SimInfo> getSIMInfo(Context context) {
        List<SimInfo> simInfoList = new ArrayList<>();
        Uri URI_TELEPHONY = Uri.parse("content://telephony/siminfo/");
        Cursor c = context.getContentResolver().query(URI_TELEPHONY, null, null, null, null);
        if (c.moveToFirst()) {
            do {
                int id = c.getInt(c.getColumnIndex("_id"));
                int slot = c.getInt(c.getColumnIndex("slot"));
                String display_name = c.getString(c.getColumnIndex("display_name"));
                String icc_id = c.getString(c.getColumnIndex("icc_id"));
                SimInfo simInfo = new SimInfo(id, display_name, icc_id, slot);
                Log.d("apipas_sim_info", simInfo.toString());
                simInfoList.add(simInfo);
            } while (c.moveToNext());
        }
        c.close();

        return simInfoList;
    }
}
