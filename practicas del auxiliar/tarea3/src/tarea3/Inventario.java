package tarea3;
import java.util.ArrayList;

public class Inventario {
	private ArrayList<String> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
        System.out.println("Item agregado: " + item);
    }

    public void mostrarItems() {
        if (items.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Ítems en el inventario:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}
