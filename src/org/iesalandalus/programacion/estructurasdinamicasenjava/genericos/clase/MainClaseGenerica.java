package org.iesalandalus.programacion.estructurasdinamicasenjava.genericos.clase;

public class MainClaseGenerica {
    public static void main(String[] args) {
        ClaseGenerica <Integer> claseGenericaInteger = new ClaseGenerica<>(2024);
        System.out.println(claseGenericaInteger);
        claseGenericaInteger.setDato(2003);
        System.out.println(claseGenericaInteger);

        ClaseGenerica <String> claseGenericaString = new ClaseGenerica<>("Este año.");
        System.out.println(claseGenericaString);
        claseGenericaString.setDato("Año de mi nacimiento.");
        System.out.println(claseGenericaString);
    }
}
