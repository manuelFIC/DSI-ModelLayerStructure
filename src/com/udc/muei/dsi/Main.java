package com.udc.muei.dsi;


public class Main {

    public static void main(String[] args) {

        System.out.println("\nCreamos un proyecto \"Proyecto_1\"");
        Proyecto proyecto = new Proyecto("Proyecto_1");
        System.out.println(proyecto.getNombreProyecto());

        System.out.println("\nAñadimos dos linea de edición \"Linea_1\" y \"Linea_2\" al proyecto");
        LineaVideo lineaVideo1 = new LineaVideo("Linea_1");
        LineaVideo lineaVideo2 = new LineaVideo("Linea_2");
        proyecto.addComponenteVideo(lineaVideo1);
        proyecto.addComponenteVideo(lineaVideo2);
        System.out.println(proyecto.getNombresComponentes());

        System.out.println("\nAñadimos una imagen a la línea de edición \"Linea_1\"");
        Imagen imagen1 =  new Imagen("Imagen_1");
        lineaVideo1.addComponenteVideo(imagen1);
        System.out.println(proyecto.getNombresComponentes());

        System.out.println("\nCrearemos el \"Video_1\" y le añadiremos una anotacion");
        Fuente video1 = new Video("Video_1");
        video1 = new Anotacion(video1, "Anotacion para video1");
        System.out.println(video1.getNombre());

        System.out.println("\nCreamos una imagen(\"Imagen_2\") y un video(\"Video_1\") y hacemos una composición paralela");
        Imagen imagen2 = new Imagen("Imagen_2");
        Paralela paralela = new Paralela("Paralela");
        paralela.addFuente(imagen2);
        paralela.addFuente(video1);
        System.out.println(paralela.getNombre());

        System.out.println("\nAñadimos la composición a la linea de edicion \"Linea_1\"");
        lineaVideo1.addComponenteVideo(paralela);
        System.out.println(proyecto.getNombresComponentes());

        System.out.println("\nCrearemos una composición secuencial de \"Imagen_1\" y \"Video_1\"");
        Secuencial secuencial = new Secuencial("Secuencial");
        secuencial.addFuente(imagen1);
        secuencial.addFuente(video1);
        System.out.println(secuencial.getNombre());

        System.out.println("\nAplicaremos una filtro (\"FiltroA\") a la composición secuencial");
        Fuente secuencialFiltrada = new FiltroA(secuencial);
        System.out.println(secuencialFiltrada.getNombre());

        System.out.println("\nSe añade la composición filtrada a la \"línea_2\"");
        lineaVideo2.addComponenteVideo(secuencialFiltrada);
        System.out.println(proyecto.getNombresComponentes());

    }
}
