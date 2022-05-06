package com.example.aplicaoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView limc, t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        limc = findViewById(R.id.limc);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        Bundle bundle = getIntent().getExtras();
        Integer peso = bundle.getInt("l1");
        Integer altura = bundle.getInt("l2");
        t1.setText(peso);
        t2.setText(altura);
        Integer imc;
        imc = peso/(altura*altura);
        limc.setText(imc);
    }
}