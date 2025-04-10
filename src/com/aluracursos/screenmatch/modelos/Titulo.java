package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
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

}
