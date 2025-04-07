public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int numeroDeEvaluaciones;
    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+nombre);
        System.out.println("su fecha de lanzamiento es: "+fechaDeLanzamiento);
        System.out.println("y tiene una duración: "+duracionEnMinutos+" minutos");
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones +=nota;
        numeroDeEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones/numeroDeEvaluaciones;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public int getNumeroDeEvaluaciones() {
        return numeroDeEvaluaciones;
    }

}
