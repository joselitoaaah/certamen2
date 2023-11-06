package com.virginiogomez.certamen2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class activity_main2 extends AppCompatActivity {
    private ImageView[] imageViews;
    private EditText searchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageViews = new ImageView[6];
        imageViews[0] = findViewById(R.id.imageView1);
        // Agrega el resto de ImageView aquí

        searchEditText = findViewById(R.id.searchEditText);

        // Configura los clics en el botón de búsqueda
        findViewById(R.id.searchButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String keyword = searchEditText.getText().toString();
                // Realiza la búsqueda y actualiza las imágenes según la palabra clave
                // Puedes mostrar resultados o cambiar las imágenes según los resultados.
                Toast.makeText(activity_main2.this, "Búsqueda por palabra clave: " + keyword, Toast.LENGTH_SHORT).show();
            }
        });
    }
}