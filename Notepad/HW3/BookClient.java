package library.services.classes;
import library.services.classes.BookGenre;
import library.services.classes.BookRecord;
import java.util.*;
import java.io.File;
import java.io.IOException;

class BookClient{
	static BookRecord [] book2 = new BookRecord [0];
	static int expFactor;
	static int authorsN;
	int noRecords = 0;
	
	public void searchGenre (BookGenre genre) {
		
	}
	
	public BookRecord [] sortString (BookRecord [] myArray, int noRecords){ // Selection sort 
		for (int i = 0; i < noRecords; i++){								// sort Tag
			for (int j = i + 1; j < noRecords; j++) {
				if(myArray[j].getTag().compareToIgnoreCase(myArray[i].getTag()) < 0){
					BookRecord tag = myArray[j];
					myArray[j] = myArray[i];
					myArray[i] = tag;
				}
			}
		}
		return myArray;
	}
	
	public BookRecord [] sortPages(BookRecord [] myArray, int noRecords){ //Sort Pages
		for (int i = 0; i < noRecords; i++) {
			for (int j = i + 1; j < noRecords; j++) {
				if (myArray[i].getPages() > myArray[j].getPages()) {
					BookRecord pages = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = pages;
				}
			}
		}
		return myArray;
	}
	
	public void searchTag (String tag){
		int index = tSearch (book2, tag, 0, noRecords);
		if (index < 0) {
			System.out.println ("Error found");
		}
		else {
			BookRecord book = book2[index];
			System.out.println(book.toString());
		}
	}

	public static int tSearch (BookRecord [] books, String tag, int a, int b) {
		if (b <= a) {
			return -1;
		}
		if (b - a == 1) {
			return books[a].getTag().equalsIgnoreCase(tag) ? a : -1;
		}
		int mid = (a+b) / 2;
		if (tag.compareToIgnoreCase(books[mid].getTag()) > 0) {
			return tSearch (books, tag, 0, mid);
		}
		else if (tag.compareToIgnoreCase(books[mid].getTag()) < 0) {
			return tSearch (books, tag, mid, b);
		}
		else {
			return mid;
		}
	}
	
	public void searchByGenre(BookGenre genre){
	//loop through the book records and list the genre
	for(int i=0;i<this.noRecords;++i){
		if(book2[i].getBookGenre()==genre){
			System.out.println(book2[i].toString());
			}
		}
	}
			
	public boolean searchForDuplicate(BookRecord aRecord){
		//loop through the library and find duplicates
		//return true if duplicate found 
		//else return false
		if(this.noRecords==0) return false;
			for(int i=0;i<this.noRecords;++i){
				if(book2[i].equals(aRecord))
					return true;
				}
		return false;
	}
	
	public static void main(String []args){
	BookRecord aRecord;
	BookClient myLib = new BookClient();
	String lines;
	String []tokens;
	String []tokensA;
	expFactor = 0;
	try {
		
		File myFile=new File("books.txt");
		Scanner scan=new Scanner(myFile);
		while(scan.hasNextLine()){
			lines = scan.nextLine();
			expFactor ++; // count how many lines
		}
		scan.close();
		
		if((book2.length - expFactor) < 0){ 
			book2 = new BookRecord [book2.length + (expFactor - book2.length)];
			System.out.println("resized the array to " + expFactor);
		} //increase the size of the array
	
		scan = new Scanner(myFile);
		while(scan.hasNextLine()){
			lines = scan.nextLine();
			tokens = lines.split(":");
			String title = tokens[0];
			BookGenre genre = BookGenre.valueOf(tokens[1]); 
			tokensA = tokens[2].split(",");
			authorsN = tokensA.length;
			String[] authorsList = new String [authorsN];
			String tag = tokens[3];
			int pages = Integer.parseInt(tokens[4]);
			for(int i = 0; i<authorsN; i++){
				authorsList[i] = tokensA[i];
			}
			aRecord = new BookRecord (title, authorsList, genre, tag, pages); //Stored in the array book2
		}
		
			// myLib.sortString();
			// myLib.sortPages();
	} catch(IOException ioe){
		System.out.println("The file can not be read");
		}
		//User interactive part
		while(true){
			System.out.println("Select an option:");
			System.out.println("Type \"S\" to list books of a genre");
			System.out.println("Type \"P\" to print out all the book recors");
			System.out.println("Type \"Q\" to Quit");
			Scanner sc = new Scanner (System.in);
			String option = sc.nextLine();
			//get input from the user
		switch (option) {
			case "S": System.out.println("Type a genre. The genres are:");
				for (BookGenre d : BookGenre.values()) {
					System.out.println(d);
				}
				String option2 = sc.nextLine();
				myLib.searchGenre (BookGenre.valueOf(option2));
				break;
				/* switch (option2){
					case "History":
						for(int i = 0; i < book2.length; i++){
							if(book2[i].getBookGenre() = BookGenre.GENRE_HISTORY){
								System.out.println(book2[i].toString());
							}
						}
					case "Science":
						for(int i = 0; i < book2.length; i++){
							if(book2[i].getBookGenre() = BookGenre.GENRE_SCIENCE){
								System.out.println(book2[i].toString());
							}
						}
					case "Engineering":
						for(int i = 0; i < book2.length; i++){
							if(book2[i].getBookGenre() = BookGenre.GENRE_ENGINEERING){
								System.out.println(book2[i].toString());
							}
						}
					case "Literature":
						for(int i = 0; i < book2.length; i++){
							if(book2[i].getBookGenre() = BookGenre.GENRE_LITERATURE){
								System.out.println(book2[i].toString());
							}
						}
				} */
			//assume the use will type in a valid genre
			//print out records of the selected genre
			case "T":
				System.out.println("Enter the tag of the book");
				String TagName = sc.nextLine();
				myLib.searchTag(TagName);
				break;
			case "P": //list out all the records
				 for (int i = 0; i < book2.length; i++){
					System.out.println(book2[i].toString());
				}
			break;
			case "Q": System.out.println("Quitting program");
			System.exit(0);
			default: System.out.println("Wrong option! Try again");
			break;
			}
		}
	}
	
}