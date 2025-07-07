import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private List<Investigador> investigadores;

    public Documental(String titulo, int año, List<Investigador> investigadores) {
        super(titulo, año);
        this.investigadores = investigadores;
    }

    public void mostrarInvestigadores() {
        System.out.println("Investigadores del documental " + getTitulo() + ":");
        for (Investigador inv : investigadores) {
            inv.mostrarInfo();
        }
    }

    // Resto de métodos...
}
