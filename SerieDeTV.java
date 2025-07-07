import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int año, List<Temporada> temporadas) {
        super(titulo, año);
        this.temporadas = temporadas;
    }

    public void mostrarTemporadas() {
        System.out.println("Temporadas de la serie " + getTitulo() + ":");
        for (Temporada temp : temporadas) {
            temp.mostrarTemporada();
        }
    }

    // Resto de métodos...
}
