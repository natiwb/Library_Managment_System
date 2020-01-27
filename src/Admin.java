

public class Admin {
	private String name;		// admins name
	private String Password;	// admins password
	Librarian_DataBase DataBase= new Librarian_DataBase(); // serves as a data base to store librarians 

	/**
	 * 
	 * @param password
	 * @param name
	 */
	public Admin(String password, String name) {
		this.Password = password;
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return Password;
	}

	/** 
	 * @param password
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param name       name of the librarian
	 * @param password   librarian password
	 * @param email      librarian email
	 * @param address    librarian address
	 * @param city       librarian city
	 * @param contactNum librarian contact number
	  */
	// add librarians to the library
	public void addLibrarian (String name, String password, String email, String address, String city, long contact_No, int Id) {
	Librarian lib = new Librarian(name, password, email, address, city, contact_No); // create a librarian object to be added
		 DataBase.addLibrarian(lib,Id); // pass the collected librarian data to be added on the data base. 
	}
	
	// view Librarians info currently working in the library
	public String viewLibrarian () {
		
		return DataBase.viewLibrarian();
		
	}
	
	// fire a librarian from the library 
	public void deletLibrarian (int id) {
		 DataBase.deletLibrarian(id);
	}
}
