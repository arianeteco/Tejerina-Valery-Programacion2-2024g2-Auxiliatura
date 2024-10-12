package tarea3;

public class Guerrero extends Personaje {
	private int fuerza;
	
	public Guerrero (String nombre, int nivel, int puntosdeVida, int fuerza) {
		super(nombre, nivel, puntosdeVida);
		this.fuerza = fuerza;
	}
	public void atacar() {
		System.out.println( nombre + "ha lanzado un ataque!");
		 fuerza--; 
		 if (fuerza < 0) {
			 fuerza = 0;
		 }
	}
	@Override 
	public void mostrarEstado() {
		super.mostrarEstado();
		System.out.println("Fuerza: " + fuerza);
	}
}
