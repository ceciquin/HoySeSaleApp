package com.example.hoysesaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class busquedaEventos extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_eventos);
        createListView();
    }

    private void createListView() {
        listView= (ListView) findViewById(R.id.listviewbusqueda);
        adaptador adaptador1 = new adaptador(this, getArrayItems());
        listView.setAdapter(adaptador1);
    }

    private ArrayList<itemBusquedaList> getArrayItems() {
        return JSONparser.parsearEvento(this);

    }
}
