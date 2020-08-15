package PartA;

public class PersonalLoan extends Loan{
	
	private static double interestP = 2;
	
	public PersonalLoan(int id, String LastN, double amount, int terms){
		super(id, LastN, amount, terms);
		this.setInterest(interestP);
	}
	
	public String toString(){
		String str = "Personal Loan" + "\n" + super.toString();
		return str;
	}
}