package practica2.SistemaDeBotin;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SistemaDeBotin {
    private static final String[] RAREZAS = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Botin> botinesObtenidos = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            Botin botin = generarBotin();
            System.out.println("¡Has derrotado a un enemigo y encontrado un botín!");
            System.out.println(botin);

            // Agregar el botín a la lista de botines obtenidos
            botinesObtenidos.add(botin);

            // Preguntar si desea continuar
            System.out.print("¿Deseas enfrentarte a más enemigos para obtener más botín? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            continuar = respuesta.equals("s");
        }

        // Mostrar resumen del botín obtenido
        mostrarResumen();
    }

    public static Botin generarBotin() {
        String tipo = obtenerTipoBotin();
        String rareza = RAREZAS[random.nextInt(RAREZAS.length)];

        switch (tipo) {
            case "Arma":
                int daño = random.nextInt(100) + 1; // Daño entre 1 y 100
                return new Arma(rareza, daño);
            case "Escudo":
                int absorcion = random.nextInt(50) + 1; // Absorción entre 1 y 50
                return new Escudo(rareza, absorcion);
            case "Modificador de Habilidad":
                String estadistica = obtenerEstadistica();
                return new ModificadorHabilidad(rareza, estadistica);
            default:
                return null;
        }
    }

    private static String obtenerTipoBotin() {
        String[] tipos = {"Arma", "Escudo", "Modificador de Habilidad"};
        return tipos[random.nextInt(tipos.length)];
    }

    private static String obtenerEstadistica() {
        String[] estadisticas = {"Velocidad", "Fuerza", "Inteligencia", "Resistencia"};
        return estadisticas[random.nextInt(estadisticas.length)];
    }

    private static void mostrarResumen() {
        System.out.println("\n--- Resumen del Botín Obtenido ---");
        for (Botin botin : botinesObtenidos) {
            System.out.println(botin);
        }
        System.out.println("----------------------------------");
        System.out.println("¡Gracias por jugar!");
    }
}

