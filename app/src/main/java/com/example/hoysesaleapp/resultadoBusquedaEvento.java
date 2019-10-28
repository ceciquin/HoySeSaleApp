package com.example.hoysesaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class resultadoBusquedaEvento extends AppCompatActivity {

    private ListView listView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_busqueda_evento);
        createListView();
    }

    private void createListView() {
        listView2= (ListView) findViewById(R.id.listviewbusqueda);
        adaptador adaptador2 = new adaptador(this, getArrayItems());
        listView2.setAdapter(adaptador2);
    }

    private ArrayList<itemBusquedaList> getArrayItems() {
        return JSONparser.parsearEvento(this);

    }}
