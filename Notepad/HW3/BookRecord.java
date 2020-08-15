package library.services.classes;
import library.services.classes.BookGenre;

public class BookRecord {
	private static int IdCounter=0;
	private int Id;
	private String title;
	private String [] authors;
	private BookGenre bookGenre;
	private String tag;
	private int pages;
	
	public BookRecord(){
		this.setID();
		this.setTitle("any title");
		this.setAuthors(null);
		this.setBookGenre(null);
		this.setTag("");
		this.setPages(0);
	}
	
	public BookRecord(String title, String [] authors, BookGenre bookGenre, String tag, int pages){
		this.setID();
		this.setTitle(title);
		this.setAuthors(authors);
		this.setBookGenre(bookGenre);
		this.setTag(tag);
		this.setPages(pages);
	}
	
	public int getID(){
		return this.Id;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String[] getAuthors(){
		return this.authors;
	}
	
	public BookGenre getBookGenre(){
		return this.bookGenre;
	}
	
	public String getTag(){
		return this.tag;
	}
	
	public int getPages(){
		return this.pages;
	}
	
	public void setID(){
		this.Id = ++this.IdCounter;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setAuthors(String [] authors){
		this.authors = authors;
	}
	
	public void setBookGenre(BookGenre bookGenre){
		this.bookGenre = bookGenre;
	}
	
	public void setTag(String tag){
		this.tag = tag;
	}
	
	public void setPages(int pages){
		this.pages = pages;
	}
	
	public boolean equals(BookRecord book1){
		if((book1.getTitle() == this.getTitle()) && (book1.getAuthors() == this.getAuthors()) && (book1.getBookGenre() == this.getBookGenre()) && (book1.getTag() == this.getTag()) && (book1.getPages() == this.getPages())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		String str = "";
		for (int i = 0; i < this.getAuthors().length; i++){
		str = str + " , " + this.getAuthors()[i];
		} 
		return "Title: " + this.getTitle() + "\n" + "Genre: " + this.getBookGenre() + "\n" + "Authors: " + str + "Tag: " + this.getTag() + "Pages: " + this.getPages();
	}
}