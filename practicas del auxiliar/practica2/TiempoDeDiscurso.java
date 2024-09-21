package practica2;
import java.util.Scanner;

public class TiempoDeDiscurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número de directores
        System.out.println("ingrese la cantidad de directores: ");
        int N = scanner.nextInt();
        // Leer la duración máxima de la reunión
        System.out.println("Ingrese la duracion de la reunion: ");
        int K = scanner.nextInt();
        
        // Calcular la duración máxima de cada discurso
        int T = (K - (N - 1)) / N;
        
        // Imprimir el resultado
        System.out.println("la duracion maxima de cada discurso es de "+ T +" minutos");
    }
}
