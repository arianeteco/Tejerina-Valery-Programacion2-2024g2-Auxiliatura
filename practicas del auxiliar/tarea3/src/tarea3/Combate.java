package tarea3;
import java.util.Random;

public class Combate {
	    
	    public static void main(String[] args) {
	        Random random = new Random();

	      
	        Mago mago = new Mago("Merlín", random.nextInt(10) + 1, 100, 100);
	        Guerrero guerrero = new Guerrero("Conan", random.nextInt(10) + 1, 100, 80);

	        // Mostrar el estado inicial de ambos personajes
	        System.out.println("¡Comienza el combate!");
	        mago.mostrarEstado();
	        guerrero.mostrarEstado();
	        
	        boolean turnoMago = true; // True si es turno del mago, False si es del guerrero
	        
	        while (mago.getPuntosVida() > 0 && guerrero.getPuntosVida() > 0) {
	            if (turnoMago) {
	                // Turno del mago
	                System.out.println("\nTurno de " + mago.getNombre());
	                int daño = random.nextInt(11) + 10;
	                mago.lanzarHechizo();
	                guerrero.recibirDaño(daño);
	                if (random.nextBoolean()) { 
	                    mago.getInventario().agregarItem("Piedra Mágica");
	                }
	            } else {
	           
	                System.out.println("\nTurno de " + guerrero.getNombre());
	                int daño = random.nextInt(11) + 10;
	                guerrero.atacar();
	                mago.recibirDaño(daño);
	                if (random.nextBoolean()) { 
	                    guerrero.getInventario().agregarItem("Amuleto de Fuerza");
	                }
	            }

	            mago.mostrarEstado();
	            guerrero.mostrarEstado();

	            // Cambiar de turno
	            turnoMago = !turnoMago;
	        }
	        if (mago.getPuntosVida() <= 0) {
	            System.out.println("\n¡" + guerrero.getNombre() + " ha ganado el combate!");
	        } else {
	            System.out.println("\n¡" + mago.getNombre() + " ha ganado el combate!");
	        }
	    }
	}

