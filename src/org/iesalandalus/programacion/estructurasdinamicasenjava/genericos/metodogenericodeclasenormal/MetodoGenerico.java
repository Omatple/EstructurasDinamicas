package org.iesalandalus.programacion.estructurasdinamicasenjava.genericos.metodogenericodeclasenormal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MetodoGenerico {
    public static void main(String[] args) {
        List<Integer> listaElementoNumerosEnteros = new ArrayList<>();
        listaElementoNumerosEnteros.add(1);
        listaElementoNumerosEnteros.add(2);
        listaElementoNumerosEnteros.add(4);
        listaElementoNumerosEnteros.add(4);
        listaElementoNumerosEnteros.add(2);
        listaElementoNumerosEnteros.add(1);
        listaElementoNumerosEnteros.add(3);
        listaElementoNumerosEnteros.add(1);
        listaElementoNumerosEnteros.add(5);
        System.out.printf("Lista Integer CON elementos repetidos: %s\n", listaElementoNumerosEnteros);
        listaElementoNumerosEnteros = eliminarElementosRepetidos(listaElementoNumerosEnteros);
        Collections.sort(listaElementoNumerosEnteros);
        System.out.printf("Lista Integer SIN elementos repetidos y ordenada: %s\n", listaElementoNumerosEnteros);


        List<String> listaElementoPalabras = new ArrayList<>();
        listaElementoPalabras.add("Suv");
        listaElementoPalabras.add("Coche");
        listaElementoPalabras.add("Avion");
        listaElementoPalabras.add("Barco");
        listaElementoPalabras.add("Canoa");
        listaElementoPalabras.add("Coche");
        listaElementoPalabras.add("Coche");
        listaElementoPalabras.add("Tanque");
        listaElementoPalabras.add("Autobus");
        listaElementoPalabras.add("Avion");
        listaElementoPalabras.add("Tren");
        listaElementoPalabras.add("Tranvia");
        listaElementoPalabras.add("Canoa");
        listaElementoPalabras.add("Carrusel");
        System.out.printf("Lista String CON elementos repetidos: %s\n", listaElementoPalabras);
        listaElementoPalabras = eliminarElementosRepetidos(listaElementoPalabras);
        Collections.sort(listaElementoPalabras);
        System.out.printf("Lista String SIN elementos repetidos y ordenada: %s\n", listaElementoPalabras);
        Collections.sort(listaElementoPalabras, (elemento1, elemento2) -> (elemento1.length() == elemento2.length()) ? elemento1.compareTo(elemento2) : Integer.compare(elemento1.length(), elemento2.length()));
        System.out.printf("Lista String SIN elementos repetidos y ordenada por numero de caracteres y alfabeticamente(metodo lambda): %s\n", listaElementoPalabras);
        Collections.sort(listaElementoPalabras, Comparator.comparing(String::length).thenComparing(String::compareTo).reversed());
        System.out.printf("Lista String SIN elementos repetidos y ordenada por numero de caracteres y alfabeticamente de forma descendente(metodos estaticos Comparator): %s\n", listaElementoPalabras);
    }

    private static <T> List<T> eliminarElementosRepetidos(List<T> listaElementos) {
        for (int i = 0; i < listaElementos.size(); i++) {
            for (int j = 0; j < listaElementos.size(); j++) {
                if (i != j) {
                    if (listaElementos.get(i).equals(listaElementos.get(j))) {
                        listaElementos.remove(j);
                    }
                }
            }
        }
        return listaElementos;
    }
}
