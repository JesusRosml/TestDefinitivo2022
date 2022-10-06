package com.jesus.testdefinitivo2022.actividades30.ui.home;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.jesus.testdefinitivo2022.R;
import com.jesus.testdefinitivo2022.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

    binding = FragmentHomeBinding.inflate(inflater, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {
                //LatLng veracruz = new LatLng(19.327080, -96.600861);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(19.327080, -96.600861),7));
                googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(18.142010, -94.486804))
                        .title("Reportar Basura"));
                googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(19.5092335494502, -96.87034336706078))
                        .title("Reportar Bache"));
                googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(19.539281299907007, -96.92607320901917))
                        .title("Basura en el parque"));
                googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(19.521521354074313, -96.90785492366999))
                        .title("Fuga de Agua"));
                googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(19.521521354074313, -96.90785492366999))
                        .title("Choque!"));

            }
        });
    View root = binding.getRoot();
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}