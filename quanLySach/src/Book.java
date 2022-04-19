
public class Book {
	private String name;
	private double price;
	private int publishYear;
	private Author author;
	
	public Book() {
	}

	public Book(String name, double price, int publishYear, Author author) {
		this.name = name;
		this.price = price;
		this.publishYear = publishYear;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void nameOfBook() {
		System.out.println("Name of book: " + this.name);
	}
	
	public boolean sameYear(Book orther) {
		return this.publishYear == orther.publishYear;
	}
	
	public double lastPrice(double x) {
		return this.price*(1-(x/100));
	}
	
}
