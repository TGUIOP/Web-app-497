// Part A

public class Supply {
	
	private int id = 999;
	private static int uID;
	private String CustomerID;
	private String ProductID;
	private String date;
	private int amount;
	
	public Supply(){
		uID++;
		id = id + uID;
		this.setCustomerID("none");
		this.setProductID("none");
		this.setDate("no date");
		this.setAmount(0);
	}
	
	public Supply (String CustomerID, String ProductID, String date, int amount){
		//this.setID();
		/*if(id != this.getID()){
			this.setUniqueID(id);
		}*/
		uID++;
		id = id + uID;
		this.setCustomerID(CustomerID);
		this.setProductID(ProductID);
		this.setDate(date);
		this.setAmount(amount);
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getCustomerID(){
		return this.CustomerID;
	}
	
	public String getProductID(){
		return this.ProductID;
	}
	
	public String getDate(){
		return this.date;
	}
	
	public int getAmount(){
		return this.amount;
	}
	
	public void setID(int uID){
		this.id = uID;
	}
	
	public void setCustomerID(String CustomerID){
		this.CustomerID = CustomerID;
	}
	
	public void setProductID(String ProductID){
		this.ProductID = ProductID;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	
	public String toString(){
		String str = "";
		str = str + "ID: " + this.getID() + "\n";
		str = str + "Customer ID: " + this.getCustomerID() + "\n";
		str = str + "Product ID: " +  this.getProductID() + "\n";
		str = str + "Date: " + this.getDate() + "\n";
		str = str + "Amount: " + this.getAmount() + "\n";
		return str;
	}

}