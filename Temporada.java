public class Temporada {
    private int numero;
    private int cantidadEpisodios;

    public Temporada(int numero, int cantidadEpisodios) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public void mostrarTemporada() {
        System.out.println("Temporada " + numero + ": " + cantidadEpisodios + " episodios.");
    }

    // Getters y Setters
}
