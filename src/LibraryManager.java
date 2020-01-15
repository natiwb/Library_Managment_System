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
		if (!bookStore.add(book)) {
			book.addQuantity();
			return false;
		} else {
			bookStore.add(book);
			return true;
		}
	}
	
	public void issueBook(Book book) {
		
	}
	
	public String viewBooks() {
		// needs implementation
		//
		return null;
	}

}
