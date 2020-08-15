public class HardMagazines extends Magazines{
	
	private String editions;
	
	public HardMagazines(){
		super();
		this.setEditions("No edition");
	}
	
	public HardMagazines(String title, String date, int ID, String [] editors, int issueN, int volumeN, String editions){
		super(title, date, ID, editors, issueN, volumeN);
		this.setEditions(editions);
	}
	
	public String getEditions(){
		return this.editions;
	}
	
	public void setEditions(String editions){
		this.editions = editions;
	}
	
	public String toString(){
		String str = "";
		str = super.toString() + "Editions: " + this.getEditions() + "\n";
		return str;
	}
}