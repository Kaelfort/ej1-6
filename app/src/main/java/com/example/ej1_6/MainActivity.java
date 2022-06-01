package com.example.ej1_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


import com.example.ej1_6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Animation parpadeo;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_main);
        setContentView(binding.getRoot());
        ejecutar();

    }

    private void ejecutar() {
        binding.btnEjecutar.setOnClickListener(view ->{
            //binding.ivimagen.setVisibility(View.INVISIBLE);
            binding.txtResultado.setText("estoy testeando data Biden's");
        });

    }
    private void activarAnimacionParpadeo() {
        parpadeo.setDuration(1500);
        parpadeo.setRepeatCount(Animation.INFINITE);
        parpadeo.setRepeatMode(Animation.REVERSE);
        binding.ivimagen.startAnimation(parpadeo);
    }

    private void inicializarAnimaciones() {
        parpadeo = AnimationUtils.loadAnimation(this, R.anim.parpadeo);
    }
}