package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas,episodiosPorTemporada, minutosPorEpisodio;

    public Serie(String nombre,int fechaDeLanzamiento) {
        super(nombre,fechaDeLanzamiento);
    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos() {
        return minutosPorEpisodio* temporadas * episodiosPorTemporada;
    }
    @Override
    public String toString() {
        return "Serie: "+getNombre()+" ("+getFechaDeLanzamiento()+")";
    }
}
