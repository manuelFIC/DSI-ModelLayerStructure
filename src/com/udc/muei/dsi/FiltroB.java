package com.udc.muei.dsi;

public class FiltroB extends Filtro {

    /* Atributos propios de un filtro B*/

    public FiltroB(Fuente fuente) {
        super(fuente);
    }

    @Override
    public String getNombre() {
        return "{FiltroB: " + getFuente().getNombre()+"}";
    }
}
