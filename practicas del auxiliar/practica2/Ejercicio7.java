package practica2;
import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        // Crear un arreglo para almacenar los bits
        List<Integer> bits = new ArrayList<>();
        
        // Extraer los bits de todos los números
        for (int number : a) {
            for (int k = 0; k < 32; k++) {
                bits.add((number >> k) & 1);
            }
        }

        // Ordenar los bits en orden inverso (de mayor a menor)
        Collections.sort(bits, Collections.reverseOrder());

        // Crear un nuevo arreglo para el resultado
        int[] result = new int[N];

        // Asignar los bits ordenados a los números
        for (int i = 0; i < N; i++) {
            int newNumber = 0;
            for (int k = 0; k < 32; k++) {
                if (bits.get(i * 32 + k) == 1) {
                    newNumber |= (1 << k);
                }
            }
            result[i] = newNumber;
        }

        // Imprimir el resultado
        for (int number : result) {
            System.out.print(number + " ");
        }
        System.out.println();

        scanner.close();
    }
}
