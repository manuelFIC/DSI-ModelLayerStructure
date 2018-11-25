package com.udc.muei.dsi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LineaVideo extends Proyecto{

    private String nombreProyecto;
    private List<Proyecto> proyectos = new ArrayList<>();

    /* Atributos propios de una linea de video*/

    public LineaVideo(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    @Override
    public String getNombreProyecto() {
        return nombreProyecto + ": {"+proyectos.stream()
                .map(Proyecto::getNombreProyecto)
                .collect(Collectors.joining(","))+"}";
    }

    public LineaVideo(String nombreProyecto, List<Proyecto> proyectos) {
        this.nombreProyecto = nombreProyecto;
        this.proyectos = proyectos;
    }

    public void addProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void removeProyecto(Proyecto proyecto) {
        proyectos.remove(proyecto);
    }

    public Proyecto getProyecto(int index) {
       return proyectos.get(index);
    }
}
