package com.example.hoysesaleapp;

public class itemBusquedaList {
    private int foto;
    private String evento;
    private  String fecha;

    public itemBusquedaList(int foto, String evento, String fecha){
        this.foto=foto;
        this.evento=evento;
        this.fecha=fecha;
    }
    public int getFoto(){
        return foto;
    }

    public String getEvento() {
        return evento;
    }

    public String getFecha() {
        return fecha;
    }
}