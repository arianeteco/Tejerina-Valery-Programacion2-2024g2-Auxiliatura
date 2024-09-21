package practica2.SistemaDeBotin;
public class Arma extends Botin {
    private int daño;

    public Arma(String rareza, int daño) {
        super("Arma", rareza);
        this.daño = daño;
    }

    @Override
    public String toString() {
        return super.toString() + ", Daño: " + daño + " puntos.";
    }
}

