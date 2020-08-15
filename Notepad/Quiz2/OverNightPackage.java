package A2;

public class OverNightPackage extends Package implements ChargeConstants{
	
	public OverNightPackage(String fromAddress, String toAddress, float weight){
		super(fromAddress, toAddress, weight);
	}
	
	public float calculateCharge(float weight){
		float charge;
		charge = weight*overNightExtraCharge;
		charge = charge + super.calculateCharge(super.getWeight());
		return charge;
	}
	
	public String printReceipt(){
		String str = "Receipt for Package ID: " + super.getID() + "\n";
		str = str + "Type: Over Night" + "\n";
		str = str + "From Address: " + super.getFromAddress() + "\n";
		str = str + "To Address" + super.getToAddress() + "\n";
		str = str + "Weight: " + super.getWeight() + "oz." + "\n";
		str = str + "Charge: $" + calculateCharge(super.getWeight()) + "\n";
		return str;
	}
}