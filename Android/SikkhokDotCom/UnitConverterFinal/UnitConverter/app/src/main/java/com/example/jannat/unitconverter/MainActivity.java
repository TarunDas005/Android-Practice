package com.example.jannat.unitconverter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Spinner conversionTypeSpinner,fromSpinner,toSpinner;
    private EditText fromTextField,toTextField;
    private static final int REQUEST_CODE_FOR_CALCULATOR=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setVisibility(View.GONE);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.GONE);
        conversionTypeSpinner= (Spinner) findViewById(R.id.conversionTypeSpinner);
        fromSpinner=(Spinner) findViewById(R.id.fromSpinner);
        toSpinner=(Spinner) findViewById(R.id.toSpinner);
        fromTextField= (EditText) findViewById(R.id.fromTextField);
        toTextField= (EditText) findViewById(R.id.toTextField);
        addConversionType();
        addFromAndToSpinner();
        fromTextField.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        toTextField.setText("");
                        Intent intent = new Intent(MainActivity.this, MyCalculator.class);
                        startActivityForResult(intent, REQUEST_CODE_FOR_CALCULATOR);
                    }
                }
        );

        conversionTypeSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, final View view, int position, long id) {
                        if (view != null) {
                            HashMap<String, ArrayList<String>> map = createList();
                            ArrayList<String> namesForSpinner = new ArrayList<String>();
                            String name = (String) conversionTypeSpinner.getSelectedItem().toString();
                            for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
                                String keyName = entry.getKey();
                                if (keyName.equals(name)) {
                                    for (String value : entry.getValue()) {
                                        namesForSpinner.add(value);
                                    }
                                    fromSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, namesForSpinner));
                                    toSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, namesForSpinner));
                                }
                            }
                        }

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==REQUEST_CODE_FOR_CALCULATOR){
            if(resultCode==RESULT_OK){
                String number=data.getStringExtra("number");
                fromTextField.setText(number);
            }
            else{
                //Log.e("Mainactivity", "Sub-Activity Canceled");
            }
        }
    }

    public void addFromAndToSpinner(){
        HashMap<String, ArrayList<String>> map = createList();
        ArrayList<String> namesForFromSpinner = new ArrayList<String>();
        String name = (String) conversionTypeSpinner.getSelectedItem().toString();
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            String keyName = entry.getKey();
            if (keyName.equals(name)) {
                for (String value : entry.getValue()) {
                    namesForFromSpinner.add(value);
                }
                fromSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, namesForFromSpinner));
                toSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, namesForFromSpinner));
            }
        }
    }

    public void addConversionType(){
//        HashMap<String,ArrayList<String>> map = createList();
//        ArrayList<String> nameForSpinnerConversionType=new ArrayList<String>();
//        for(Map.Entry<String,ArrayList<String>> entry:map.entrySet()){
//            String name=entry.getKey();
//            nameForSpinnerConversionType.add(name);
//        }
//        conversionTypeSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, nameForSpinnerConversionType));

        List keyMap=sortedMap();
        conversionTypeSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, (ArrayList<String>) keyMap));
    }

    public HashMap<String,ArrayList<String>> createList(){
        HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
        ArrayList<String> names=new ArrayList<String>();
        names.add("Square kilometer");
        names.add("Square meter");
        names.add("Square mile");
        names.add("Square yard");
        names.add("Square foot");
        names.add("Square inch");
        names.add("Hactare");
        names.add("Acre");
        map.put("Area", names);
        names=new ArrayList<String>();
        names.add("Celcius");
        names.add("Farenheit");
        names.add("Kelvin");
        map.put("Temperature", names);
        names=new ArrayList<String>();
        names.add("Bit Per Second");
        names.add("Kilobit Per Second");
        names.add("Kilobyte Per Second");
        names.add("Kibibit Per Second");
        names.add("Megabit Per Second");
        names.add("Megabyte Per Second");
        names.add("Mebibit Per Second");
        names.add("Gigabit Per Second");
        names.add("Gigabyte Per Second");
        names.add("Gibibit Per Second");
        names.add("Terabit Per Second");
        names.add("Terabye Per Second");
        names.add("Tebibit Per Second");
        map.put("Data Tranfer Rate", names);


        names=new ArrayList<String>();
        names.add("Bit");
        names.add("Kilobit");
        names.add("Kibibit");
        names.add("Megabit");
        names.add("Mebibit");
        names.add("Gigabit");
        names.add("Gibibit");
        names.add("Terabit");
        names.add("Tebibit");
        names.add("Petabit");
        names.add("Pebibit");
        names.add("Byte");
        names.add("Kilobyte");
        names.add("Kibibyte");
        names.add("Megabyte");
        names.add("Mebibyte");
        names.add("Gigabyte");
        names.add("Gibibyte");
        names.add("Terabyte");
        names.add("Tebibyte");
        names.add("Petabyte");
        names.add("Pebibyte");
        map.put("Digital Storage", names);


        names=new ArrayList<String>();
        names.add("Joule");
        names.add("Kilojoule");
        names.add("Gram calorie");
        names.add("Kilocalorie");
        names.add("Watt hour");
        names.add("Kilowatt hour");
        names.add("British thermal unit");
        names.add("US therm");
        names.add("Foot-pound");
        map.put("Energy", names);


        names=new ArrayList<String>();
        names.add("Hertz");
        names.add("Kilohertz");
        names.add("Megahertz");
        names.add("Gigahertz");
        map.put("Frequency", names);


        names=new ArrayList<String>();
        names.add("US Miles per gallon");
        names.add("Miles per gallon (Imperial)");
        names.add("Kilometer per liter");
        names.add("Liter per 100 kilometers");
        map.put("Fuel Economy", names);


        names=new ArrayList<String>();
        names.add("Kilometer");
        names.add("Meter");
        names.add("Centimeter");
        names.add("Millimeter");
        names.add("Micrometer");
        names.add("Nanometer");
        names.add("Mile");
        names.add("Yard");
        names.add("Foot");
        names.add("Inch");
        names.add("Nautical mile");
        map.put("Length", names);


        names=new ArrayList<String>();
        names.add("Metric Ton");
        names.add("Kilogram");
        names.add("Gram");
        names.add("Milligram");
        names.add("Microgram");
        names.add("Imperial Ton");
        names.add("US Ton");
        names.add("Stone");
        names.add("Pound");
        names.add("Ounce");
        map.put("Mass", names);


        names=new ArrayList<String>();
        names.add("Angular mil");
        names.add("Degree");
        names.add("Gradian");
        names.add("Minute of arc");
        names.add("Radian");
        names.add("Second of arc");
        map.put("Plane Angle", names);


        names=new ArrayList<String>();
        names.add("Atmosphere");
        names.add("Bar");
        names.add("Pascal");
        names.add("Pound-force/square inch");
        names.add("Torr");
        map.put("Pressure", names);


        names=new ArrayList<String>();
        names.add("Miles per hour");
        names.add("Foot per second");
        names.add("Meter per second");
        names.add("Kilometer per hour");
        names.add("Knot");
        map.put("Speed", names);


        names=new ArrayList<String>();
        names.add("Nanosecond");
        names.add("Microsecond");
        names.add("Millisecond");
        names.add("Second");
        names.add("Minute");
        names.add("Hour");
        names.add("Day");
        names.add("Week");
        names.add("Month");
        names.add("Year");
        names.add("Decade");
        names.add("Century");
        map.put("Time", names);

        names=new ArrayList<String>();
        names.add("US liquid gallon");
        names.add("US liquid quart");
        names.add("US liquid pint");
        names.add("US legal cup");
        names.add("US fluid ounce");
        names.add("US tablespoon");
        names.add("US teaspoon");
        names.add("Cubic meter");
        names.add("Liter");
        names.add("Milliliter");
        names.add("Imperial gallon");
        names.add("Imperial quart");
        names.add("Imperial pint");
        names.add("Imperial cup");
        names.add("Imperial fluid ounce");
        names.add("Imperial tablespoon");
        names.add("Imperial teaspoon");
        names.add("Cubic foot");
        names.add("Cubic inch");
        map.put("Volume", names);


        return map;
    }


    public List sortedMap(){
        HashMap<String,ArrayList<String>> map=createList();
        List sortedKeys=new ArrayList(map.keySet());
        Collections.sort(sortedKeys);
        return sortedKeys;
    }

    public void swapButtonClicked(View view){
        toTextField.setText("");
        int spinner1Index = fromSpinner.getSelectedItemPosition();
        fromSpinner.setSelection(toSpinner.getSelectedItemPosition());
        toSpinner.setSelection(spinner1Index );
    }

    public void ClearButtonClick(View view){
        fromTextField.setText("");
        toTextField.setText("");
        ArrayList<String> clearSpinner = new ArrayList<String>();
        conversionTypeSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, clearSpinner));
        fromSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, clearSpinner));
        toSpinner.setAdapter(new CustomAdapter(MainActivity.this, R.layout.spinner_design_layout, clearSpinner));
        addConversionType();
        addFromAndToSpinner();

    }

    public void convertButtonClick(View view){
        String conversionType=conversionTypeSpinner.getSelectedItem().toString();
        String fromType=fromSpinner.getSelectedItem().toString();
        String toType=toSpinner.getSelectedItem().toString();
        String value=fromTextField.getText().toString();
        if(value.equals("")){
            Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_LONG).show();
        }else{
            Conversion conversion=new Conversion();
            if(conversionType.equals("Temperature")){
                float result=conversion.temperature(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Area")){
                float result=conversion.area(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Data Tranfer Rate")){
                float result=conversion.dataTransfer(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Digital Storage")){
                float result=conversion.digitalStorage(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Energy")){
                float result=conversion.energy(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Frequency")){
                float result=conversion.frequency(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Fuel Economy")){
                float result=conversion.fuelEconomy(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Length")){
                float result=conversion.lengthFunc(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Mass")){
                float result=conversion.mass(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Plane Angle")){
                float result=conversion.planeAngle(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Pressure")){
                float result=conversion.pressure(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Speed")){
                float result=conversion.speed(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Time")){
                float result=conversion.timeFunc(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
            else if(conversionType.equals("Volume")){
                float result=conversion.volume(fromType, toType, value);
                toTextField.setText(String.valueOf(result));
            }
        }
    }

    public class CustomAdapter extends ArrayAdapter<String>{

        ArrayList<String> mLs;
        Context mContext;

        public CustomAdapter(Context context, int resource, ArrayList<String> list) {
            super(context, resource);
            mLs=list;
            mContext=context;
        }
        @Override
        public int getCount() {
            return mLs.size();//return total number Of Object in this list
        }

        @Override
        public String getItem(int position) {
            return mLs.get(position);
        }
        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater=getLayoutInflater();
            View mySpinnerView=inflater.inflate(R.layout.spinner_design_layout, parent, false);
            TextView textView=(TextView)mySpinnerView.findViewById(R.id.spinnerTextView);
            String name=(String)mLs.get(position);
            textView.setText(name);
            return mySpinnerView;
        }
    }

}
