package Client.Services.Classes;
import Client.Services.BillsType;

public class MyBills {
	
	BillsType types;
	private String month;
	private double [] bills;
	private int days;
	
	public MyBills (){
		this.types = null;
		this.month = "any month";
		this.bills = null;
		this.days = 0;
		
	}
	
	public MyBills ( BillsType types, String month, double [] bills, int days){
		this.types = types;
		this.month = month;
		this.bills = bills;
		this.days = days;
		
	}
	
	public BillsType getTypes() {
		return this.types;
	}
	
	public String getMonth(){
		return this.month;
	}
	
	public double[] getBills(){
		return this.bills;
	}
	
	public int getDays(){
		return this.days;
	}
	
	public void setTypes (BillsType typ){
		this.types = typ;
	}
	
	public void setMonth(String mon){
		this.month = mon;
	}
	
	public void setBills(double [] bil){
		this.bills = bil;
	}
	
	public void setDays (int D){
		this.days = D;
	}
	
	public boolean equalsExp (BillsType name, int daysNumb){
		if((name == this.types) && (daysNumb = this.days)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		return "this month is: " + this.month + " The type of expense is " + this.types + " The amounts are " + this.bills ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}