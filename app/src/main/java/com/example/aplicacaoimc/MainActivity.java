package com.example.aplicacaoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Nom, Pes, Alt;
    Button Calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nom = findViewById(R.id.ColNome);
        Pes = findViewById(R.id.ColPeso);
        Alt = findViewById(R.id.ColAlt);
        Calc = findViewById(R.id.button);
    }

    public void ActionButton(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("Nome",Nom.getText());
        i.putExtra("Peso",Pes.getText());
        i.putExtra("Alt",Alt.getText());
        startActivity(i);
    }

}