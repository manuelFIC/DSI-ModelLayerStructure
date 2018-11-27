package com.udc.muei.dsi;

public abstract class Fuente extends ComponenteVideo{

    /* Operaciones comunes a las fuentes */

    @Override
    String getNombreComponente() {
        return "{"+getNombre()+"}";
    }

    public abstract String getNombre();
}
