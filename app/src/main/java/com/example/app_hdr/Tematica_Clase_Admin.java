package com.example.app_hdr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tematica_Clase_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tematica_clase_admin);

//-------------------------------------------------------------------------------------------------------------------------

        //ActionBar
        //Codigo del icono para acceder a colocarle nombre al Card View (tematica)
        ImageView iconImageView = findViewById(R.id.agg);
        iconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Código para iniciar la nueva Activity
                Intent intent = new Intent(Tematica_Clase_Admin.this, Add_Tematica_Admin.class);
                startActivity(intent);
            }
        });



        //Corchetes del proyecto
    }
}