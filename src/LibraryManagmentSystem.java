
import java.util.HashSet;

import java.util.Set;

/**
 * This class is responsible for the functionality of librarians It has the data
 * structure of the books where all the books are stored in
 * 
 * @author Miki
 */
public class LibraryManagmentSystem {
	 Set<Book> bookStore;

	public LibraryManagmentSystem() {
		bookStore = new HashSet<Book>();
	}

	/**
	 * check if the book already existed. if it is, increment the quantity
	 * if not add the book the book store
	 * @param book the book to be added
	 * @return true if the book is added and false if not
	 */
	public boolean addBook(Book book) {
		if (!bookStore.add(book)) 
			return false;
		else {
			bookStore.add(book);
			return true;
		}
	}
	
	/**
	 * this method will get the book quanity form the book that is 
	 * going to be issued and subtract one from the quantity. And increment the 
	 * number of issued book by 1 
	 * @param book the book to be issued
	 */
	public void issueBook(Book book) {
		int bookQuantity = book.getQuantity();
		book.setQuantity(bookQuantity -1); // subtract the book quantity by one because the book is issued
		book.setIssued(1); 
	}
	
	public String viewBooks() {
		if(bookStore.isEmpty())
			System.out.println("Sorry, There are no books to view");
		StringBuilder bookView = new StringBuilder();
		for(Book book : bookStore) {
			bookView.append(book.toString() + "\n\n");
		}
		
		return bookView.toString();
	}
	
	public void view() {
		String header = "ID \t\t TITLE  \t\t AUTHOR \t\t PUBLISHER \t\t QUANTITY";
		System.out.println(header);
		System.out.println("-------------------------------------------------------------------------------------------------");
		for(Book book : bookStore) {
			System.out.println(book.toString());
		}
	}

}
