package com.udc.muei.dsi;

public class Paralela extends Composicion {
    private String nombre;

    /* Atributos propios de una composición paralela */

    public Paralela(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombreComposicion() {
        return  "{ComposicionParalela("+nombre+"): ";
    }
}
