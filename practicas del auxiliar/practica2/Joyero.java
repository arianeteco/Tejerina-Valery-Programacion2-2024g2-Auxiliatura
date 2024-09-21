package practica2;
import java.util.Scanner;

public class Joyero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // Número de filas y columnas
        int[][] originalMatrix = new int[N][N];
        
        // Leer la matriz original
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                originalMatrix[i][j] = scanner.nextInt();
            }
        }
        
        int[][] currentMatrix = originalMatrix;

        // Comparar con hasta 3 rotaciones
        for (int rotations = 0; rotations < 4; rotations++) {
            if (isEqual(currentMatrix, originalMatrix)) {
                System.out.println(rotations);
                scanner.close();
                return;
            }
            currentMatrix = rotate90Counterclockwise(currentMatrix);
        }

        // Si no coincide en ninguna rotación
        System.out.println("No coincide");
        scanner.close();
    }

    // Función para rotar 90 grados en sentido antihorario
    private static int[][] rotate90Counterclockwise(int[][] matrix) {
        int N = matrix.length;
        int[][] rotated = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[N - j - 1][i] = matrix[i][j];
            }
        }
        
        return rotated;
    }

    // Función para comparar dos matrices
    private static boolean isEqual(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
