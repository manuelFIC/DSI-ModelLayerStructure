package com.udc.muei.dsi;

public abstract class Filtro extends Fuente {

    private Fuente fuente;

    /* Atributos propios de un filtro*/

    protected Filtro(Fuente fuente) {
        this.fuente = fuente;
    }

    protected Fuente getFuente() {
        return fuente;
    }

    protected void setFuente(Fuente fuente) {
        this.fuente = fuente;
    }
}
