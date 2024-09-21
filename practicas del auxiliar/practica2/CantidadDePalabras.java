package practica2;
import java.util.List;

public class CantidadDePalabras {
    
    public static void main(String[] args) {
        List<String> palabras = List.of("parangaricutirimicuaro", "botella", "sandia", "programacion", "cerro", "papá");
        char letra = 'p'; //puede ser una letra cualquiera

        int cantidad = contarPalabrasConLetra(palabras, letra);
        System.out.println("Cantidad de palabras que comienzan con '" + letra + "': " + cantidad);
    }

    public static int contarPalabrasConLetra(List<String> palabras, char letra) {
        int contador = 0;

        // Convertir la letra a minúsculas para una comparación case-insensitive
        char letraMin = Character.toLowerCase(letra);

        for (String palabra : palabras) {
            // Verificar si la palabra comienza con la letra especificada
            if (Character.toLowerCase(palabra.charAt(0)) == letraMin) {
                contador++;
            }
        }

        return contador;
    }
}
