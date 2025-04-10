package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;


import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var listaDePeliculas = new ArrayList<Pelicula>();
        var pelicula = new Pelicula("El Señor de los anillos",2001);
        pelicula.setDuracionEnMinutos(180);
        pelicula.setFechaDeLanzamiento(2001);

        var matrix = new Pelicula("Matrix",1999);
        matrix.setDuracionEnMinutos(120);


        var encanto = new Pelicula("Encanto",2021);
        encanto.setDuracionEnMinutos(120);
        listaDePeliculas.add(pelicula);
        listaDePeliculas.add(matrix);
        listaDePeliculas.add(encanto);
        System.out.println("Tamaño de la lista: "+listaDePeliculas.size());
        System.out.println("La primera pelicula es: "+listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        for (Pelicula pelicula1 : listaDePeliculas) {
            System.out.println(pelicula1.toString());
        }

    }
}
