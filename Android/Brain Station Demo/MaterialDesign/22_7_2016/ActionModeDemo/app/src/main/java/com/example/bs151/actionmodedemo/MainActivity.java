package com.example.bs151.actionmodedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    boolean is_in_action_mode;
    TextView counterTextView;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    int[] image_id = {R.drawable.ashraful, R.drawable.mahmudullah, R.drawable.mashrafee, R.drawable.abuhider, R.drawable.arafatsunny, R.drawable.liton, R.drawable.mushfick, R.drawable.sabbir, R.drawable.sakib, R.drawable.taskin};
    Toolbar toolbar;
    String[] names, roles, phones;
    ArrayList<Player> pLayers = new ArrayList<Player>();
    ArrayList<Player> selectionList = new ArrayList<Player>();
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTextView = (TextView) findViewById(R.id.counterText);
        counterTextView.setVisibility(View.GONE);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        names = getResources().getStringArray(R.array.player_name);
        roles = getResources().getStringArray(R.array.player_role);
        int i = 0;
        for (String name : names) {
            Player pLayer = new Player(image_id[i], name, roles[i]);
            pLayers.add(pLayer);
            i++;
        }
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new RecyclerAdapter(pLayers, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    @Override
    public boolean onLongClick(View view) {
        toolbar.getMenu().clear();
        toolbar.inflateMenu(R.menu.menu_action_mode);
        counterTextView.setVisibility(View.VISIBLE);
        is_in_action_mode = true;
        adapter.notifyDataSetChanged();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        return true;
    }

    public void PrepareSelection(View view, int position) {
        if (((CheckBox) view).isChecked()) {
            selectionList.add(pLayers.get(position));
            counter++;
            updateCounter(counter);
        } else {
            selectionList.remove(pLayers.get(position));
            counter--;
            updateCounter(counter);
        }
    }

    public void updateCounter(int counter) {
        if (counter == 0) {
            counterTextView.setText("0 item selected");
        } else {
            counterTextView.setText(counter + " items selected");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_delete) {
            RecyclerAdapter newAdapter = (RecyclerAdapter) adapter;
            newAdapter.updateAdapter(selectionList);
            clearActionMode();
        }
        else if(item.getItemId()==android.R.id.home){
            clearActionMode();
            adapter.notifyDataSetChanged();
        }
        return true;
    }

    public void clearActionMode(){
        is_in_action_mode=false;
        toolbar.getMenu().clear();
        toolbar.inflateMenu(R.menu.menu_activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        counterTextView.setVisibility(View.GONE);
        counterTextView.setText("0 item selected");
        counter=0;
        selectionList.clear();
    }


    @Override
    public void onBackPressed() {
        if(is_in_action_mode){
            clearActionMode();
            adapter.notifyDataSetChanged();
        }else{
            super.onBackPressed();
        }
    }
}
