package com.example.app_hdr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);


        //Icono clase
        //Codigo del icono para acceder a la clase
        ImageView iconImageView = findViewById(R.id.claseadmin);
        iconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Código para iniciar la nueva Activity
                Intent intent = new Intent(Menu_Admin.this, Tematica_Clase_Admin.class);
                startActivity(intent);
            }
        });


        // corchetes del proyecto
    }
}