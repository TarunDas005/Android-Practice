package com.example.bs151.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id=item.getItemId();
        switch (res_id){
            case R.id.action_search:
                Toast.makeText(getApplicationContext(),"Search",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_setting:
                Toast.makeText(getApplicationContext(),"Setting",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_share:
                Toast.makeText(getApplicationContext(),"Share",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_contact_us:
                Toast.makeText(getApplicationContext(),"Contact us",Toast.LENGTH_LONG).show();
                break;

        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return true;
    }
}
