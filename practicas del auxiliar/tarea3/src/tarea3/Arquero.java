package tarea3;

public class Arquero extends Personaje {
	private int destreza;
	
	 public Arquero(String nombre, int nivel, int puntosdeVida, int destreza) {
	        super(nombre, nivel, puntosdeVida);
	        this.destreza = destreza;
	    }
	 public void dispararFlecha() {
	        System.out.println( nombre + " ha disparado una flecha!");
	        destreza--; 
	        if (destreza < 0) {
	            destreza = 0;
	        }
	    }
	 @Override
	    public void mostrarEstado() {
	        super.mostrarEstado();
	        System.out.println("Destreza: " + destreza);
	    }

}
