package desafio3;

public class Book {
	private String title;
	private Author author;
	private double price;
	public Book (String title, Author author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void getInfo() {
		System.out.println("Title:  " +  title + " Author:  " +  author.getName() + " Price: "  + price );
	}
	public String getTitle(){
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	
}
