package practica2.SistemaDeBotin;
public class Escudo extends Botin {
    private int absorcion;

    public Escudo(String rareza, int absorcion) {
        super("Escudo", rareza);
        this.absorcion = absorcion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Absorción: " + absorcion + " puntos.";
    }
}

