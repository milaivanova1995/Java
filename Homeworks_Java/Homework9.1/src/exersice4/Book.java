package exersice4;

public class Book {
	
	String name;
	String author;
	int pagesNumber;
	
	public Book() {
		super();
	}
	
	public Book(String name, String author, int pagesNumber) {
		super();
		setName(name);
		setAuthor(author);
		setPagesNumber(pagesNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) {
		this.pagesNumber = pagesNumber;
	}

	public String toString() {
		return String.format("%s %s %d", this.name, this.author, this.pagesNumber);
	}
}
