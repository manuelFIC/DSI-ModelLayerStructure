package com.udc.muei.dsi;

public class Secuencial extends Composicion {
    private String nombre;

    /* Atributos propios de una composición secuencial */

    public Secuencial(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombreComposicion() {
        return  "{ComposicionSecuencial("+nombre+"): ";
    }
}
