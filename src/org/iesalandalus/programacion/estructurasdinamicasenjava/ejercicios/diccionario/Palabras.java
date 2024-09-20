package org.iesalandalus.programacion.estructurasdinamicasenjava.ejercicios.diccionario;

import java.util.HashSet;

public class Palabras <String> {
HashSet <String> palabras = new HashSet <String> ();

    public void agregarPalabra(String palabra) {
        palabras.add(palabra);
    }

    public HashSet<String> getPalabras() {
        return palabras;
    }
}
