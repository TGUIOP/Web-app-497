//package subclass;
//import superclass.Records;

public class Magazines extends Records{
	
	private int issueN;
	private int volumeN;
	private String [] editors;
	
	public Magazines(){
		super();
		issueN = 0;
		volumeN = 0;
		editors = null;
	}
	
	public Magazines(String title, String date, int ID, String [] editors, int issueN, int volumeN){
		super(title, date, ID);
		this.editors = editors;
		this.issueN = issueN;
		this.volumeN = volumeN;
	}
	
	public String [] getEditors(){
		return this.editors;
	}
	
	public int getIssueN(){
		return this.issueN;
	}
	
	public int getVolumeN(){
		return this.volumeN;
	}
	
	public void getEditors(String [] editors){
		this.editors = editors;
	}
	
	public void setIssueN(int issueN){
		this.issueN = issueN;
	}
	
	public void setVolumeN(int volumeN){
		this.volumeN = volumeN;
	}
	
	public String toString(){
		String str = "";
		String aut = "";
		if(editors == null){
			aut = "Null";
		}
		else if (editors.length > 0){
			for (int i = 0; i<editors.length; i++){
				aut = aut + editors[i] + ",";
			}
		}
		str = super.toString() + "Authors: " + aut + "\n";
		str = str + "Issue number: " + this.getIssueN() + "\n";
		str = str + "Volume number: " + this.getVolumeN() + "\n";
		return str;
	}
}