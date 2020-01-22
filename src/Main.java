
public class Main {

	public static void main(String[] args) {
		Book java = new Book("java", "Tonny Gaddis", "Pearson", 2, "1@2");
		Book CPlusPlus = new Book("C++", "Tonny Gaddis", "Pearson", 3, "@#1");
		Book phyton = new Book("phyton", "Tonny Gaddis", "wisley", 1, "123");
		//System.out.println(book.toString());
		LibraryManagmentSystem manager = new LibraryManagmentSystem();
//		System.out.println(manager.viewBooks());
//		System.out.println("Now I added one book");
		manager.addBook(java);
		manager.addBook(CPlusPlus);
		manager.addBook(phyton);
		System.out.println(manager.viewBooks());
		
		//manager.view();
		//System.out.println(java.toString());
	
	}
	
	

}
