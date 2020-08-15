// package superclass;

public class Records{
	private int id;
	private static int ID = 1000;
	private String title;
	private String date;
	
	public Records(){
		//title = "No title";
		this.setTitle("NoTitle");
		//date = "99-99-9999";
		this.setDate ("99-99-9999");
		this.setID();
	}
	
	public Records (String title, String date, int id){
		//this.title = title;
		this.setTitle(title);
		//this.date = date;
		this.setDate(date);
		this.setID();
	}
	public int getID(){
		return this.id;
	}
	public void setID() {
		this.id = ID++;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getDate(){
		return this.date;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setDate (String date){
		this.date = date;
	}
	
	public String toString(){
		String str = "";
		str += "ID: " + this.getID() + "\n";
		str = str + "Title: " + this.getTitle() + "\n";
		str = str + "Date: " + this.getDate() + "\n";
		return str;
	}
}