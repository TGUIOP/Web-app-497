//package library.services.classes;
import library.services.classes.BookGenre;
import java.util.*;
import java.io.File;
import java.io.IOException;

class BookClient{
	static BookRecord [] book2 = new BookRecord [5];
	static int expFactor;
	static int authorsN;
	
	public static void main(String []args){
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
			for(int i = 0; i<authorsN; i++){
				authorsList[i] = tokensA[i];
			}
			book2 = new BookRecord (title, authorsList, genre); //Stored in the array book2
		}

	
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
			case "S":System.out.println("Type a genre. The genres are:");
				for (BookGenre d : BookGenre.values()) {
					System.out.println(d);
				}
				String option2 = sc.nextLine();
				switch (option2){
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
				}
			//assume the use will type in a valid genre
			//print out records of the selected genre
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