package Client.Services.Classes;
import Client.Services.BillsType;
public class MyBills{
	private String monthExpenses;
	private BillsType expenseType;
	private double []expenseAmt;
	private int noDays;
	private static int IdCounter=0;
	private int Id;
	
	public MyBills(){
		this.setMonthExpenses("any month");
		this.setExpenseType(null);
		this.setExpenseAmt(null);
		this.setNoDays(0);
		this.setID();
	}
	public MyBills(String monthExpenses,BillsType expenseType,double []expenseAmt,int noDays){
		this.setMonthExpenses(monthExpenses);
		this.setExpenseType(expenseType);
		this.setExpenseAmt(expenseAmt);
		this.setNoDays(noDays);
		this.setID();
	}
	public String getMonthExpenses(){
		return this.monthExpenses;
	}
	
	public BillsType getExpenseType(){
		return this.expenseType;
	}
	public double[] getExpenseAmt(){
		return this.expenseAmt;
	}
	public int getNoDays(){
		return this.noDays;
	}
	public int getID(){
		return this.Id;
	}	
	public void setMonthExpenses(String monthExpenses){
		this.monthExpenses=monthExpenses;
	}	
	public void setExpenseType(BillsType expenseType){
		this.expenseType=expenseType;
	}
	public void setExpenseAmt(double[] expenseAmt){
		this.expenseAmt=expenseAmt;
	}
	public void setNoDays(int noDays){
		this.noDays=noDays;
	}
	public void setID(){
		this.Id=++this.IdCounter;
	}
	public String toString(){
		String expenses="";
		for(int i=0;i<this.getExpenseAmt().length;++i)
		{
			expenses=expenses + " "+ this.getExpenseAmt()[i];
		}
		return "The Month is:" + this.getMonthExpenses() + " The type of expenses is " + this.getExpenseType() + " The amounts are" + expenses + " The number of days is " + this.getNoDays() + " The expense object ID is " + this.getID() + " And the static id value is " + this.IdCounter;
	}
	public boolean equals(MyBills bill2)
	{
		if((bill2.getExpenseType()==this.getExpenseType()) && (bill2.getNoDays()==this.getNoDays()))
			return true;
		else
			return false;
	}
} 