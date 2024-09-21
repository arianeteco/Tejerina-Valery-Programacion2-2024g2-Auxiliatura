package practica2;
import java.util.ArrayList;
import java.util.Scanner;

public class Fraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(1);
		Scanner scanner = new Scanner(System.in);
		int indice = scanner.nextInt();
		for(int i=0; i<indice-1;i++)
			lista.add(lista.getLast()+lista.get(i));
		System.out.println(lista.getLast());
	}

}