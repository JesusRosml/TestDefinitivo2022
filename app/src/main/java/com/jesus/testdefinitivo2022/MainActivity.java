package com.jesus.testdefinitivo2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jesus.testdefinitivo2022.actividades30.barranav_Definitiv019;
import com.jesus.testdefinitivo2022.actividades30.creacioncuenta;
import com.jesus.testdefinitivo2022.actividades30.ui.home.HomeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button botonIniciarSesion;
    Button botonRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonIniciarSesion = (Button) findViewById(R.id.button);
        botonIniciarSesion.setOnClickListener(MainActivity.this);

        botonRegistrarse = (Button) findViewById(R.id.button3);
        botonRegistrarse.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent accionInicio=new Intent(this, barranav_Definitiv019.class);
                startActivity(accionInicio);
                break;

            case R.id.button3:
                Intent accionRegistro=new Intent(this, creacioncuenta.class);
                startActivity(accionRegistro);
                break;
        }

    }
}