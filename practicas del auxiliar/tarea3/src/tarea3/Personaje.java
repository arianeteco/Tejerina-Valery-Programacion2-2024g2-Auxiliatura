package tarea3;

public class Personaje {
	protected String nombre;
	protected int nivel;
	protected int puntosdeVida;
	protected Inventario inventario;
	
	public Personaje (String nombre, int nivel, int puntosdeVida) {
		this.nombre = nombre;
		this.nivel = nivel; 
		this.puntosdeVida = puntosdeVida;
		this.inventario = new Inventario ();
	}
	public void mostrarEstado () {
		System.out.println("Nombre: " + nombre + ",Nivel: " + nivel + ",Puntos de Vida: " + puntosdeVida  );
		inventario.mostrarItems();
	}
	public void recibirDaño (int daño) {
		 puntosdeVida -= daño;
	        if (puntosdeVida < 0) {
	            puntosdeVida = 0;
	        }
	        System.out.println(nombre + " ha recibido " + daño + " puntos de daño. Puntos de vida restantes: " + puntosdeVida);
	}
	public void curar () {
		puntosdeVida += 20;
		System.out.println(nombre + " ha sido curado. Puntos de vida actuales: " + puntosdeVida);	
	}
	public void agregamosItemalInventario(String item) {
		 inventario.agregarItem(item);
	}
	public String getNombre() {
        return this.nombre;
    }
    public int getPuntosVida() {
        return this.puntosdeVida;
    }
    public Inventario getInventario() {
        return inventario;
    }

}
