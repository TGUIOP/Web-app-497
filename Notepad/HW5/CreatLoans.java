package PartA;
import java.util.*;

public class CreatLoans{
	
	public static void main (String[] args){
	
		Loan [] L1 = new Loan [5];
		Scanner sc = new Scanner(System.in);
		
		/*BusinessLoan b = new BusinessLoan(123, "Gui", 500.00, 3);
		PersonalLoan p = new PersonalLoan(532223, "Guizao", 2000000000, 9);
		System.out.println(b.toString());
		System.out.println(p.toString());
		L1[0] = b;
		L1[1] = p;
		System.out.println(L1.length);
		for(int i=0; i<L1.length; i++){ //print out the array
			System.out.println(L1[i].toString());
		}
		
		*/
		
		for(int i=0; i<L1.length; i++){//loop for 5 times
			
			System.out.println("Enter the loan type" + " Business or Personal");
			String Type = sc.nextLine();
			String ID, LastN, amount, terms;
			int IDNumber, LoanTerms;
			double LoanAmount;
			
			switch(Type) { 
				
				case "Business": 
					System.out.println("Enter an ID");
					ID = sc.nextLine();
					IDNumber = Integer.parseInt(ID);
					System.out.println("Enter the last name");
					LastN = sc.nextLine();
					System.out.println("Enter the amount (Max Amount 100000)");
					amount = sc.nextLine();
					LoanAmount = Double.parseDouble(amount);
					System.out.println("Enter the terms 1, 3, or 5 years");
					terms = sc.nextLine();
					LoanTerms = Integer.parseInt(terms);
					BusinessLoan b = new BusinessLoan(IDNumber, LastN, LoanAmount, LoanTerms);
					L1[i] = b;
					break;
					
				case "Personal":
					System.out.println("Enter an ID");
					ID = sc.nextLine();
					IDNumber = Integer.parseInt(ID);
					System.out.println("Enter the last name");
					LastN = sc.nextLine();
					System.out.println("Enter the amount (Max Amount 100000)");
					amount = sc.nextLine();
					LoanAmount = Double.parseDouble(amount);
					System.out.println("Enter the terms 1, 3, or 5 years");
					terms = sc.nextLine();
					LoanTerms = Integer.parseInt(terms);
					PersonalLoan p = new PersonalLoan(IDNumber, LastN, LoanAmount, LoanTerms);
					L1[i] = p;
					break;
			}
			
		}
		
		for(int i=0; i<L1.length; i++){ //print out the array
			System.out.println(L1[i].toString());
		}
	
	}
}