package com.example.hoysesaleapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptador extends BaseAdapter {
    private ArrayList<itemBusquedaList> list;
    private Context context;

    public adaptador(Context context, ArrayList<itemBusquedaList> arrayItems) {
        this.context=context;
        this.list=arrayItems;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.activity_item_busqueda_list,null);
        ImageView foto= (ImageView) view.findViewById(R.id.imageFoto);
        TextView nombre= (TextView) view.findViewById(R.id.nombre);
        TextView grupo = (TextView) view.findViewById(R.id.grupo);
        itemBusquedaList item= (itemBusquedaList) getItem(i);
        foto.setImageResource(item.getFoto());
        nombre.setText(item.getEvento());
        grupo.setText(item.getFoto());
        return view;
    }
}