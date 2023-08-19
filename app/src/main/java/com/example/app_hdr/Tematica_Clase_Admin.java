package com.example.app_hdr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.app_hdr.Adaptador.Adaptador;

import java.util.ArrayList;
import java.util.List;

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

        List<String> listaDeDatos = new ArrayList<>();
        listaDeDatos.add("La palabra de Dios es");
        listaDeDatos.add("Los evangelios");
        listaDeDatos.add("Los profetas menores");


        RecyclerView recyclerView = findViewById(R.id.recycler);
        Adaptador adaptador = new Adaptador(listaDeDatos); // Reemplaza "listaDeDatos" con tus propios datos
        recyclerView.setAdapter(adaptador);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Puedes cambiar el LinearLayoutManager por otros tipos de diseño



        //Corchetes del proyecto
    }
}