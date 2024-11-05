package com.seu_pacote.imcapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView labelPeso, labelAltura, textResultado;
    private SeekBar seekBarPeso, seekBarAltura;
    private Button buttonCalcular;
    private int peso = 0;
    private int altura = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelPeso = findViewById(R.id.labelPeso);
        labelAltura = findViewById(R.id.labelAltura);
        textResultado = findViewById(R.id.textResultado);
        seekBarPeso = findViewById(R.id.seekBarPeso);
        seekBarAltura = findViewById(R.id.seekBarAltura);
        buttonCalcular = findViewById(R.id.buttonCalcular);

        seekBarPeso.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                peso = progress;
                labelPeso.setText("Peso (kg): " + peso);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        seekBarAltura.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                altura = progress;
                labelAltura.setText("Altura (cm): " + altura);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        buttonCalcular.setOnClickListener(v -> calcularIMC());
    }

    private void calcularIMC() {
        if (altura > 0) {
            double alturaMetros = altura / 100.0;
            double imc = peso / (alturaMetros * alturaMetros);
            String resultado = String.format("Seu IMC é: %.2f", imc);
            textResultado.setText(resultado);
        } else {
            textResultado.setText("Por favor, selecione uma altura válida.");
        }
    }
}
