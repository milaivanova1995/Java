package exersice4;

import java.util.ArrayList;

public class Library {

	String libraryName;
	String address;
	ArrayList<Book> collection = new ArrayList<Book>();
	
	public Library() {
		super();
	}

	public Library(String libraryName, String address) {
		super();
		setLibraryName(libraryName);
		setAddress(address);
		setBooks(collection);
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Book> getCollection() {
		return collection;
	}

	public void setCollection(ArrayList<Book> collection) {
		this.collection = collection;
	}

	public void setBooks(ArrayList<Book> collection) {
		this.collection = collection;
	}
	
	
	
	public void addBook(Book name){
		collection.add(name);
	}

	public void removeBook(Book book1) {
		collection.remove(book1);
	}
	
	public void Print() {
		System.out.println("Name of the library " + libraryName);
		System.out.println("Adress of library: " + address);
		
		for (int i = 0; i < collection.size(); i++) {
			System.out.println("Name of the book: " + collection.get(i).getName());
			System.out.println("Author of the book: " + collection.get(i).getAuthor());
			System.out.println("Pages of the book: " + collection.get(i).getPagesNumber());
		}
	}
	
	public static void main(String[] args) {
		
		Library library = new Library("Zaharii Knyazheski", "Stara Zagora");
		Book book1 = new Book("book 1", "author 1", 600);
		library.addBook(book1);
		library.addBook(book1);
		library.addBook(book1);
		
		library.removeBook(book1);
		library.removeBook(book1);
		
		library.Print();
		
	}
}
