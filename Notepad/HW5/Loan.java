package PartA;

public abstract class Loan implements LoanConstants{
	
	private int id = 999;
	private static int uID;
	private String LastN;
	public double amount;
	public double interest;
	private int terms;
	
	public Loan(){
		this.setID(0);
		this.setLastN("");
		this.setAmount(0);
		this.setInterest(0);
		this.setTerms(0);
	}
	
	public Loan(int id, String LastN, double amount, int terms){
		this.setID(id);
		this.setLastN(LastN);
		this.setAmount(amount);
		this.setTerms(terms);
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getLastN(){
		return this.LastN;
	}
	
	public double getAmount(){
		return this.amount;
	}
	
	public double getInterest(){
		return this.interest;
	}
	
	public int getTerms(){
		return this.terms;
	}
	
	public void setID(int uID){
		this.id = uID;
	}
	
	public void setLastN(String LastN){
		this.LastN = LastN;
	}
	
	public void setAmount(double amount){
		if(amount <= MaxAmount){
			this.amount = amount;
		}
		else if(amount > MaxAmount){
			this.amount = MaxAmount;
		}
	}
	
	public void setInterest(double interest){
		this.interest = interest;
	}
	
	public void setTerms(int terms){
		if((terms == ShortT) || (terms == MidT) || (terms == LongT)){	
			this.terms = terms;
		}
		else{
			this.terms = ShortT;
		}
	}
	
	public String toString(){
		String str = "";
		str = str + "ID: " + this.getID() + "\n";
		str = str + "Last Name:" + this.getLastN() + "\n";
		str = str + "Amount: " + this.getAmount() + "\n";
		str = str + "Terms: " + this.getTerms() + "\n";
		str = str + "Interest: "  + this.getInterest() + "\n";
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}