package com.example.lab3;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

public class FindTheNumberActivity extends AppCompatActivity implements View.OnClickListener{

    public static final int MAX_NUMBER = 10;
    public static final Random RANDOM = new Random();
    private TextView msgTv;
       private EditText numberEnteredEt;
    private Button validate;
    private int DeGasit, incercari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        msgTv = (TextView) findViewById(R.id.msg);
        numberEnteredEt = (EditText) findViewById(R.id.numberEnteredEt);
        validate = (Button) findViewById(R.id.validate);
        validate.setOnClickListener(this);

        newGame();
    }

    @Override
    public void onClick(View view) {
        if (view == validate) {
            validate();
        }
    }

    private void validate() {
        int n = Integer.parseInt(numberEnteredEt.getText().toString());
        incercari++;

        if (n == DeGasit) {
            Toast.makeText(this, "Ai gasit numarul " + DeGasit +
                    " din " + incercari + " incercari", Toast.LENGTH_SHORT).show();
            newGame();
        } else if (n > DeGasit) {
            msgTv.setText("Mai mic");
        } else if (n < DeGasit) {
            msgTv.setText("Mai mare");
        }
    }

    private void newGame() {
        DeGasit = RANDOM.nextInt(MAX_NUMBER) + 1;
        numberEnteredEt.setText("");
        incercari = 0;
    }
}