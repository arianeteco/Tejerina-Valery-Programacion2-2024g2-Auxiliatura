package tarea3;

public class MainJefe {
	 public static void main(String[] args) {
	        Jefe jefeFinal = new Jefe("Dragón Rojo", 200, 30, 2.5);

	        jefeFinal.hablar();

	        jefeFinal.mostrarEstado();

	        System.out.println("\nEl jefe realiza un ataque regular:");
	        jefeFinal.atacar(); 
	        System.out.println("\nEl jefe realiza un ataque crítico:");
	        jefeFinal.ataqueCritico();  
	        jefeFinal.recibirDaño(50);
	        jefeFinal.mostrarEstado();
	    }
}
