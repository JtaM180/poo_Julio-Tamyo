public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private int duracionMinutos;

    public Cortometraje(String titulo, int año, String director, int duracionMinutos) {
        super(titulo, año);
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }

    public void mostrarDatos() {
        System.out.println("Cortometraje: " + getTitulo() + ", dirigido por " + director);
    }
}
