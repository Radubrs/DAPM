package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFancyMethod(v);
            }});

        Log.i("myApp","I");
        Log.v("myApp","V");
        Log.e("myApp","E");
        Log.d("myApp","D");
        Log.w("myApp","W");
    }

    protected void onStart() {
        super.onStart();
        Log.v("myApp","onStart");
    }

    protected void onRestart() {
        super.onRestart();
        Log.v("myApp","onRestart");
    }

    protected void onResume() {
        super.onResume();
        Log.v("myApp","onResume");
    }
    protected void onPause() {
        super.onPause();
        Log.v("myApp","onPause");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.v("myApp","onDestroy");
    }
    protected void onStop() {
        super.onStop();
        Log.v("myApp","onStop");
    }

    public void myFancyMethod(View v){
            Toast.makeText(MainActivity.this,"You pushed the button from on create", Toast.LENGTH_LONG).show();

        }

    public void push(View view){

        Toast.makeText(this, "You pushed the button from push function", Toast.LENGTH_SHORT).show();
    }
}

