package com.example.app_hdr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Codigo redireccionar a los diversos activitys
//----------------------------------------------------------------------------------------------------------------
        //Icono clase
        //Codigo del icono para acceder a la clase
        ImageView iconImageView = findViewById(R.id.img_clase);
        iconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Código para iniciar la nueva Activity
                Intent intent = new Intent(Menu.this, Clases.class);
                startActivity(intent);
            }
        });
//----------------------------------------------------------------------------------------------------------------
                //Icono Manualidad
                ImageView iconImageView2 = findViewById(R.id.img_manualidad);
                iconImageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Código para iniciar la nueva Activity
                        Intent intent = new Intent(Menu.this, Manualidad.class);
                        startActivity(intent);
                    }
                });
//----------------------------------------------------------------------------------------------------------------
                        //Icono Profesores
                        ImageView iconImageView3 = findViewById(R.id.img_profesor);
                        iconImageView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Código para iniciar la nueva Activity
                                Intent intent = new Intent(Menu.this, Profesores.class);
                                startActivity(intent);
                            }
                        });
//----------------------------------------------------------------------------------------------------------------
                                //Icono Niños
                                ImageView iconImageView4 = findViewById(R.id.img_ninos);
                                iconImageView4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        // Código para iniciar la nueva Activity
                                        Intent intent = new Intent(Menu.this, ninos.class);
                                        startActivity(intent);
                                    }
                                });
//----------------------------------------------------------------------------------------------------------------
                                        //Icono Actividades
                                        ImageView iconImageView5 = findViewById(R.id.img_actividades);
                                        iconImageView5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                // Código para iniciar la nueva Activity
                                                Intent intent = new Intent(Menu.this, Actividades.class);
                                                startActivity(intent);
                                            }
                                        });
//----------------------------------------------------------------------------------------------------------------
                                                //Icono Pez
                                                ImageView iconImageView6 = findViewById(R.id.img_pez);
                                                iconImageView6.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        // Código para iniciar la nueva Activity
                                                        Intent intent = new Intent(Menu.this, Pez.class);
                                                        startActivity(intent);
                                                    }
                                                });
//----------------------------------------------------------------------------------------------------------------
                                                                //Icono flecha
                                                                ImageView iconImageView7 = findViewById(R.id.flecha);
                                                                iconImageView7.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        // Código para iniciar la nueva Activity
                                                                        Intent intent = new Intent(Menu.this, MainActivity.class);
                                                                        startActivity(intent);
                                                                    }
                                                                });


        //Corchetes del proyecto
            }
        }

