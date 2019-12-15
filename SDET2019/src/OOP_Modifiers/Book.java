package OOP_Modifiers;

public class Book {
	
	private String title;
	private String author;
	private int numberOfPages;
	private String publisher;
	private String edition;
	
	private static int count = 0; //the constructor method executes this code for every object

	public Book(String title, String author, int numberOfPages, String publisher, String edition) {
		
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.publisher = publisher;
		this.edition = edition;
		
		count++; 
	}
	public int getCount() {
		return count;
	}
	 public static void numberOfBooksInTheSystem();
	

}
