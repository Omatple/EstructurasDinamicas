package org.iesalandalus.programacion.estructurasdinamicasenjava.colecciones.conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainBucleImprimeHashSet {
    public static void main(String[] args) {
        Set<Integer> numerosAleatorios = new HashSet<>();
        EjemploBucleImprimeHashSet ejemploBucleImprimeHashSet = new EjemploBucleImprimeHashSet();
        ejemploBucleImprimeHashSet.añadiryMostrarElementos(numerosAleatorios);
        System.out.println("Mostrar elementos del conjunto:");
        System.out.println(numerosAleatorios);
        System.out.println("");
        System.out.println("Mostrar con blucle 'for' con 'for each':");
        for(Integer numeroAleatorio : numerosAleatorios){
            System.out.println(numeroAleatorio);
        }
        System.out.println("");
        System.out.println("Mostrar con bucle 'for' con 'Iterator':");
        for(Iterator<Integer> iterator = numerosAleatorios.iterator(); iterator.hasNext();){
            int numeroAleatorio = iterator.next();
            System.out.println(numeroAleatorio);
        }
        System.out.println("");
        System.out.println("Mostrar con bucle 'while' con 'Iterator'");
        Iterator<Integer> iterator = numerosAleatorios.iterator();
        while (iterator.hasNext()){
            int numeroAleatorio = iterator.next();
            System.out.println(numeroAleatorio);
        }
    }
}
