package com.example.jannat.androidfragmentmanagerandbackstack;

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
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener{
    FragmentManager manager;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
        text= (TextView) findViewById(R.id.message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        manager.addOnBackStackChangedListener(this);
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
        transaction.addToBackStack("addA");
        transaction.commit();
    }

    public void removeA(View view){
        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("FragmentA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null){
            transaction.remove(fragmentA);
            transaction.addToBackStack("removeA");
            transaction.commit();
        }else{
            Toast.makeText(getApplicationContext(), "Fragment A not added", Toast.LENGTH_LONG).show();
        }
    }
    public void replaceAwithB(View view){
        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.group, fragmentB, "FragmentB");
        transaction.addToBackStack("replaceAwithB");
        transaction.commit();
    }
    public void addB(View view){
        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.group, fragmentB, "FragmentB");
        transaction.addToBackStack("addB");
        transaction.commit();
    }
    public void removeB(View view){
        FragmentB fragmentB= (FragmentB) manager.findFragmentByTag("FragmentB");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentB!=null){
            transaction.remove(fragmentB);
            transaction.addToBackStack("removeB");
            transaction.commit();
        }else{
            Toast.makeText(getApplicationContext(),"Fragment B not added",Toast.LENGTH_LONG).show();
        }
    }
    public void replaceBwithA(View view){
        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.group,fragmentA,"FragmentA");
        transaction.addToBackStack("replaceBwithA");
        transaction.commit();
    }
    public void attachA(View view){
        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("FragmentA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null){
            transaction.attach(fragmentA);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }
    }
    public void detachA(View view){
        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("FragmentA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null){
            transaction.detach(fragmentA);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }
    }

    public void back(View view){
        manager.popBackStack();
    }

    public void popAddB(View view){
        manager.popBackStack("addB",0);
        //manager.popBackStack("addB",FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
    @Override
    public void onBackPressed() {
        //FragmentManager fm = getFragmentManager();
        if (manager.getBackStackEntryCount() > 0) {
            manager.popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onBackStackChanged() {
        text.setText(text.getText()+"\n");
        text.setText(text.getText()+"The current status of the back stack");
        int count=manager.getBackStackEntryCount();
        for(int i=count-1;i>=0;i--){
            FragmentManager.BackStackEntry entry=manager.getBackStackEntryAt(i);
            text.setText(text.getText()+" \n"+entry.getName()+" \n");
        }
        text.setText(text.getText()+"\n");
    }
}
