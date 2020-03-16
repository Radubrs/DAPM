package com.example.laborator5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


     class Car{
        public String name;
        public int imageResource;
    }

     class TagCar{
        public TextView name;
        public ImageView image;
    }



public class MainActivity extends Activity {
    private ListView listOfCars;
    CarAdapter carAdapter;
    private EditText addNewCar;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfCars=(ListView) findViewById(R.id.lv_list_cars);
        carAdapter = new CarAdapter(MainActivity.this);
        listOfCars.setAdapter(carAdapter);

        carAdapter.addCar("Volkswagen", R.drawable.car_icon);
        carAdapter.addCar("Ferrari", R.drawable.car_icon);
        carAdapter.addCar("Mercedes", R.drawable.car_icon);
        carAdapter.addCar("Dacia", R.drawable.car_icon);

        addNewCar=(EditText) findViewById(R.id.ed_new_car);
        addButton=(Button) findViewById(R.id.b_add_car);

        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name = addNewCar.getText().toString();
                int imagine = R.drawable.car_icon;

                carAdapter.addCar(name, imagine);
                addNewCar.setText("");
            }
        });
    }
}

