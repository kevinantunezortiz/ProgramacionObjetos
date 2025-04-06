public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento=2021;
        miPelicula.duracionEnMinutos=120;
        miPelicula.incluidoEnElPlan=true;

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre="Matrix";
        otraPelicula.fechaDeLanzamiento=1999;
        otraPelicula.duracionEnMinutos = 180;
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9);
        miPelicula.evalua(10);
        miPelicula.evalua(9);
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.numeroDeEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        otraPelicula.muestraFichaTecnica();
        miPelicula.evalua(9);
        miPelicula.evalua(10);
        miPelicula.evalua(9);
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.numeroDeEvaluaciones);
        System.out.println(miPelicula.calculaMedia());
    }
}