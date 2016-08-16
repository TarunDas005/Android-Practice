package com.example.jannat.fragmentpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements MiddleSectionFragment.MiddleSectionListner {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CreateMeme(String lastName){
        TopSectionFragment topSectionFragment=(TopSectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        String firstName=topSectionFragment.getFirstName();
        BottomSectionFragment bottomSectionFragment=(BottomSectionFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomSectionFragment.setAllText(firstName,lastName);
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
}
