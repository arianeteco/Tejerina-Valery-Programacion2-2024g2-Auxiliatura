package desafio3;

public class Main {
	 public static void main(String[] args) {
	        Author author = new Author("Gabriel García Márquez");
	        
	        // Agregar libro usando un objeto Book
	        Book book1 = new Book("Cien años de soledad", author, 25.50);
	        author.addBook(book1);
	        
	        // Agregar libro usando el método sobrecargado
	        author.addBook("El amor en los tiempos del cólera", 30.00);
	        
	        // Mostrar información de los libros
	        for (Book book : author.getBooks()) {
	            book.getInfo();
	        }
	    }

}
