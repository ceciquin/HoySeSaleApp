package com.example.hoysesaleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;

public class perfilUsuario extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);



        //Toolbar attributes
       toolbar = findViewById(R.id.toolbarHoySale);
       //setSupportActionBar(toolbar);
       //toolbar.setLogo(R.drawable.camara);
    }


}
