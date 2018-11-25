package com.udc.muei.dsi;

public abstract class Fuente extends Proyecto{

    /* Operaciones comunes a las fuentes */

    @Override
    public String getNombreProyecto() {
        return "{"+getNombre()+"}";
    }

    public abstract String getNombre();
}
