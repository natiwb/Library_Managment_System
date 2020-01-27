import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Librarian_DataBase {

	HashMap<Integer, Librarian> dataStore= new HashMap<Integer, Librarian>();
	public Librarian_DataBase() {
		
	}

	/*
	 * @param lib librarian object
	 * @param id librarian id number
	 * */
	// adds the id and librarian object to the hashmap
	public void addLibrarian(Librarian lib, int id) {
		if(!dataStore.containsKey(id))// if the id is not taken add the librarian  
		  dataStore.put(id, lib);
		else
			System.out.println("The id no is token by other librarian ");
		
	}

	// view the data of all librarian's stored in the hashmap 
	public String viewLibrarian() {
		String data="";
		Set<Integer> idCollection= new HashSet<>();// declare a HashSet
		idCollection=dataStore.keySet();//  Initialize the HashSet with collection of keys
		Iterator<Integer> itr= idCollection.iterator();// declare iterator to traverse around the HashSet 
		while (itr.hasNext()) {
			int key= itr.next(); // declare local variable to hold the id from the iterator 
			Librarian person=dataStore.get(key);// get the value(Librarian) using the key(ID)
			data +=key+" "+person.toString()+"\n";
		}
		
		return data;
	}

	/*
	 * @param id librarian id
	 * */
	// Deletes librarian from the hashmap using their id as a key 
	public void deletLibrarian(int id) {
		if(dataStore.containsKey(id))// if the hashmap contains the key, delete the value
			dataStore.remove(id);
		else
			System.out.println("There is not employ with this id no");
	}

}
