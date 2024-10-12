package tarea4ejercicio1;
abstract class Animal {
	 protected String nombre;
	 protected int edad;

	    public Animal(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public abstract void hacerSonido();

	    public void mostrarInfo() {
	        System.out.println(nombre + edad);
	    }

		public void Comer() {
			System.out.println(nombre + " está comiendo.");
		}

}
