package tarea4ejercicio1;

 class CartaNormal extends Carta {
	 public CartaNormal(int valor, String palo) {
		super(valor, palo);
	 }
		    @Override
		    public void jugar() {
		        System.out.println("Se ha jugado una carta normal: " + valor + " de " + palo);
	}
}

