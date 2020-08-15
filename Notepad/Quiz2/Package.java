package A2;

public abstract class Package implements ChargeConstants{

	private String fromAddress;
	private String toAddress;
	private float weight;
	private int packageID;
	private static int idCounter = 10000;
	
	public Package(){
		this.setFromAddress("");
		this.setToAddress("");
		this.setWeight(0);
		this.setID(0);
	}
	
	public Package(String fromAddress, String toAddress, float weight){
		this.setFromAddress(fromAddress);
		this.setToAddress(toAddress);
		this.setWeight(weight);
		this.getID();
	}
	
	public int getID(){
		return this.idCounter++;
	}
	
	public String getFromAddress(){
		return this.fromAddress;
	}
	
	public String getToAddress(){
		return this.toAddress;
	}
	
	public float getWeight(){
		return this.weight;
	}
	
	public void setID(int packageID){
		this.idCounter = packageID;
	}
	
	public void setFromAddress(String fromAddress){
		this.fromAddress = fromAddress;
	}
	
	public void setToAddress(String toAddress){
		this.toAddress = toAddress;
	}
	
	public void setWeight(float weight){
		this.weight = weight;
	}
	
	public float calculateCharge(float weight){
		float charge;
		charge = baseCharge*this.getWeight();
		return charge;
	}
	
	public abstract String printReceipt();
	
}