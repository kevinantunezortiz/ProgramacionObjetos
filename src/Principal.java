import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;


import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var listaDePeliculas = new ArrayList<Pelicula>();
        var pelicula = new Pelicula("El Señor de los anillos");
        pelicula.setDuracionEnMinutos(180);
        pelicula.setFechaDeLanzamiento(2001);

        var matrix = new Pelicula("Matrix");
        matrix.setDuracionEnMinutos(120);
        matrix.setFechaDeLanzamiento(1999);

        var encanto = new Pelicula("Encanto");
        encanto.setFechaDeLanzamiento(2021);
        encanto.setDuracionEnMinutos(120);

        listaDePeliculas.add(pelicula);
        listaDePeliculas.add(matrix);
        listaDePeliculas.add(encanto);
        System.out.println("Tamaño de la lista: "+listaDePeliculas.size());
        System.out.println("La primera pelicula es: "+listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        listaDePeliculas.forEach(pelicula1 -> {
            System.out.println(pelicula1.toString());
        });

    }
}
