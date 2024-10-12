package tarea3;

public class Mago extends Personaje {
	private int mana;
	
	public Mago(String nombre, int nivel, int puntosdeVida, int mana) {
        super(nombre, nivel, puntosdeVida);
        this.mana = mana;
    }
	
	public void lanzarHechizo () {
		System.out.println(nombre + " ha lanzado un hechizo!");
        mana -= 10; 
        if (mana < 0) {
            mana = 0; 
        }
	}
	  @Override
	    public void mostrarEstado() {
	        super.mostrarEstado();
	        System.out.println("Mana: " + mana);
	    }
}
