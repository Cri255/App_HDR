package com.example.app_hdr;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //Asignación de Variables
    Button siguiente;
    private VideoView videoView;

//------------------------------------------------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                              //Todo el codigo debe de ir debajo de este comentario


//------------------------------------------------------------------------------------------------------------------------------------

        //Codigo para el video de fondo pagina principal
        videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_principal);
        videoView.start();
        videoView.setOnCompletionListener(mp -> {videoView.start(); // Reinicia la reproducción cuando el video llega al final
        });

//------------------------------------------------------------------------------------------------------------------------------------

        //Codigo para el boton siguiente

        //Codigo tiempo de invisivilidad
        siguiente= findViewById(R.id.siguiente);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                siguiente.setVisibility(View.VISIBLE); // Mostrar el botón después de cierto tiempo
            }
        }, 5000); // Mostrar el botón después de 5000 milisegundos (5 segundos)

    //Codigo Onclick

        siguiente = (Button) findViewById(R.id.siguiente);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Código para iniciar la nueva Activity
                Intent i = new Intent(MainActivity.this, Menu.class);
                startActivity(i);

            }
        });

//------------------------------------------------------------------------------------------------------------------------------------

        //Codigo del icono para acceder al login
        ImageView iconImageView = findViewById(R.id.Candado);
        iconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Código para iniciar la nueva Activity
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

//------------------------------------------------------------------------------------------------------------------------------------
        }

    }
