package com.jesus.testdefinitivo2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button botonIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonIniciarSesion = (Button) findViewById(R.id.button);
        botonIniciarSesion.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View view) {
        Intent accionInicio=new Intent(this, fragment_inicio.class);
        startActivity(accionInicio);
    }
}