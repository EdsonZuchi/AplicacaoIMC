package com.example.aplicacaoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Nm, Ps, At, IMC;
    ImageView IMG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Nm = findViewById(R.id.Nome);
        Ps = findViewById(R.id.Peso);
        At = findViewById(R.id.Alt);
        IMC = findViewById(R.id.IMC);
        IMG = findViewById(R.id.img);
        Bundle extra = getIntent().getExtras();
        String nome = extra.getString("Nome");
        Nm.setText(nome);
        String peso = extra.getString("Peso");
        String alt = extra.getString("Alt");
        Ps.setText(peso);
        At.setText(alt);
        float pss = Float.parseFloat(Ps.getText().toString());
        float all = Float.parseFloat(At.getText().toString());
        float imcalc = pss/(all*all);
        imcalc = Math.round(imcalc);
        String imcst = Float.toString(imcalc);
        IMC.setText(imcst);
        if(imcalc < 18){
            IMG.setImageResource(R.drawable.abaixopeso);
        }else{
            if(imcalc < 25) {
                IMG.setImageResource(R.drawable.normal);
            }else{
                if(imcalc < 30){
                    IMG.setImageResource(R.drawable.sobrepeso);
                }else{
                    if(imcalc < 35){
                        IMG.setImageResource(R.drawable.obesidade1);
                    }else{
                        if(imcalc < 40){
                            IMG.setImageResource(R.drawable.obesidade2);
                        }else{
                            IMG.setImageResource(R.drawable.obesidade3);
                        }
                    }
                }
            }
        }
        IMC.setText(imcst);
    }
}