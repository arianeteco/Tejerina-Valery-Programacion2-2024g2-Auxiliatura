package tarea3;

public class Jefe extends Enemigo {
	 private double multiplicadorDaño;

	    // Constructor
	    public Jefe(String nombre, int puntosVida, int dañoBase, double multiplicadorDaño) {
	        super(nombre, puntosVida, dañoBase);
	        this.multiplicadorDaño = multiplicadorDaño;
	    }
	    public void hablar() {
	        System.out.println(nombre + " dice: ¡hasta la vista baby!");
	    }
	    public int ataqueCritico() {
	        int dañoCritico = (int) (dañoBase * multiplicadorDaño);
	        System.out.println(nombre + " realiza un ataque crítico infligiendo " + dañoCritico + " puntos de daño.");
	        return dañoCritico;
	    }

	    @Override
	    public int atacar() {
	        System.out.println(nombre + " ataca infligiendo " + dañoBase + " puntos de daño.");
	        return dañoBase;
	    }

}
