package org.iesalandalus.programacion.estructurasdinamicasenjava.colecciones.conjuntos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EjemploBucleImprimeHashSet {
    private Set<Integer> numerosEnteros = new HashSet<>();
    private static final int LIMITE_NUMEROS = 10;
    private static final Random generador = new Random();

    public Set<Integer> añadiryMostrarElementos(Set<Integer> numerosEnteros) {
        int numeroAleatorio;
        for (int i = 0; i <= LIMITE_NUMEROS; i++) {
            numeroAleatorio = generador.nextInt(LIMITE_NUMEROS) + 1;
            numerosEnteros.add(numeroAleatorio);
        }
        return numerosEnteros;
    }

    public Set<Integer> MostrarElementosNoPares(Set<Integer> numerosEnteros) {
        for (Integer elemento : numerosEnteros) {
            if ((elemento % 2) == 0) numerosEnteros.remove(elemento);
        }
        return numerosEnteros;
    }
}
