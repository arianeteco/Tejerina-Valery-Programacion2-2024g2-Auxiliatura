package tarea4ejercicio1;

    public class  Vaca extends Animal implements Productor,Comer {

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace 'Muuu'");
    }
    @Override
    public void producir() {
        System.out.println(nombre + " está produciendo leche.");
    }
   
	@Override
	public void comiendo() {
		System.out.println(nombre + " está comiendo");
	}

}