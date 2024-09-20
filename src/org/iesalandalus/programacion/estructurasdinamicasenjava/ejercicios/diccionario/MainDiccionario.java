package org.iesalandalus.programacion.estructurasdinamicasenjava.ejercicios.diccionario;

public class MainDiccionario {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        diccionario.agregarPalabra("metodo");
        diccionario.agregarPalabra("filosofia");
        diccionario.agregarPalabra("papel");
        diccionario.agregarPalabra("carton");
        diccionario.agregarPalabra("pedo");
        diccionario.agregarPalabra("paloma");
        diccionario.agregarPalabra("viento");
        diccionario.agregarPalabra("magia");
        diccionario.agregarPalabra("huida");
        diccionario.agregarPalabra("plan");
        diccionario.agregarPalabra("hielo");
        diccionario.agregarPalabra("trotar");
        diccionario.agregarPalabra("acto");
        diccionario.agregarPalabra("patrimonio");
        diccionario.agregarPalabra("sociedad");
        diccionario.agregarPalabra("accidente");
        diccionario.agregarPalabra("tren");
        diccionario.crearDiccionario();
        System.out.println(diccionario);
    }
}
