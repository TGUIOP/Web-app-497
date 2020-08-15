/* import subclass.Books;
import subclass.Magazines;
import subclass.Newspapers;
import superclass.Records; */

public class RecordClient{
	
	public static void main(String [] args){
		
		HardBooks hcBook = new HardBooks("Lab6", "03-29-2019", 1000, "Author 1 , Author 2", 2);
		Ebooks eBook = new Ebooks ("Lab6", "03-29-2019", 1001, "Author 1, Author 2", "url");
		
		String [] Editors = new String [] {"Author 1" , "Author 2"};
		
		EMagazines magaz = new EMagazines("Lab6", "03-29-2019", 1002, Editors, 1, 2, "url");
		HardMagazines Hmagaz = new HardMagazines ("Lab6", "03-29-2019", 1003,  Editors, 1, 2, "New York");
		
		String [] NewsEditors = new String [] {"Editor 1", "Editor 2"};
		String [] NewsEditions = new String [] {"New York Edition", "Los Angeles Edition"};
		Newspapers newsP = new Newspapers ("Newspaper 2" , "03-31-2019", 1004, NewsEditors, NewsEditions);
		
		Ebooks ebook2 = new Ebooks();
		
		//Magazines magazine = new Magazines();
		//Newspapers newspaper = new Newspapers();
		//Records record = new Records();
		
		//System.out.println(record.toString());
		//System.out.println(magazine.toString());
		//System.out.println(newspaper.toString());
		
		
		System.out.println(hcBook.toString());
		System.out.println(eBook.toString());
		
		System.out.println(magaz.toString());
		System.out.println(Hmagaz.toString());
		
		System.out.println(newsP.toString());
		
		System.out.println(ebook2.toString());
	}
}