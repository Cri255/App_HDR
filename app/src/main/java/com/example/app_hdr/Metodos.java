package com.example.app_hdr;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class Metodos {
    Context c;

    public Metodos(Context c) {
        this.c = c;
    }

    public void insertAdmin(String user, String pass) {
        try {
            dbHDR databaseHelper = new dbHDR(c);
            SQLiteDatabase db = databaseHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("username", user);
            values.put("password", pass);

            db.insert("users", null, values);
            db.close();

        } catch (Exception ex) {
            Log.e("InsertAdmin", "An error occurred: " + ex.toString());
            ex.printStackTrace(); // Print the exception details for debugging
        }
    }
}
