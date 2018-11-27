package com.udc.muei.dsi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Proyecto  {

   private String nombreProyecto;
   private List<ComponenteVideo> componenteVideos = new ArrayList<>();

   public Proyecto(String nombreProyecto) {
      this.nombreProyecto = nombreProyecto;
   }

   public String getNombreProyecto() {
      return nombreProyecto;
   }

   public void setNombreProyecto(String nombreProyecto) {
      this.nombreProyecto = nombreProyecto;
   }

   public String getNombresComponentes() {
      return "Proyecto: "+ this.nombreProyecto+"\n\t"+
                  this.getComponenteVideos().stream()
                     .map(ComponenteVideo::getNombreComponente)
                     .collect(Collectors.joining("\n\t"))+"\n";
   }

   public void addComponenteVideo(ComponenteVideo componenteVideo){
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
