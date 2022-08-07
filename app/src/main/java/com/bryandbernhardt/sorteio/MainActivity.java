package com.bryandbernhardt.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view) {
        TextView numeroSorteado = findViewById(R.id.result);
        TextView numberRange = findViewById(R.id.numberRange);

        try {
            int randomNumber = new Random().nextInt(Integer.parseInt(numberRange.getText().toString()) + 1);
            numeroSorteado.setText("Número: " + randomNumber);
        }catch (Exception e) {
            numeroSorteado.setText("Epa? Deu erro: " + e.getMessage());
        }
    }
}