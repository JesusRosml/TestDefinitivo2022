package com.jesus.testdefinitivo2022.actividades30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.jesus.testdefinitivo2022.R;


public class creacioncuenta extends AppCompatActivity implements View.OnClickListener {

    Button siguienteRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacioncuenta);

        siguienteRegistro = (Button) findViewById(R.id.button_siguiente);
        siguienteRegistro.setOnClickListener(creacioncuenta.this);
    }

    @Override
    public void onClick(View view) {
        Intent accionSiguiente=new Intent(this, creacion_datospersonales.class);
        startActivity(accionSiguiente);

    }
}