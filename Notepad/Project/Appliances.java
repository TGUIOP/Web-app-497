public abstract class Appliances{

	private String type;
	private int HWattage;
	private int OFFWattage;
	private float prob;
	private int location;
	private int ID = 10000;
	private static int count;
	
	public Appliances(){
		this.setType("");
		this.setHWattage(0);
		//this.setOFFWattage(0);
		this.setProb(0f);
		this.setLocation(0);
		this.setID(0);
	}
	
	public Appliances(int location, String type, int HWattage, float prob){
		this.setType(type);
		this.setHWattage(HWattage);
		this.setLocation(location);
		//this.setOFFWattage(OFFWattage);
		this.setProb(prob);
		count++;
		ID = ID + count;
	}
	
	public int getLocation(){
		return this.location;
	}
	
	public String getType(){
		return this.type;
	}
	
	public int getHWattage(){
		return this.HWattage;
	}
	
	/*public int getOFFWattage(){
		return this.OFFWattage;
	}*/
	
	public float getProb(){
		return this.prob;
	}
	
	public int getID(){
		return this.ID;
	}
	
	public void setLocation(int location){
		this.location = location;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setHWattage(int HWattage){
		this.HWattage = HWattage;
	}
	
	/*public void setOFFWattage(int OFFWattage){
		this.OFFWattage = OFFWattage;
	}*/
	
	public void setProb(float prob){
		this.prob = prob;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public String toString(){
		String str = "";
		str = str + "Location: " + this.getLocation() + "\n";
		str = str + "Type: " + this.getType() + "\n";
		str = str + "ID: " +  this.getID() + "\n";
		str = str + "HW: " +  this.getHWattage() + "\n";
		str = str + "prob: " + this.getProb() + "\n";
		return str;
	}
	
}