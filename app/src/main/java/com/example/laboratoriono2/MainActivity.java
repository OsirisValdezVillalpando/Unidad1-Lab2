package com.example.laboratoriono2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button Anterior;
    public Button Siguiente;
    private ImageView imagenCristiano;
    private ImageView imagenMessi;
    private TextView textCristiano;
    private TextView textMessi;
    private TextView descripcionMessi;
    private TextView descripcionRonaldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anterior = findViewById(R.id.btnAnterior);
        Siguiente = findViewById(R.id.btnSiguente);

        imagenCristiano =  findViewById(R.id.imagenFutbolista);
        imagenMessi =  findViewById(R.id.imagenFutbolista);

        textCristiano = findViewById(R.id.nombreFutbolista);
        textMessi = findViewById(R.id.nombreFutbolista);

        descripcionRonaldo = findViewById(R.id.descripcionFutbolista);
        descripcionMessi= findViewById(R.id.descripcionFutbolista);

        Anterior.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imagenMessi.setImageResource(R.drawable.messi);
                textMessi.setText(R.string.Messi);
                descripcionMessi.setText(R.string.DescripcionMessi);
            }
        });

        Siguiente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imagenCristiano.setImageResource(R.drawable.cristianoo);
                textCristiano.setText(R.string.Ronaldo);
                descripcionRonaldo.setText(R.string.DescripcionRonaldo);
            }
        });

    }



}