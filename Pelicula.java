import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String genero;
    private List<Actor> actores;

    public Pelicula(String titulo, int año, String genero, List<Actor> actores) {
        super(titulo, año);
        this.genero = genero;
        this.actores = actores;
    }

    public void mostrarActores() {
        System.out.println("Actores de la película " + getTitulo() + ":");
        for (Actor actor : actores) {
            actor.mostrarInfo();
        }
    }

    // Resto de métodos...
}
