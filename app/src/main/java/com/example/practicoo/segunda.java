package com.example.practicoo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class segunda extends AppCompatActivity {

    private EditText editTextNumberMonto, editTextNumberResultado;
    private Button buttonConvertir, buttonReiniciarResultado;
    private RadioButton radioButtonDolar, radioButtonEuro, radioButtonReal;
    private RadioGroup radioGroup;
    private final double dolar= 94.06;
    private final double euro= 114.41;
    private final double real= 17.84;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda);

        radioGroup=findViewById(R.id.radioGroup);
        buttonConvertir=findViewById(R.id.buttonConvertir);
        buttonReiniciarResultado=findViewById(R.id.buttonReiniciarResultado);
        radioButtonDolar=findViewById(R.id.radioButtonDolar);
        radioButtonEuro=findViewById(R.id.radioButtonEuro);
        radioButtonReal=findViewById(R.id.radioButtonReal);
        editTextNumberMonto=findViewById(R.id.editTextNumberMonto);
        editTextNumberResultado=findViewById(R.id.editTextNumberResultado);

        buttonConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertir();
            }
        });

        buttonReiniciarResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reiniciar();
            }
        });
    }

    public void convertir(){

            double entradaMonto=0, salidaMoneda=0;

            if(editTextNumberMonto.getText().toString().isEmpty())
            {
                Toast.makeText(this, "no se ingreso nada", Toast.LENGTH_LONG).show();
                return;
            }

            entradaMonto= Double.parseDouble(editTextNumberMonto.getText().toString());

            if(radioButtonDolar.isChecked())
            {
                salidaMoneda = entradaMonto*dolar;
            }
            if(radioButtonEuro.isChecked())
            {
                salidaMoneda = entradaMonto*euro;
            }
            if(radioButtonReal.isChecked())
            {
                salidaMoneda = entradaMonto*real;
            }
            DecimalFormat df = new DecimalFormat("###.##");
            editTextNumberResultado.setText(String.valueOf(df.format(salidaMoneda)));



        /*double monto = Double.parseDouble(editTextNumberMonto.getText().toString());
        double montoDolar = 0.0;
        if(radioButtonDolar.isChecked()==true){

            montoDolar = monto * dolar;
            editTextNumberResultado.setText(montoDolar);

        }*/

        /*String monto= editTextNumberMonto.getText().toString();
        dolar = Double.parseDouble(monto);

        if(radioButtonDolar.isChecked() == true){
            double suma = monto*dolar;
            String resultado = String.valueOf(suma);
            editTextNumberResultado.setText(resultado);
        }*/
    }

    public void reiniciar(){
        editTextNumberResultado.setText("0");
        editTextNumberMonto.setText("0");
    }
}
