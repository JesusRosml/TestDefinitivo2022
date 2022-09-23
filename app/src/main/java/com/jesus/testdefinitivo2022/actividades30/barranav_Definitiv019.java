package com.jesus.testdefinitivo2022.actividades30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.jesus.testdefinitivo2022.DataBinderMapperImpl;
import com.jesus.testdefinitivo2022.R;
import com.jesus.testdefinitivo2022.databinding.ActivityBarranavDefinitiv019Binding;
import com.jesus.testdefinitivo2022.databinding.NavHeaderBarranavDefinitiv019Binding;
import com.jesus.testdefinitivo2022.perfilusuario;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;



public class barranav_Definitiv019 extends AppCompatActivity implements OnMapReadyCallback {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityBarranavDefinitiv019Binding binding;
    ImageView foto_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBarranavDefinitiv019Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarBarranavDefinitiv019.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();

        //HeaderLayout con foto de perfil
        //View headerLayout = navigationView.inflateHeaderView(R.layout.nav_header_barranav_definitiv019);
        //foto_perfil = headerLayout.findViewById(R.id.foto_perfil1);
        //foto_perfil.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Intent accion_perfil = new Intent(getApplicationContext(), perfilusuario.class);
        //        startActivity(accion_perfil);
        //    }
        //});

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_barranav_definitiv019);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.barranav__definitiv019, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_barranav_definitiv019);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(18.142010, -94.486804))
                .title("Marker"));
    }
}