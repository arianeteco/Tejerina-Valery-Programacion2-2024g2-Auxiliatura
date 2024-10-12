package tarea3;

public class Enemigo {
	protected String nombre;
	protected int puntosdeVida;
	protected int dañoBase;
	
	public  Enemigo (String nombre, int puntosdeVida, int dañoBase) {
		this.nombre = nombre;
		this.puntosdeVida = puntosdeVida;
		this.dañoBase = dañoBase;
	}
	public int atacar() {
		return dañoBase;
	}
	public void recibirDaño(int daño) {
		puntosdeVida -= daño;
		if(puntosdeVida < 0) {
			puntosdeVida = 0;
		}
		System.out.println("ha recibido " + daño + "puntos de daño. Los puntos de vida restante son: " + puntosdeVida);
	}
	public boolean estaVivo() {
		return puntosdeVida > 0;
	}
	public void mostrarEstado() {
		System.out.println("Enemigo: " + nombre + ",Puntos de vida: " + puntosdeVida + ", Daño base: " + dañoBase);
	}

}
