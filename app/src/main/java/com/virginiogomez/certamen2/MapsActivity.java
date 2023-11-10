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
        LatLng Unach03 = new LatLng(-36.589673,-72.082447);
        mMap.addMarker(new MarkerOptions().position(Unach03).title("IPVG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Unach03));
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
            double latitud2 = Double.parseDouble(intent.getStringExtra("LATITUD_2"));
            double longitud2 = Double.parseDouble(intent.getStringExtra("LONGITUD_2"));
            double latitud3 = Double.parseDouble(intent.getStringExtra("LATITUD_3"));
            double longitud3 = Double.parseDouble(intent.getStringExtra("LONGITUD_3"));

            // Haz lo que quieras con las coordenadas en MapsActivity


            LatLng cords1 = new LatLng(latitud1, longitud1);
            LatLng cords2 = new LatLng(latitud2, longitud2);
            LatLng cords3 = new LatLng(latitud3, longitud3);







            mMap.addMarker(new MarkerOptions().position(cords1).title("coordenadas 1"));
            mMap.addMarker(new MarkerOptions().position(cords2).title("coordenadas 2"));
            mMap.addMarker(new MarkerOptions().position(cords3).title("coordenadas 3"));
            mMap.setMinZoomPreference(10.0f);
            mMap.setMaxZoomPreference(50.0f);
        }
}
}


