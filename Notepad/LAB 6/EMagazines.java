public class EMagazines extends Magazines{
	
	private String url;
	
	public EMagazines(){
		super();
		this.setURL("No URL");
	}
	
	public EMagazines(String title, String date, int ID, String [] editors, int issueN, int volumeN, String url){
		super(title, date, ID, editors, issueN, volumeN);
		this.setURL(url);
	}
	
	public String getURL(){
		return this.url;
	}
	
	public void setURL (String url){
		this.url = url;
	}
	
	public String toString(){
		String str = "";
		str = super.toString() + "URL :" + this.getURL() + "\n";
		return str;
	}
}