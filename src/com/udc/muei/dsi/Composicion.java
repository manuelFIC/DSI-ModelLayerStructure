package com.udc.muei.dsi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Composicion extends Fuente{
    private List<Fuente> fuentes = new ArrayList<>();

    /* Atributos propios de una composición */

    public List<Fuente> getFuentes() {
        return fuentes;
    }

    public void removeFuente(Fuente fuente) {
        fuentes.remove(fuente);
    }

    public Fuente getFuente(int index) {
        return fuentes.get(index);
    }

    public void addFuente(Fuente fuente) {
        this.fuentes.add(fuente);
    }

    public void setFuentes(List<Fuente> fuentes) {
        this.fuentes = fuentes;
    }

    @Override
    public String getNombre() {
        return  "{"+getNombreComposicion() + "["+ getFuentes().stream()
                        .map(Fuente::getNombre)
                        .collect(Collectors.joining(","))+"]}";
    }

    protected abstract String getNombreComposicion();
}
