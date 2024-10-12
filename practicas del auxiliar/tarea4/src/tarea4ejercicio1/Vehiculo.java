package tarea4ejercicio1;

abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected int velocidadMaxima;
	
	public Vehiculo (String marca, String modelo, int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		
	}
	  public abstract void acelerar();
	    public void mostrarInfo() {
	        System.out.println( marca + modelo + velocidadMaxima );
	    }
}
