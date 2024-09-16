package math;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector coordenada = new Vector(6,3);
		Vector a = new Vector(5,9);
		Vector b = new Vector(10,3);
		Vector x = new Vector (-6,-24);
		Vector y = new Vector(22,8);
		BaseOperation operaciones = new BaseOperation();
		coordenada.Tipo1();
		System.out.println(coordenada.Tipo1());
		operaciones.suma(5,7);
		System.out.println(operaciones.suma(6,8));
		System.out.println(operaciones.suma(a, b));
		System.out.println(operaciones.resta(5,8));
		System.out.println(operaciones.resta(x,y));
		System.out.println(operaciones.multiplicacion(5,5));
		System.out.println(operaciones.multiplicacion(6,y));
		System.out.println(operaciones.division(8,4));
	}
	

}