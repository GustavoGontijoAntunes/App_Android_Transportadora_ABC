package com.example.app02_transportadoraabc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editKm;
    EditText editPreco;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editKm = findViewById(R.id.editText_Km);
        editPreco = findViewById(R.id.editText_Preco);
        txtResultado = findViewById(R.id.txt_Resultado);
    }

    public void retornarResultado(View view){
        double km = Double.parseDouble(editKm.getText().toString());
        double preco = Double.parseDouble(editPreco.getText().toString());

        double resultado = this.calcular(km, preco);

        txtResultado.setText(String.format("Crédito necessário - R$: %.2f", resultado));
    }

    public static double calcular(double k, double p){
        double calculo = (((k * 2.0) + ((k * 2.0 * 10.0) / 100.0)) / 10.0) * p;
        return calculo;
    }
}