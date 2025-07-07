import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Tom Hanks", 65, "Estadounidense");
        Actor actor2 = new Actor("Penélope Cruz", 48, "Española");

        Pelicula pelicula = new Pelicula("Forrest Gump", 1994, "Drama", Arrays.asList(actor1, actor2));
        pelicula.mostrarActores();

        Temporada t1 = new Temporada(1, 10);
        Temporada t2 = new Temporada(2, 12);
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 2008, Arrays.asList(t1, t2));
        serie.mostrarTemporadas();

        Investigador inv1 = new Investigador("Jane Doe", "Biología Marina");
        Documental docu = new Documental("Los Secretos del Océano", 2022, Arrays.asList(inv1));
        docu.mostrarInvestigadores();

        VideoPodcast vp = new VideoPodcast("Tech Talks", 2023, "Laura Sánchez", 45);
        vp.reproducir();

        Cortometraje corto = new Cortometraje("Corto de Animación", 2021, "Pedro López", 15);
        corto.mostrarDatos();
    }
}
