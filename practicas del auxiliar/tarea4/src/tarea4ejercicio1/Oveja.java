package tarea4ejercicio1;

public class Oveja extends Animal implements Productor,Comer {

    public Oveja(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace 'Beee'");
    }
    @Override
    public void producir() {
        System.out.println(nombre + " está produciendo lana.");
    }
    @Override
    public void comiendo() {
        System.out.println(nombre + " está comiendo.");
    }
	
}