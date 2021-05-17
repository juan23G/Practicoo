package com.example.practicoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma, buttonResta, buttonIncrementarZoom, buttonDecrementarZoom, buttonOcultar, buttonReiniciar;
    private TextView textView;
    private int valor=0;

    private int valorTexto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSuma=findViewById(R.id.buttonSuma);
        buttonResta=findViewById(R.id.buttonResta);
        buttonIncrementarZoom=findViewById(R.id.buttonIncrementarZoom);
        buttonDecrementarZoom=findViewById(R.id.buttonDecrementarZoom);
        buttonOcultar=findViewById(R.id.buttonOcultar);
        buttonReiniciar=findViewById(R.id.buttonReiniciar);
        textView=findViewById(R.id.textView);

        if (valorTexto == 0){
            valorTexto = 20;
            textView.setTextSize(valorTexto);
        }


        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               suma(view);
            }
        });

        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resta(view);
            }
        });

        buttonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reiniciar(view);
            }
        });

        buttonOcultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ocultar(view);
            }
        });

        buttonIncrementarZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementarZoom(view);
            }
        });

        buttonDecrementarZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                descrementarZoom(view);
            }
        });

    }


    public void suma(View view){

        valor++;
        textView.setText(""+valor);
    }

    public void resta(View view){

        valor--;
        textView.setText(""+valor);
    }

    public void reiniciar(View view){

        if(valor!=0) {
            valor = 0;
            textView.setText("" + valor);
        }
    }

   public void ocultar(View view){

        textView.setVisibility(View.INVISIBLE);

    }

    public void incrementarZoom(View view){

        if (valorTexto == 0){
            valorTexto = 20;
        }
        if (valorTexto < 30){
            valorTexto = valorTexto + 1;
            textView.setTextSize(valorTexto);
        }

        //textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, textView.getTextSize()+1);

    }

    public void descrementarZoom(View view){

        if (valorTexto == 0){
            valorTexto = 20;
        }
        if (valorTexto > 10){
            valorTexto = valorTexto - 1;
            textView.setTextSize(valorTexto);
        }
        //textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, textView.getTextSize()-1);
    }
}