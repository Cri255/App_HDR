package com.example.app_hdr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Add_Tematica_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tematica_admin);


        Entidad instanciaEntidad = new Entidad(); // Crear una instancia de Entidad
        String textoDesdeEntidad = instanciaEntidad.getGuardartexto(); // Acceder a la variable de Entidad

    }
}