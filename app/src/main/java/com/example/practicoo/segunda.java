package com.example.practicoo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import androidx.appcompat.app.AppCompatActivity;

public class segunda extends AppCompatActivity {

    private EditText editTextNumberMonto, editTextNumberResultado;
    private Button buttonConvertir, buttonReiniciarResultado;
    private RadioButton radioButtonDolar, radioButtonEuro, radioButtonReal;
    private RadioGroup radioGroup;
    private double dolar= 94.06;
    private double euro= 114.41;
    private double real= 17.84;

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
                dolar(view);
            }
        });
    }

    public void dolar(View view){

        double monto = Double.parseDouble(editTextNumberMonto.getText().toString());
        double montoDolar = 0.0;
        if(radioButtonDolar.isChecked()==true){

            montoDolar = monto * dolar;
            editTextNumberResultado.setText(montoDolar);

        }

        /*String monto= editTextNumberMonto.getText().toString();
        dolar = Double.parseDouble(monto);

        if(radioButtonDolar.isChecked() == true){
            double suma = monto*dolar;
            String resultado = String.valueOf(suma);
            editTextNumberResultado.setText(resultado);
        }*/
    }
}
