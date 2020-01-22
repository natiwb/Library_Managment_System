
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
	 * check if the book already existed. if it is, increment the quantity if not
	 * add the book the book store
	 * 
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
	 * this method will get the book quanity form the book that is going to be
	 * issued and subtract one from the quantity. And increment the number of issued
	 * book by 1
	 * 
	 * @param book the book to be issued
	 */
	public void issueBook(Book book) {
		int bookQuantity = book.getQuantity(); // assigns the book quantity to the bookQuantity variable
		book.setQuantity(bookQuantity - 1); // subtract the book quantity by one because the book is issued
		book.setIssued(1); 
	}

	/**
	 * gives a view of all the books present in the book data sturcture
	 * @return all books in the bookStore in table format
	 */
	public String viewBooks() {
		if (bookStore.isEmpty()) // checks the bookStore if there are books to view 
			System.out.println("Sorry, There are no books to view"); // if not, prints out book not found message
		StringBuilder bookView = new StringBuilder();  // creates string builder obj to append all the books in the set
		String header = "ID \t\t TITLE  \t\t AUTHOR \t\t PUBLISHER \t\t QUANTITY"; // a column header for the table 
		System.out.println(header); // prints out the header to the console
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		// check all the book in the bookstore and append 
		// them to the string builder obj and return the stringBuilder obj
		for (Book book : bookStore) {
			bookView.append(book.toString() + "\n");
		}
		return bookView.toString();
	}

}
