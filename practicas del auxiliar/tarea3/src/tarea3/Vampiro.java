package tarea3;

public class Vampiro extends Enemigo {
	
	public Vampiro(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }
	 @Override
	    public int atacar() {
	        robarVida(dañoBase);
	        return dañoBase;
	    }
	    private void robarVida(int daño) {
	        int vidaRobada = daño / 2;
	        puntosdeVida += vidaRobada;
	        System.out.println(nombre + " ha robado " + vidaRobada + " puntos de vida. Puntos de vida actuales: " + puntosdeVida);
	    }
}
