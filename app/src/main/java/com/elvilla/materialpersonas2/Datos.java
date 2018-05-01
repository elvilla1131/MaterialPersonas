package com.elvilla.materialpersonas2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by android on 30/04/2018.
 */

public class Datos {

    private static ArrayList<Persona> personas = new ArrayList();


    public static void guardar (Persona p) {
        personas.add(p);
    }


    public static ArrayList<Persona> obtener(){
        return personas;
    }


    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotosSeleccionada;
        Random r = new Random();
        fotosSeleccionada = r.nextInt(fotos.size());
        return fotos.get(fotosSeleccionada);
    }
}
