package com.example.faixaetria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<pubic> extends AppCompatActivity {

    EditText edtFaixaetaria;
    Button btnerificarFaixaEtaria;
    TextView tvResultadoFaixaEtaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void VerificarFaixaEtaria(View V) {
        edtFaixaetaria = (EditText) findViewById(R.id.txtidade);
        tvResultadoFaixaEtaria = (TextView) findViewById(R.id.txtResultadoFaixaEtaria);
        Integer idade = Integer.parseInt(edtFaixaetaria.getText().toString());
        //estrutura de decisão
        if ((idade >= 0) && (idade <= 12)) {
            tvResultadoFaixaEtaria.setText("A idade dessa pessoa é de uma criança!");
        } else if ((idade > 12) && (idade <= 17)) {
            tvResultadoFaixaEtaria.setText("A idade dessa pessoa é de uma adolescente!");
        } else {
            tvResultadoFaixaEtaria.setText("A idade dessa pessoa é de uma adulto!");
        }

    }
}

