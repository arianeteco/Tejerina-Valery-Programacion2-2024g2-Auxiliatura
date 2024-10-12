package tarea4ejercicio1;

public class Moto extends Vehiculo implements Turbo,Lavado {
	 public Moto(String marca, String modelo, int velocidadMaxima) {
	        super(marca, modelo, velocidadMaxima);
	    }
	    public void acelerar() {
	        System.out.println("La moto " + marca + " está acelerando.");
	    }
	    public void activarTurbo() {
	        System.out.println(marca+" "+modelo+" "+velocidadMaxima+" "+"Turbo activado");
	    }
	    public void lavar() {
	        System.out.println("La moto se esta Lavando");
	    }
		
}
