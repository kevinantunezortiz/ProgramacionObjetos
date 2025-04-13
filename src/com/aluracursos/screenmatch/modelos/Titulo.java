package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.Exceptions.ErrorEnConversionDeDuracionMinutosException;
import com.google.gson.annotations.SerializedName;

import java.util.Comparator;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int numeroDeEvaluaciones;

    public Titulo(String nombre) {
        this.nombre = nombre;
    }


    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        nombre = tituloOmdb.title();
        if(tituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionMinutosException("no pude convertir la duración por que contiene un N/A");
        }
        fechaDeLanzamiento = Integer.valueOf(tituloOmdb.year());
        duracionEnMinutos= Integer.valueOf(tituloOmdb.runtime().replace(" min",""));
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la Pelicula es: "+nombre);
        System.out.println("su fecha de lanzamiento es: "+fechaDeLanzamiento);
        System.out.println("y tiene una duración: "+getDuracionEnMinutos()+" minutos");
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones +=nota;
        numeroDeEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones/numeroDeEvaluaciones;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public int getNumeroDeEvaluaciones() {
        return numeroDeEvaluaciones;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracionEnMinutos=" + duracionEnMinutos +
                '}';
    }
}
