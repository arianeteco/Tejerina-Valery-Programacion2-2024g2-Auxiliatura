package practica2;
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fchas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Diccionario para convertir el nombre del mes a su número correspondiente y sus días
        Map<String, Integer> meses = new HashMap<>();
        meses.put("enero", 31);
        meses.put("febrero", 28); // Consideraremos años no bisiestos
        meses.put("marzo", 31);
        meses.put("abril", 30);
        meses.put("mayo", 31);
        meses.put("junio", 30);
        meses.put("julio", 31);
        meses.put("agosto", 31);
        meses.put("septiembre", 30);
        meses.put("octubre", 31);
        meses.put("noviembre", 30);
        meses.put("diciembre", 31);

        // Entrada del usuario
        System.out.print("Introduce la fecha (por ejemplo, '30 de febrero de 2023'): ");
        String cadenaFecha = scanner.nextLine();
        
        // Dividir la cadena en partes
        String[] partes = cadenaFecha.split(" ");
        
        // Extraer el día, el mes y el año
        String diaStr = partes[0];
        String mes = partes[2].toLowerCase();  // Convertir a minúsculas
        String añoStr = partes[4];

        // Convertir a enteros
        int dia = Integer.parseInt(diaStr);
        int año = Integer.parseInt(añoStr);

        // Verificar si el mes es válido
        if (!meses.containsKey(mes)) {
            System.out.println("Mes no válido.");
            scanner.close();
            return;
        }

        // Obtener el número de días del mes
        int diasDelMes = meses.get(mes);

        // Ajustar para años bisiestos en febrero
        if (mes.equals("febrero") && esBisiesto(año)) {
            diasDelMes = 29;
        }

        // Validar el día
        if (dia < 1 || dia > diasDelMes) {
            System.out.println("Error: El día " + dia + " no es válido para el mes de " + mes + ".");
        } else {
            // Convertir el mes a su formato numérico
            String mesNumerico = String.format("%02d", obtenerNumeroMes(mes));
            // Formar la fecha en formato numérico
            String fechaNumerica = String.format("%02d/%s/%d", dia, mesNumerico, año);
            // Mostrar la fecha en formato numérico
            System.out.println("Fecha en formato numérico: " + fechaNumerica);
        }
        
        scanner.close();
    }

    // Método para verificar si un año es bisiesto
    private static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Método para obtener el número del mes
    private static int obtenerNumeroMes(String mes) {
        switch (mes) {
            case "enero": return 1;
            case "febrero": return 2;
            case "marzo": return 3;
            case "abril": return 4;
            case "mayo": return 5;
            case "junio": return 6;
            case "julio": return 7;
            case "agosto": return 8;
            case "septiembre": return 9;
            case "octubre": return 10;
            case "noviembre": return 11;
            case "diciembre": return 12;
            default: return 0;
        }
    }
}
