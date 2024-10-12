package tarea3;

public class Zombie extends Enemigo {
	public Zombie (String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }
	  @Override
	    public int atacar() {
	        regenerarVida();
	        return dañoBase;
	    }
	  private void regenerarVida() {
	        puntosdeVida += 5;
	        System.out.println(nombre + " se ha regenerado y ha ganado 5 puntos de vida. Puntos de vida actuales: " + puntosdeVida);
	    }
}
