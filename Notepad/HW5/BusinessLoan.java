package PartA;

public class BusinessLoan extends Loan{
	
	private static double interestB = 1;
	
	public BusinessLoan(int id, String LastN, double amount, int terms){
		super(id, LastN, amount, terms);
		this.setInterest(interestB);
	}
	
	public String toString(){
		String str = "Business Loan" + "\n" + super.toString();
		return str;
	}
}