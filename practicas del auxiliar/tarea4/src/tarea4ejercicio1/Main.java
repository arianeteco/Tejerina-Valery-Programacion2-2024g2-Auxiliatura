package tarea4ejercicio1;

public class Main {
    public static void main(String[] args) {
     
        CartaNormal cartanormal = new CartaNormal(5, "Corazones");
        cartanormal.jugar();
        CartaEspecial cartaespecial = new CartaEspecial(7, "Tréboles");
        cartaespecial.jugar();
        Coche coche = new Coche("Toyota: ", "2015 ", 700);
        coche.mostrarInfo();
        coche.lavar();
        Moto moto = new Moto ("Honda: ", "2010 ", 300);
        moto.activarTurbo();
        moto.lavar();
        Vaca vaca = new Vaca ("Vaca Lola: ", 10);
        vaca.hacerSonido();
        vaca.mostrarInfo();
        vaca.producir();
        vaca.Comer();
        Oveja oveja = new Oveja ("Lyly: ", 6 );
        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir();
        oveja.Comer();
        
        
        
       
    }
}

