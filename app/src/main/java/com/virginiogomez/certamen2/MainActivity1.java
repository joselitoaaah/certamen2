package com.virginiogomez.certamen2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnGoToActivity3 = findViewById(R.id.button);
        btnGoToActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear una intención para abrir Activity3
                Intent intent = new Intent(MainActivity1.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}