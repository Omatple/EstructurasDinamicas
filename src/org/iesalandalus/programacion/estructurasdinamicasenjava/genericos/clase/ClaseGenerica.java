package org.iesalandalus.programacion.estructurasdinamicasenjava.genericos.clase;

public class ClaseGenerica <T> {
    private T dato;
    public ClaseGenerica(T dato) {
        this.dato = dato;
    }

    private T getDato(){
        return dato;
    }

    public void setDato(T dato){
        this.dato = dato;
    }

    @Override
    public String toString() {
        return String.format("ClaseGenerica[ Dato = %s ]", this.dato);
    }
}
