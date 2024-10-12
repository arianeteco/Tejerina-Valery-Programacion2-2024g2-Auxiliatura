package tarea4ejercicio1;
	public class Coche extends Vehiculo implements Lavado {
		 public Coche(String marca, String modelo, int velocidadMaxima) {
		        super(marca, modelo, velocidadMaxima);
		    }
		    @Override
		    public void acelerar() {
		        System.out.println("El coche está acelerando.");
		    }
		    public void lavar() {
		        System.out.println("El coche se esta lavando");
		    }
	
}

