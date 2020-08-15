//package subclass;
//import superclass.Records;

public class Books extends Records{
	
	//private String [] authors;
	private String authors;
	
	public Books(){
		super();
		this.setAuthors("NoAuthor");
	}
	
	public Books(String title, String date, int ID, String authors){
		super(title, date, ID);
		//this.setAuthors(authors);
		this.authors = authors;
	}
	
	public String getAuthors(){
		return this.authors;
	}
	
	public void setAuthors(String authors){
		this.authors = authors;
	}
	
	public String toString(){
		//super.toString();
		String aut = super.toString();
		//aut += super.toString();
		aut += "Authors: " + authors.toString() + "\n";
		// String str = "Authors";
		/* if(authors == null){
			aut = "Null";
		}
		else if (authors.length > 0){
			for (int i = 0; i< authors.length; i++){
				aut = aut + authors[i] + ",";
			}
		} */
		
		return aut;
	}
}