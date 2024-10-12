package tarea4ejercicio1;

class CartaEspecial extends Carta implements Accionable {
   
    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("Se ha jugado una carta especial: " + valor + " de " + palo);
        realizarAccion(); 
    }
    @Override
    public void realizarAccion() {
        System.out.println("Acción especial realizada por la carta " + valor + " de " + palo);
    }
}

