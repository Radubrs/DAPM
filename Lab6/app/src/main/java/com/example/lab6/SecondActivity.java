package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.textView);
        MySharedPreference myPref = new MySharedPreference(this);
        String ceva =myPref.getValue();
        textView.setText(ceva);

        Intent intent = getIntent();
        Toast.makeText(this,  intent.getStringExtra("ceva"), Toast.LENGTH_SHORT).show();
    }

}