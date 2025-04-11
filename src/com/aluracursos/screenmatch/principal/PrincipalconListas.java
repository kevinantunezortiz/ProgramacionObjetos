package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalconListas {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList();
        var pelicula = new Pelicula("El Señor de los anillos",2001);
        var matrix = new Pelicula("Matrix",1999);
        var encanto = new Pelicula("Encanto",2021);
        var lost = new Serie("Lost",2000);
        var casaDragon = new Serie("La Casa del Dragon",2022);
        var otra = new Pelicula("John Wick", 2014);
        otra.evalua(9);

        Serie serie = new Serie("La Casa de Papel", 2017);
        listaTitulos.add(pelicula);
        listaTitulos.add(matrix);
        listaTitulos.add(encanto);
        listaTitulos.add(lost);
        listaTitulos.add(casaDragon);
        listaTitulos.add(otra);
        listaTitulos.add(serie);
        encanto.evalua(9);
        pelicula.evalua(10);
        matrix.evalua(6);
        for (Titulo titulo: listaTitulos) {
            System.out.println(titulo.toString());
            if(titulo instanceof Pelicula objPelicula && objPelicula.getClasificacion()>2){
                System.out.println(objPelicula.getClasificacion());
            }
        }
        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Penelope Cruz");
        listaArtistas.add("Antonio Banderas");
        listaArtistas.add("Ricardo Marin");
        System.out.println(listaArtistas);
        Collections.sort(listaArtistas);
        System.out.println(listaArtistas);
        System.out.println(listaTitulos);
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);
        listaTitulos.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento).reversed());
        System.out.println(listaTitulos);
    }
}
