public class Regular extends Appliances {
	
	public Regular(){
		this.setType("");
		this.setHWattage(0);
		//this.setOFFWattage(0);
		this.setProb(0f);
		this.setID(0);
		this.setLocation(0);
	}
	
	public Regular(int location, String type, int HWattage, float prob){
		super(location, type, HWattage, prob);
	}
	
	public String toString(){
		String str = "Regular toString" + "\n";
		str = str +  super.toString();
		return str;
	}
}