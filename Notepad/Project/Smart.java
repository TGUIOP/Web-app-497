public class Smart extends Appliances{
	
	private double reduce;
	
	public Smart(){
		super();
		this.setReduce(0);
	}
	
	public Smart(int location, String type, int HWattage, float prob, double reduce){
		super(location, type, HWattage, prob);
		this.setReduce(reduce);
	}
	
	public double getReduce(){
		return this.reduce;
	}
	
	public void setReduce(double reduce){
		this.reduce = reduce;
	}
	
	public double LowWatt(){
		double low;
		low = super.getHWattage()*this.reduce;
		return low;
	}
	
	public String toString(){
		String str = "Smart toString" + "\n";
		str = str + super.toString();
		str = str + "Low: " + this.LowWatt() + "\n";
		return str;
	}
	
}