package org.iesalandalus.programacion.estructurasdinamicasenjava.ejercicios.diccionario;

import org.iesalandalus.programacion.utilidades.Entrada;

public class ConsolaDiccionario {
    private ConsolaDiccionario(){}

    public static int pedirNumerodePalabrasaGuardar(){
        int numPalabras;
        do {
            System.out.print("Introduzca el número de palabras que desea guardar: ");
            numPalabras = Entrada.entero();
        } while (numPalabras < 0);
        return numPalabras;
    }

    public static String pedirPalabra(){
        String palabra;
        do {
            System.out.print("Introduzca la palabra que desea guardar en el diccionario: ");
            palabra = Entrada.cadena();
        } while (palabra.isEmpty());
        return palabra;
    }
}
