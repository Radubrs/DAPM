package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view){

        final EditText User= (EditText) findViewById(R.id.user);
       String n=User.getText().toString();
        final EditText Password= (EditText) findViewById(R.id.password);
        String p=Password.getText().toString();
        if(n.equals("Student")&& p.equals("Student")){
            Intent intent= new Intent(this, FindTheNumberActivity.class);
            startActivity(intent);
        }

    }

    }
