package PartA1;
import java.util.*;

public class InsuranceGroup{

	private String GRID = "GR-";
	private static Vector <Insurance> insuranceG = new Vector <Insurance> ();
	private static int ID = 999;
	private int uID;
	
	public InsuranceGroup(Vector <Insurance> insuranceG){
		ID++;
		uID = uID + ID;
		this.setInsuranceGroup(insuranceG);
	} 
	
	public Vector <Insurance> getInsuranceG(){
		return this.insuranceG;
	}
	
	public void setInsuranceGroup(Vector <Insurance> insuranceG){
		this.insuranceG = insuranceG;
	}
	
	public int getID(){
		return this.uID;
	}
	
	public void setID(int uID){
		this.ID = uID;
	}
	
	public double getAverageAge(Vector <InsuranceGroup> insuranceGroup){
		int age = 0;
		int count = 0;
		for(int i = 0; i<insuranceGroup.size(); i++){
			for(int j = 0; j<insuranceGroup.get(i).getInsuranceG().size(); j++){
				count ++;
				age = age + insuranceGroup.get(i).getInsuranceG().getAge();
			}
		}
		double average = age/count;
		return average;
	}
	
	public Vector <InsuranceGroup> addPolicy(Vector <Insurance> insuranceG){
		Vector <InsuranceGroup> addInsurance = new Vector <InsuranceGroup> ();
		for(int i = 0; i<insuranceG.size(); i++){
			if((addInsurance.size() < 5) || (getAverageAge(insuranceG) < 45)){
				addInsurance.add(insuranceG.elementAt(i));
			}
			else{
				return addInsurance;
			}
		}
		return addInsurance;
	}
	
	public double getMonthlyCharges(Vector <InsuranceGroup> insuranceG){
		double totalCharges = 0;
		for(int i = 0; i<insuranceG.size(); i++){
			for(int j = 0; j<insuranceGroup.get(i).getInsuranceG().size(); j++){
				totalCharges = totalCharges + insuranceGroup.get(i).getInsuranceG().setCost();
			}
		}
		return totalCharges;
	}	
	
	public String toString(){
		String str = "";
		str = str + "Group ID: " + GRID + this.getID() + "\n";
		str = str + "number of policies: " + this.addPolicy(Vector <Insurance> insuranceG).size() + "\n";
		str = str + "Total monthly charges: " + this.getMonthlyCharges(Vector <InsuranceGroup> insuranceG) + "\n";
		return str;
	}
}