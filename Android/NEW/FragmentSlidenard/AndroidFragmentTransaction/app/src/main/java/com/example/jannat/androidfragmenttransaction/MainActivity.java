package com.example.jannat.androidfragmenttransaction;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void addA(View view){
        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.group,fragmentA,"FragmentA");
        transaction.commit();
    }

    public void removeA(View view){
        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("FragmentA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null){
            transaction.remove(fragmentA);
            transaction.commit();
        }else{
            Toast.makeText(getApplicationContext(),"Fragment A not added",Toast.LENGTH_LONG).show();
        }
    }
    public void replaceAwithB(View view){
        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.group, fragmentB, "FragmentB");
        transaction.commit();
    }
    public void addB(View view){
        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.group,fragmentB,"FragmentB");
        transaction.commit();
    }
    public void removeB(View view){
        FragmentB fragmentB= (FragmentB) manager.findFragmentByTag("FragmentB");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentB!=null){
            transaction.remove(fragmentB);
            transaction.commit();
        }else{
            Toast.makeText(getApplicationContext(),"Fragment B not added",Toast.LENGTH_LONG).show();
        }
    }
    public void replaceBwithA(View view){
        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.group,fragmentA,"FragmentA");
        transaction.commit();
    }
    public void attachA(View view){
        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("FragmentA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null){
            transaction.attach(fragmentA);
            transaction.commit();
        }
    }
    public void detachA(View view){
        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("FragmentA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null){
            transaction.detach(fragmentA);
            transaction.commit();
        }
    }

}
