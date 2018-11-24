package com.udc.muei.dsi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* Creamos un proyecto "Proyecto_1"*/
        Proyecto proyecto = new LineaVideo("Proyecto_1");
        System.out.println(proyecto.getNombreProyecto());

        /* Añadimos una linea de edición "Linea_1" al proyecto"*/
        LineaVideo lineaVideo1 = new LineaVideo("Linea_1");
        ((LineaVideo) proyecto).addProyecto(lineaVideo1);
        System.out.println(proyecto.getNombreProyecto());

        /* Añadimos una linea de edición "Linea_2" al proyecto"*/
        LineaVideo lineaVideo2 = new LineaVideo("Linea_2");
        ((LineaVideo) proyecto).addProyecto(lineaVideo2);
        System.out.println(proyecto.getNombreProyecto());

        /* Añadimos una imagen a la línea de edición "Linea_1"*/
        Imagen imagen1 =  new Imagen("Imagen_1");
        lineaVideo1.addProyecto(imagen1);
        System.out.println(proyecto.getNombreProyecto());

        /*Crearemos el video_1 y añadiremos un anotacion*/
        Fuente video1 = new Video("Video_1");
        video1 = new Anotacion(video1, "Anotacion para video1");
        System.out.println(video1.getNombre());

        /* Creamos una imagen("Imagen_2") y un video("Video_1") y hacemos una composición paralela*/
        Fuente imagen2 = new Imagen("Imagen_2");
        Fuente paralela = new Paralela("Paralela");
        ((Paralela) paralela).addFuente(imagen2);
        ((Paralela) paralela).addFuente(video1);
        System.out.println(paralela.getNombre());

        /* Añadimos la composición a la linea de edicion "Linea_1"*/
        lineaVideo1.addProyecto(paralela);
        System.out.println(proyecto.getNombreProyecto());

        /* Crearemos una composición secuencial de "Imagen_1" y "Video_1"*/
        Secuencial secuencial = new Secuencial("Secuencial");
        secuencial.addFuente(imagen1);
        secuencial.addFuente(video1);
        System.out.println(secuencial.getNombre());

        /* Aplicaremos una filtro ("FiltroA") a la composición secuencial*/
        Fuente secuencialFiltrada = new FiltroA(secuencial);
        System.out.println(secuencialFiltrada.getNombre());

        /* Se añade la composición filtrada a la línea_2 */
        lineaVideo2.addProyecto(secuencialFiltrada);
        System.out.println(proyecto.getNombreProyecto());

    }
}
