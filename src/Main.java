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
        System.out.println(miPelicula.getSumaDeLasEvaluaciones());
        System.out.println(miPelicula.getNumeroDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(8);
        otraPelicula.evalua(10);
        otraPelicula.evalua(9);
        otraPelicula.evalua(10);
        System.out.println(otraPelicula.getSumaDeLasEvaluaciones());
        System.out.println(otraPelicula.getNumeroDeEvaluaciones());
        System.out.println(otraPelicula.calculaMedia());
    }
}