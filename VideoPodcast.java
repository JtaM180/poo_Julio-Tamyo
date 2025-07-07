public class VideoPodcast extends ContenidoAudiovisual {
    private String anfitrion;
    private int duracionMinutos;

    public VideoPodcast(String titulo, int año, String anfitrion, int duracionMinutos) {
        super(titulo, año);
        this.anfitrion = anfitrion;
        this.duracionMinutos = duracionMinutos;
    }

    public void reproducir() {
        System.out.println("Reproduciendo VideoPodcast: " + getTitulo() + " con " + anfitrion);
    }
}
