package com.virginiogomez.certamen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    // Duración del SplashScreen en milisegundos
    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Utiliza un Handler para retrasar la navegación a la pantalla principal
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crea un Intent para ir a la pantalla principal
                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(intent);

                // Cierra esta actividad para evitar que el usuario regrese al SplashScreen al presionar "Atrás"
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}