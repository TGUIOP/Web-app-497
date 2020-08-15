class HardBooks extends Books {
	
	private int editions;
	
	public HardBooks(){
		super();
		this.setEditions(0);
	}
	
	public HardBooks(String title, String date, int ID, String authors, int editions){
		super(title, date, ID, authors);
		this.editions = editions;
	}
	
	public int getEditions(){
		return this.editions;
	}
	
	public void setEditions(int editions){
		this.editions = editions;
	}
	
	public String toString(){
		String str = super.toString();
		//str = str + super.toString();
		str = str + "Edition: " + this.getEditions() + "\n";
		return str;
	}
}