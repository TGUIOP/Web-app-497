//Part B

import java.util.*;
import java.io.File;
import java.io.IOException;

public class SupplyClient{
	
	private static Vector <Supply> S = new Vector <Supply>();
	private static Vector <RepSupply> RS = new Vector <RepSupply>();
	
	private static Vector <RepSupply> NewRS = new Vector <RepSupply>(); //For sorting
	
	private static int MaxIndex(Vector <RepSupply> NewRS, int size){ //Find the newest date
		int index = 0;
		for (int i=0; i<size; i++){
			String [] DateTok1 = NewRS.get(i).getDate().split("/");
			String [] DateTok2 = NewRS.get(index).getDate().split("/");
			int Year1 = Integer.parseInt(DateTok1[2]);
			int Month1 = Integer.parseInt(DateTok1[0]);
			int Day1 = Integer.parseInt(DateTok1[1]);
			int Year2 = Integer.parseInt(DateTok2[2]);
			int Month2 = Integer.parseInt(DateTok2[0]);
			int Day2 = Integer.parseInt(DateTok2[1]);
			
			if((Year1 > Year2)){
				index = i;
			}
			else if ((Year1 == Year2) && (Month1 > Month2)){
				index = i;
			}
			else if ((Year1 == Year2) && (Month1 == Month2) && (Day1 > Day2)){
				index = i;
			}
		}
		return index;
	}
	public static void print (Vector<Supply> S) {
		for (int i = 0; i < S.size(); i++) {
			System.out.println (S.get(i).toString());
		}
	}
	
	public static void main(String []args){

		Scanner scan;
		String str;
		Supply OneTime;
		RepSupply Rep;

		try {
			File myFile=new File("orders.txt");
            scan=new Scanner(myFile);
			while(scan.hasNextLine()){ //Stores the orders in the vector
				str=scan.nextLine();				
				String [] tok=str.split(",");
				int orders = Integer.parseInt(tok[4]);
				if (tok[0].equals("O")){
					OneTime = new Supply(tok[1], tok[2], tok[3], orders);
					S.addElement(OneTime);
				}
				else if (tok[0].equals("R")){
					int periods = Integer.parseInt(tok[5]);
					Rep = new RepSupply(tok[1], tok[2], tok[3], orders, periods, tok[6]);
					RS.addElement(Rep);
				}
			}
			scan.close();
        }catch(IOException ioe){ 
			System.out.println("The file can not be read");
		}
		
		/*or (int i=0; i<S.size();i++){  // check if it stores
			System.out.println(S.get(i).toString());
		}
		for (int i=0; i<RS.size(); i++){
			System.out.println(RS.get(i).toString());
		}*/
				
		
		String option1, option2;
		String ID, CustID, ProdID, startD, amo, perd, endD;
		int id, amounts, Period;
		scan = new Scanner(System.in);
		option1="";
		while(!option1.equals("Q")){
			System.out.println("Select an option:");
			System.out.println("Type \"A\" to add an order");
			System.out.println("Type \"D\" to delete an order");		
			System.out.println("Type \"L\" to list the orders in increasing date");
			System.out.println("Type \"Q\" to Quit");
			option1=scan.nextLine();
			
			switch (option1) {
				case "A":	System.out.println("To add one-time order type \"O\" and type \"R\" for repeated order" );
							option2 = scan.nextLine();
							if(option2.equals("O")){
								System.out.println("Enter customer ID");
								CustID = scan.nextLine();
								System.out.println("Enter product ID");
								ProdID = scan.nextLine();
								System.out.println("Enter the date");
								startD = scan.nextLine();
								System.out.println("Enter the amount");
								amo = scan.nextLine();
								amounts = Integer.parseInt(amo);
								System.out.println("Enter an ID for this order");
								ID = scan.nextLine();
								id = Integer.parseInt(ID);
								Supply addOrder = new Supply(CustID, ProdID, startD, amounts);
								addOrder.setID(id);
								System.out.println(addOrder.toString());
								S.addElement(addOrder);
							}
							else if(option2.equals("R")){
								System.out.println("Enter customer ID");
								CustID = scan.nextLine();
								System.out.println("Enter product ID");
								ProdID = scan.nextLine();
								System.out.println("Enter the date");
								startD = scan.nextLine();
								System.out.println("Enter the amount");
								amo = scan.nextLine();
								amounts = Integer.parseInt(amo);
								System.out.println("Enter the periods");
								perd = scan.nextLine();
								Period = Integer.parseInt(perd);
								System.out.println("Enter the end date");
								endD = scan.nextLine();
								System.out.println("Enter an ID for this order");
								ID = scan.nextLine();
								id = Integer.parseInt(ID);
								RepSupply addRepOrder = new RepSupply(CustID, ProdID, startD, amounts, Period, endD);
								addRepOrder.setID(id);
								RS.addElement(addRepOrder);
							}
							break;									
				
				case "D":   System.out.println("Enter the order ID");
							//System.out.println(S.size() + " " + RS.size()); Check the initial size
							option2 = scan.nextLine();
							id = Integer.parseInt(option2);
							for(int i=0; i<S.size(); i++){
								if (S.get(i).getID() == id){
									System.out.println("Order removed" + "\n" + S.get(i).toString());
									S.remove(i);
								}
							}
							for(int i=0; i<RS.size(); i++){
								if (RS.get(i).getID() == id){
									System.out.println("Order removed" + "\n" + RS.get(i).toString());
									RS.remove(i);
								}
							}
							//System.out.println(S.size() + " " + RS.size()); Check if the size changes
							break;
				
				case "L":   System.out.println("Enter the Customer ID that you want to sort"); // Sorting
							option2 = scan.nextLine();
							System.out.println(option2);
							for(int i = 0; i<S.size(); i++){
								if(S.get(i).getCustomerID().equals(option2)){
									int OnePeriod = 0;
									String OneEnd = "None";
									RepSupply OneTimeSupply = new RepSupply (S.get(i).getCustomerID(), S.get(i).getProductID(), S.get(i).getDate(), S.get(i).getAmount(), OnePeriod, OneEnd);
									NewRS.addElement(OneTimeSupply);
								}
								else if(RS.get(i).getCustomerID().equals(option2)){
									NewRS.addElement(RS.get(i));
								}
							}
							/*for (int i=0; i<NewRS.size(); i++){ //Check if I got the correct Customer ID.
								System.out.println(NewRS.get(i).toString());
							}*/
							RepSupply temp = new RepSupply();
							RepSupply Maxim = new RepSupply();
							int max;
							for(int k =0; k<NewRS.size(); k++){ //Swap
								max = MaxIndex(NewRS, NewRS.size() - k);
								Maxim = NewRS.get(max);
								temp = NewRS.get(NewRS.size()-k-1);
								NewRS.set(NewRS.size()-k-1, Maxim);
								NewRS.set(max, temp);
								System.out.println(NewRS.get(k).toString());
							}
							break;
							
				case "Q":   System.out.println("Quitting program");
							System.exit(0);
							
				default:	System.out.println("Wrong option! Try again");
							break;
			
			}
		}

	}
	
}