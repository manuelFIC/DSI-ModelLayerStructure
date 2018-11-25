package com.udc.muei.dsi;

public class Anotacion extends Fuente {

    private Fuente fuente;
    private String tituloAnotacion;
    private String anotacion;

    /* Atributos propios de una anotacion*/

    public Anotacion(Fuente fuente, String tituloAnotacion) {
        this.fuente = fuente;
        this.tituloAnotacion = tituloAnotacion;
    }

    @Override
    public String getNombre() {
        return "{Anotacion: " + getTituloAnotacion() +", " + this.fuente.getNombre() + "}";
    }

    public String getTituloAnotacion() {
        return tituloAnotacion;
    }

    public void setTituloAnotacion(String tituloAnotacion) {
        this.tituloAnotacion = tituloAnotacion;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

}
