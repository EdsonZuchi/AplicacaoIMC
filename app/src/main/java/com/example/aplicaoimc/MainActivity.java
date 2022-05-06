package com.example.aplicaoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button send;
    EditText l1, l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = findViewById(R.id.button);
        l1 = findViewById(R.id.Label1);
        l2 = findViewById(R.id.Label2);
    }

    public void Resposta(View view){
        Intent i = new Intent(this,MainActivity2.class);
        Integer peso = l1.getText().length();
        Integer altura = l2.getText().length();
        i.putExtra("l1",peso);
        i.putExtra("l2",altura);
        startActivity(i);
    }

}