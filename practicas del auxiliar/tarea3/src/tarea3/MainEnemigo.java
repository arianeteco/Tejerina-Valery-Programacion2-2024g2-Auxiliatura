package tarea3;

public class MainEnemigo {
	 public static void main1(String[] args) {
	        Zombie zombie = new Zombie("Zombie01", 50, 15);
	        Vampiro vampiro = new Vampiro("Vampiro01", 60, 20);
	        zombie.mostrarEstado();
	        vampiro.mostrarEstado();
	        System.out.println("\nEl Zombie ataca:");
	        int dañoZombie = zombie.atacar();
	        vampiro.recibirDaño(dañoZombie);

	        System.out.println("\nEl Vampiro ataca:");
	        int dañoVampiro = vampiro.atacar();
	        zombie.recibirDaño(dañoVampiro);
	        zombie.mostrarEstado();
	        vampiro.mostrarEstado();
	        System.out.println("\n¿El Zombie está vivo? " + zombie.estaVivo());
	        System.out.println("¿El Vampiro está vivo? " + vampiro.estaVivo());
	    }
}
