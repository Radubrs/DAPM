package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    MySharedPreference myPref;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button save = findViewById(R.id.save);
        Button activityBtn = findViewById(R.id.activityBtn);
        editText = findViewById(R.id.editText);
        myPref = new MySharedPreference(MainActivity.this);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myPref.save(editText.getText().toString());
            }
        });
        activityBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("ceva", "random");
                startActivity(intent);
            }
        });
    }
}
