package PartA1;

public abstract class Insurance{
	
	private static int ID = 999;
	private int uID;
	private String name;
	private int age;
	private int fee;
	private String type;
	
	public Insurance(String name, int age, String type){
		ID++;
		uID = uID + ID;
		this.setName(name);
		this.setAge(age);
		this.setType(type);
	}
	
	public void setPolicyID(int uID){
		this.ID = uID;
	}
	
	public void setName(String policyHolderName){
		this.name = policyHolderName;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	/*public void setFee(int fee){
		this.fee = fee;
	}*/
	
	public int getPolicyID(){
		return this.uID;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getType(){
		return this.type;
	}
	
	/*public int getFee(){
		return this.fee;
	}*/
	
	public abstract void setCost();
	
	
	
	
	
	
	
	
	
	
	
}