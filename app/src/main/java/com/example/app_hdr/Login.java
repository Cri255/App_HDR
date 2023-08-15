package com.example.app_hdr;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private dbHDR databaseHelper;
    private Metodos metodos;
    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//-------------------------------------------------------------------------------------------------

        //Icono clase
        //Codigo del icono para acceder a la video
        ImageView iconImageView = findViewById(R.id.derecha);
        iconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Código para iniciar la nueva Activity
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });

//-------------------------------------------------------------------------------------------------

        user = findViewById(R.id.campo_usuario);
        pass = findViewById(R.id.campo_contrasena);
        databaseHelper = new dbHDR(this);
        metodos = new Metodos(this);
        metodos.insertAdmin("admin", "1234");

        Button btnIngresar = findViewById(R.id.btn_ingresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = user.getText().toString();
                String contraseña = pass.getText().toString();

                if (validateLogin(usuario, contraseña)) {
                    startMenuAdminActivity();
                } else {
                    showToast("Credenciales incorrectas");
                }
            }
        });
    }

    private void startMenuAdminActivity() {
        Intent intent = new Intent(Login.this, Menu_Admin.class);
        startActivity(intent);
        finish();
    }

    private void showToast(String message) {
        Toast.makeText(Login.this, message, Toast.LENGTH_SHORT).show();
    }

    public boolean validateLogin(String username, String password) {
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        String[] columns = {"username"};
        String selection = "username = ? AND password = ?";
        String[] selectionArgs = {username, password};
        Cursor cursor = db.query("users", columns, selection, selectionArgs, null, null, null);
        int count = cursor.getCount();
        cursor.close();
        return count > 0;
    }

}
