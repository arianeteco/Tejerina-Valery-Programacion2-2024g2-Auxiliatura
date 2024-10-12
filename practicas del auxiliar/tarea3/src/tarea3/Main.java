package tarea3;

public class Main {
	 public static void main(String[] args) {
	        Mago mago = new Mago("Gandalf", 10, 80, 50);
	        mago.mostrarEstado();
	        mago.lanzarHechizo();
	        mago.mostrarEstado();

	        Arquero arquero = new Arquero("Legolas", 8, 75, 40);
	        arquero.mostrarEstado();
	        arquero.dispararFlecha();
	        arquero.mostrarEstado();

	        Guerrero guerrero = new Guerrero("Conan", 9, 100, 60);
	        guerrero.mostrarEstado();
	        guerrero.atacar();
	        guerrero.mostrarEstado();
	    }
}
