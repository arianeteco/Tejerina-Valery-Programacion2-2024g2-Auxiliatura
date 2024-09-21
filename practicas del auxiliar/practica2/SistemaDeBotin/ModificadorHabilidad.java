package practica2.SistemaDeBotin;
public class ModificadorHabilidad extends Botin {
    private String estadistica;

    public ModificadorHabilidad(String rareza, String estadistica) {
        super("Modificador de Habilidad", rareza);
        this.estadistica = estadistica;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mejora: " + estadistica + ".";
    }
}
