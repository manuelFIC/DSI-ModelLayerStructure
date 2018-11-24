package com.udc.muei.dsi;

public abstract class Multimedia extends Fuente {
    private String nombre;

    /* Atributos propios de elementos multimedia */

    protected Multimedia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return "{" + nombreElementoMultimedia()+": " + nombre + "}";
    }

    protected abstract String nombreElementoMultimedia();
}
