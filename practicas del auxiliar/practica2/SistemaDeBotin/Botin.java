package practica2.SistemaDeBotin;
public class Botin {
    private String tipo;
    private String rareza;

    public Botin(String tipo, String rareza) {
        this.tipo = tipo;
        this.rareza = rareza;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRareza() {
        return rareza;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Rareza: " + rareza;
    }
}
