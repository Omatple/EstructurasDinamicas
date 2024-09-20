package org.iesalandalus.programacion.estructurasdinamicasenjava.ejercicios.diccionario;

import java.util.*;

public class Diccionario {
    Map<Character, Set<String>> diccionario = new TreeMap<Character, Set<String>>();

    Set<String> palabras = new HashSet<String>();

    public Diccionario() {

    }

    public void agregarPalabra(String palabra) {
        this.palabras.add(palabra);
    }

    public void crearDiccionario() {
        List<String> listaOrdenada = new ArrayList<>(palabras);
        Collections.sort(listaOrdenada);
        palabras.clear();
        palabras.addAll(listaOrdenada);
        for (String palabra : palabras) {
            // DAR UNA VUELTA AL USO DE GETORDEFAULT() ME HA COSTADO MUCHO IMPLEMENTARLO BIEN EN EL METODO, ES MUY IMPORTANTE EN LOS MAPAS.
            // TAMBIEN MIRAR EL USO DEL PUT()
            char primeraLetra = palabra.charAt(0);
            Set<String> palabrasAgrupadas = diccionario.getOrDefault(primeraLetra, new HashSet<>());
            palabrasAgrupadas.add(palabra);
            diccionario.put(primeraLetra, palabrasAgrupadas);
        }
    }

    @Override
    public String toString() {
        StringBuilder formatoString = new StringBuilder();
        for (Character indice : diccionario.keySet()) {
            formatoString.append(String.format(" Letra '%s': \n", Character.toUpperCase(indice)));
            for (String palabra : diccionario.get(indice)) {
                formatoString.append(String.format("  %s\n", Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1).toLowerCase()));
            }
            formatoString.append("\n");
        }
        return String.format("Diccionario:\n%s", formatoString.toString());
    }
}
