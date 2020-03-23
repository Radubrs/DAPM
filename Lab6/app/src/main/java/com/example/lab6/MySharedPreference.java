package com.example.lab6;


import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    SharedPreferences settings;
    SharedPreferences.Editor editor;
    public MySharedPreference(Context context) {
        settings = context.getSharedPreferences("data", 0);
        editor = settings.edit();
    }
    public void save(String text) {
        editor.putString("data", text); // Storing string
        editor.commit(); // commit changes
    }
    public String getValue(){
        return settings.getString("data", null); // getting String

    }
    public void clearSharedPreferences() {
        editor.remove("data"); // will delete key name
        editor.commit(); // commit changes
    }
}