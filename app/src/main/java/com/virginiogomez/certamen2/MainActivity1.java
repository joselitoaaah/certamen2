package com.virginiogomez.certamen2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    private String latitud1, longitud1, latitud2, longitud2, latitud3, longitud3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void saveCoordinates(View view) {
        // Obtén referencias a los EditText
        EditText editTextCoord1 = findViewById(R.id.editTextCoord1);
        EditText editTextCoord2 = findViewById(R.id.editTextCoord2);
        EditText editTextCoord3 = findViewById(R.id.editTextCoord3);

        // Obtén los textos ingresados
        String coord1 = editTextCoord1.getText().toString();
        String coord2 = editTextCoord2.getText().toString();
        String coord3 = editTextCoord3.getText().toString();

        // Utiliza la función split para separar latitud y longitud
        String[] coords1 = coord1.split(",");
        String[] coords2 = coord2.split(",");
        String[] coords3 = coord3.split(",");

        // Verifica si se ingresaron suficientes valores
        if (coords1.length == 2 && coords2.length == 2 && coords3.length == 2) {
            // Guarda los valores en las variables correspondientes
            latitud1 = coords1[0].trim();
            longitud1 = coords1[1].trim();

            latitud2 = coords2[0].trim();
            longitud2 = coords2[1].trim();

            latitud3 = coords3[0].trim();
            longitud3 = coords3[1].trim();

            // Puedes hacer lo que quieras con las variables guardadas
            // Por ejemplo, mostrarlas en un Toast
            Toast.makeText(this, "Coordenadas 1: Latitud=" + latitud1 + ", Longitud=" + longitud1, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Coordenadas 2: Latitud=" + latitud2 + ", Longitud=" + longitud2, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Coordenadas 3: Latitud=" + latitud3 + ", Longitud=" + longitud3, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Formato incorrecto. Ingresa latitud, longitud separados por coma.", Toast.LENGTH_SHORT).show();
        }

        Intent intent=new Intent(this, MapsActivity.class);
        intent.putExtra("LATITUD_1", latitud1);
        intent.putExtra("LONGITUD_1", longitud1);
        intent.putExtra("LATITUD_2", latitud2);
        intent.putExtra("LONGITUD_2", longitud2);
        intent.putExtra("LATITUD_3", latitud3);
        intent.putExtra("LONGITUD_3", longitud3);
        startActivity(intent);
    }

}

/*public class MainActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnGoToActivity3 = findViewById(R.id.button);
        btnGoToActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity1.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}*/