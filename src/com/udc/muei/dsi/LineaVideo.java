package com.udc.muei.dsi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LineaVideo extends ComponenteVideo{

    private String nombreLinea;
    private List<ComponenteVideo> componenteVideos = new ArrayList<>();

    /* Atributos propios de una linea de video*/

    public LineaVideo(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public String getNombreLinea() {
        return nombreLinea;
    }

    @Override
    String getNombreComponente() {
        return "{"+this.nombreLinea+" ["+this.componenteVideos.stream()
                        .map(ComponenteVideo::getNombreComponente)
                        .collect(Collectors.joining(","))+"]}";
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public void addComponenteVideo(ComponenteVideo componenteVideo) {
        this.componenteVideos.add(componenteVideo);
    }

    public ComponenteVideo getComponenteVideo(int index) {
        return this.componenteVideos.get(index);
    }

    public void removeComponenteVideo(ComponenteVideo componenteVideo) {
        this.componenteVideos.remove(componenteVideo);
    }

    public List<ComponenteVideo> getComponenteVideos() {
        return componenteVideos;
    }

    public void setComponenteVideos(List<ComponenteVideo> componenteVideos) {
        this.componenteVideos = componenteVideos;
    }
}
