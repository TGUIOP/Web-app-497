//package subclass;
//import superclass.Records;

public class Newspapers extends Records{
	
	private String [] editors;
	private String [] edition;
	
	public Newspapers(){
		super();
		edition = null;
		editors = null;
	}
	
	public Newspapers (String title, String date, int ID, String [] editors, String [] edition){
		super(title, date, ID);
		this.edition = edition;
		this.editors = editors;
	}
	
	public String [] editors(){
		return this.editors;
	}
	
	public String [] getEdition(){
		return this.edition;
	}
	
	public void setEditors (String [] editors){
		this.editors = editors;
	}
	
	public void setEdition (String [] edition){
		this.edition = edition;
	}
	
	public String toString(){
		String str = "Editors: ";
		String aut = "";
		String edt = "";
		if(editors == null){
			aut = "Null";
		}
		else if (editors.length > 0){
			for (int i = 0; i<editors.length; i++){
				edt = edt + editors[i] + ",";
			}
		}
		if(edition == null){
			aut = "Null";
		}
		else if(edition.length > 0){
			for (int i = 0; i<edition.length; i++){
				aut = aut + edition[i] + ",";
			}
		}
		str = super.toString() + str + edt + "\n" + "Editions: " + aut + "\n"; 
		return str;
	}
}