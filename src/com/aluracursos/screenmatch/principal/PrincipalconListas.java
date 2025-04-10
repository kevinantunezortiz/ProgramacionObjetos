package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalconListas {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList();
        var pelicula = new Pelicula("El Señor de los anillos",2001);
        var matrix = new Pelicula("Matrix",1999);
        var encanto = new Pelicula("Encanto",2021);
        var lost = new Serie("Lost",2000);
        var casaDragon = new Serie("La Casa del Dragon",2022);
        listaTitulos.add(pelicula);
        listaTitulos.add(matrix);
        listaTitulos.add(encanto);
        listaTitulos.add(lost);
        listaTitulos.add(casaDragon);
        encanto.evalua(9);
        pelicula.evalua(10);
        matrix.evalua(4);
        for (Titulo titulo: listaTitulos) {
            System.out.println(titulo.toString());
            if(titulo instanceof Pelicula objPelicula && objPelicula.getClasificacion()>2){
                System.out.println(objPelicula.getClasificacion());
            }
        }
        Pelicula p1 = pelicula;
        p1.setNombre("XD");
        System.out.println(pelicula.getNombre());
        System.out.println(p1.getNombre());
    }
}
