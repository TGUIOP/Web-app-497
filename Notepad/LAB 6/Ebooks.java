class Ebooks extends Books {
	private String url;
	
	public Ebooks (String title, String date, int ID, String authors, String url) {
		super(title, date, ID, authors);
		this.url = url;
	}
	
	public Ebooks () {
		super();
		this.setURL("No URL");
	}
	
	public String getURL(){
		return this.url;
	}
	
	public void setURL(String url){
		this.url = url;
	}
	
	public String toString(){
		String str = "";
		//String str = super.toString();
		//str = str + super.toString();
		str = super.toString() + "URL: " + this.getURL() + "\n";
		return str;
	}
	
}