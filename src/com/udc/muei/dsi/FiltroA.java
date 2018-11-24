package com.udc.muei.dsi;

public class FiltroA extends Filtro {

    /* Atributos propios de un filtro A*/

    public FiltroA(Fuente fuente) {
        super(fuente);
    }

    @Override
    public String getNombre() {
        return "{FiltroA: " + getFuente().getNombre()+"}";
    }
}
