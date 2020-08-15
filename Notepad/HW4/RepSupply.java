//Part A

public class RepSupply extends Supply{
	
	private int period;
	private String endDate;
	
	public RepSupply(){
		super();
		this.setPeriod(0);
		this.setEndDate("none");
	}
	
	public RepSupply(String CustomerID, String ProductID, String date, int amount, int period, String endDate){
		super(CustomerID, ProductID, date, amount);
		this.setPeriod(period);
		this.setEndDate(endDate);
	}
	
	public int getPeriod(){
		return this.period;
	}
	
	public String getEndDate(){
		return this.endDate;
	}
	
	public void setPeriod(int period){
		this.period = period;
	}
	
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
	
	public String toString(){
		String str = "";
		str = str + super.toString();
		str = str + "Period: " + this.getPeriod() + "\n";
		str = str + "End date: " + this.getEndDate() + "\n";
		return str;
	}
}