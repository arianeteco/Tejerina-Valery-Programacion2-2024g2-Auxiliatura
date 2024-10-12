package tarea4ejercicio1;

abstract class Carta {
	 protected int valor;
	 protected String palo;

	    public Carta(int valor, String palo) {
	        this.valor = valor;
	        this.palo = palo;
	    }

	    public abstract void jugar();

	    public void mostrarCarta() {
	        System.out.println(valor + palo);
	    }

}
