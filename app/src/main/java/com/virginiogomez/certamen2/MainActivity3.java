package com.virginiogomez.certamen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnGoToMainActivity2 = findViewById(R.id.button3);
        btnGoToMainActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent para ir a MainActivity2
                Intent intent = new Intent(MainActivity3.this, MainActivity1.class);
                startActivity(intent);
            }
        });
    }
}

