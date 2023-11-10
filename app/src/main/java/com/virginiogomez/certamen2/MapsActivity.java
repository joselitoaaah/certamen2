package com.virginiogomez.certamen2;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.virginiogomez.certamen2.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    private GoogleMap mMap;
    private ActivityMapsBinding binding;



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Puedes obtener los datos pasados desde MainActivity usando getIntent
        Intent intent = getIntent();
        if (intent != null) {
            double latitud1 = Double.parseDouble(intent.getStringExtra("LATITUD_1"));
            double longitud1 = Double.parseDouble(intent.getStringExtra("LONGITUD_1"));
            String latitud2 = intent.getStringExtra("LATITUD_2");
            String longitud2 = intent.getStringExtra("LONGITUD_2");
            String latitud3 = intent.getStringExtra("LATITUD_3");
            String longitud3 = intent.getStringExtra("LONGITUD_3");

            // Haz lo que quieras con las coordenadas en MapsActivity
            LatLng sydney = new LatLng(latitud1, longitud1);
        }
}
}


