package com.example.jannat.addressfromlatlong;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView txtLattitude, txtLongitude, txtProvider, txtAccuracy;
    TextView txtAddress,txtCity,txtState,txtCountry,txtPostal,txtKnownName;
    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLattitude = (TextView) findViewById(R.id.txtLattitude);
        txtLongitude = (TextView) findViewById(R.id.txtLongitude);
        txtAccuracy = (TextView) findViewById(R.id.txtAccuracy);
        txtProvider = (TextView) findViewById(R.id.txtProvider);

        txtAddress= (TextView) findViewById(R.id.addressTextView);
        txtCity= (TextView) findViewById(R.id.cityTextView);
        txtCountry= (TextView) findViewById(R.id.countryTextView);
        txtState= (TextView) findViewById(R.id.stateTextView);
        txtPostal= (TextView) findViewById(R.id.postalCodeTextView);
        txtKnownName= (TextView) findViewById(R.id.knownNameTextView);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
    }

    @Override
    protected void onStart() {
        super.onStart();
        boolean gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if (!gpsEnabled) {
            Toast.makeText(getApplicationContext(), "Please Enabled GPS", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        setup();
    }

    public void setup() {
        Location gpsLocation = null;
        Location networkLocation = null;

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        locationManager.removeUpdates(listener);
        gpsLocation = requestUpdateFromProvider(LocationManager.GPS_PROVIDER);
        networkLocation = requestUpdateFromProvider(LocationManager.NETWORK_PROVIDER);

        if (gpsLocation != null && networkLocation != null) {
            //find better one
            Location myLocation = getBetterLocation(gpsLocation, networkLocation);
            setValuesinUI(myLocation);
        } else if (gpsLocation != null) {
            //use gpsLocation
            setValuesinUI(gpsLocation);
        } else if (networkLocation != null) {
            //use networkLocation
            setValuesinUI(networkLocation);
        } else {
            //no data
            txtLattitude.setText("No data available ");
            txtLongitude.setText("No data available");
            txtAccuracy.setText("No data available");
            txtProvider.setText("No data available");
        }
    }

    private void setValuesinUI(Location loc) {
        List<Address> addresses=getAddress(loc);


        if(addresses!=null){
            txtLattitude.setText("Lattitude: " + loc.getLatitude());
            txtLongitude.setText("Longitude: " + loc.getLongitude());
            txtAccuracy.setText("Accuracy: " + loc.getAccuracy());
            txtProvider.setText("Provider: " + loc.getProvider());
            txtAddress.setText("Address Name: "+addresses.get(0).getAddressLine(0));
            txtCity.setText("City Name: "+addresses.get(0).getLocality());
            txtCountry.setText("Country Name: "+addresses.get(0).getCountryName());
            txtPostal.setText("Postal code: "+addresses.get(0).getPostalCode());
            txtState.setText("State Name: "+addresses.get(0).getAdminArea());
            txtKnownName.setText("Known Name: "+addresses.get(0).getFeatureName());
        }
    }

    private Location getBetterLocation(Location newLocation, Location currentBestLocation) {
        if(currentBestLocation==null){
            return newLocation;
        }
        long timeDelta=newLocation.getTime()-currentBestLocation.getTime();
        boolean isSignificantlyNewer=timeDelta > 60000;
        boolean isSignificantlyOlder=timeDelta < 60000;
        boolean isNewer= timeDelta>0;

        if(isSignificantlyNewer){
            return newLocation;
        }else if(isSignificantlyOlder){
            return currentBestLocation;
        }

        int accracyDelta= (int) (newLocation.getAccuracy()-currentBestLocation.getAccuracy());
        boolean isLessAccurate=accracyDelta > 0;
        boolean isMoreAccurate= accracyDelta < 0;

        if(isMoreAccurate){
            return newLocation;
        }else if(isNewer && !isLessAccurate){
            return newLocation;
        }
        return currentBestLocation;
    }

    private Location requestUpdateFromProvider(String provider) {
        Location location = null;
        if (locationManager.isProviderEnabled(provider)) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.

            }
            locationManager.requestLocationUpdates(provider, 1000, 10, listener);
            location = locationManager.getLastKnownLocation(provider);
        } else {
            Toast.makeText(getApplicationContext(), provider + " is not enables", Toast.LENGTH_LONG).show();
        }
        return location;
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        locationManager.removeUpdates(listener);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    LocationListener listener=new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            setValuesinUI(location);
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };


    public List<Address> getAddress(Location location){
        Geocoder geocoder;
        List<Address> addresses=null;
        geocoder = new Geocoder(MainActivity.this, Locale.getDefault());
        try{
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            addresses = geocoder.getFromLocation(latitude,longitude, 1);
            String address = addresses.get(0).getAddressLine(0);
            String city = addresses.get(0).getLocality();
            String state = addresses.get(0).getAdminArea();
            String country = addresses.get(0).getCountryName();
            String postalCode = addresses.get(0).getPostalCode();
            String knownName = addresses.get(0).getFeatureName();
            return addresses;
        }catch (IOException e){

        }
        return null;
    }
}
