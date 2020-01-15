import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class is responsible for the functionality of librarians It has the data
 * structure of the books where all the books are stored in
 * 
 * @author Miki
 */
public class LibraryManager {
	private Set<Book> bookStore;

	public LibraryManager() {
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
		// needs implementation
		//
		return null;
	}

}
