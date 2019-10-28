package com.example.hoysesaleapp;

import android.content.Context;

/*Clase que uso para parsear datos  en json para la clase  itemBusquedaEventos*/
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;



public class JSONparser {

    public static ArrayList<itemBusquedaList> parsearEvento(Context context) {
        /*
        try {
            //String result1 = "{\"someKey\":\"someValue\"}"; // si el json es un string solo

        String result2= "[{\"someKey\":\"someValue\"}]" //si el json es un array


        JSONObject jObject = new JSONObject(result2);
        ArrayList<itemBusquedaList> evento1 = new ArrayList<>();
        String evento="";
        String fecha="";
        String foto ="";
        JSONArray jArray = jObject.getJSONArray("ARRAYNAME");

        for (int i=0; i < jArray.length(); i++)
        {
            try {
                JSONObject oneObject = jArray.getJSONObject(i);
                // Pulling items from the array
                String oneObjectsItem = oneObject.getString("STRINGNAMEinTHEarray");
                String oneObjectsItem2 = oneObject.getString("anotherSTRINGNAMEINtheARRAY");
            } catch (JSONException e) {
                // Oops
            }
        }
        return evento1;
    } catch (Exception e) {
        e.printStackTrace();
    }*/
    return null;
}
    private static int getImagePath(String foto, Context context){// obtener foto
        return context.getResources().getIdentifier(foto,"drawable",context.getPackageName());
    }
        }
