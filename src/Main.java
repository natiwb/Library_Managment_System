
public class Main {
	public static void main (String args[]) {
		Admin employer= new Admin("Neko", "neko123");
		
		employer.addLibrarian("abebe", "aba234", "aba@gmail.com", "1223 newyork ave", "silver spring", 2022459877, 06);
		employer.addLibrarian("zenkuta", "zenku529", "zenku@gmail.com", "236 collsvile ave", "silver spring", 2025896732, 12);
		System.out.println(employer.viewLibrarian());
	//	employer.deletLibrarian(12);
	//	System.out.println(employer.viewLibrarian());
	}
}
