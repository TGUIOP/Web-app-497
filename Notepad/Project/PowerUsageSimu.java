import java.io.File;
import java.io.IOException;
import java.util.*;

public class PowerUsageSimu{
	
	public static Vector <Appliances> A = new Vector <Appliances>();
	//public static Vector <Integer> numberLoc = new Vector <>();
	
	public static void Delete(int ID){ // delete an appliance
		for(int i = 0; i<A.size(); i++){
			if(A.get(i).getID() == ID){
				System.out.println(A.get(i));
				A.remove(A.get(i));
			}
		}
	}
	
	public static void LocApp(int loc){ // get all the appliances from a location
		for(int i = 0; i<A.size(); i++){
			if(A.get(i).getLocation() == loc){
				System.out.println(A.get(i));
			}
		}
	}
	
	public static void TypeApp(String tp){ // get all the appliances from a particular type
		for(int i = 0; i<A.size(); i++){
			if(A.get(i).getType().equals(tp)){
				System.out.println(A.get(i));
			}
		}
	}
	
	/*public static int numberLocations(){
		int n = 0;
		int count = 0;
		Vector <Integer> numberLoc = new Vector <>();
		for(int i = 0; i<A.size(); i++){
			//A.insertElementAt(new Regular(), A.size()+1);
			if(A.elementAt(i).getLocation() != A.elementAt(i+1).getLocation()){
				n++;
			}		
		}
		return n;
	}*/
	
	/*public static int numberTypes(){
		int n = 0;
		int count = 0;
		for(int i = 0; i<A.size(); i++){
			for(int k = 0; k<A.size(); k++){
				if(A.elementAt(i).getType().equals(A.elementAt(k).getType())){
					n++;
				}
				else{
					count++;
				}
			}
		}
		return n;
	}*/
	
	public static int getRandInt(char type, int x, int y) {
		int num;
		switch (type) { 
		case 'U': case 'u':		// Uniform Distribution
			num = (int)(x + (Math.random()*(y+1-x))); 
			break;
		case 'E': case 'e':		// Exponential Distribution
			num = (int)(-1*x*Math.log(Math.random()));  
			break;	
		case 'N': case 'n':		// Normal Distribution
			num = (int)( x +
                (y * Math.cos(2 * Math.PI * Math.random()) *
                Math.sqrt(-2 * Math.log(Math.random()))));
			break;			
		default:				// Uniform Distribution
			num = (int)(x + (Math.random()*(y+1-x))); 
		}
		return num;
	}
	
	
	public static void main(String []args){

		Scanner scan;
		String str;
		Regular reg;
		Smart sm;

		try {
			File myFile=new File("output.txt");
            scan=new Scanner(myFile);
			while(scan.hasNextLine()){ //Stores the Appliances in the vector
				str=scan.nextLine();				
				String [] tok=str.split(",");
				int location = Integer.parseInt(tok[0]);
				int ON = Integer.parseInt(tok[2]);
				float prob = Float.parseFloat(tok[3]);
				double LW = Double.parseDouble(tok[5]);
				if (tok[4].equals("false")){
					reg = new Regular(location, tok[1],ON,prob);
					A.addElement(reg);
				}
				else if (tok[4].equals("true")){
					sm = new Smart(location, tok[1],ON,prob,LW);
					A.addElement(sm);
				}
			}
			scan.close();
        }catch(IOException ioe){ 
			System.out.println("The file can not be read");
		}
		
		/*for(int i = 0; i<A.size(); i++){ //check if the appliances were stored in the vector
			System.out.println(A.get(i).toString());
		}*/
		
		String option1, option2;
		String str1,type,str3,str4,str5,str6;
		int loca, HW, ID;
		float pb;
		double LWatt;
		scan = new Scanner(System.in);
		option1 = "";
		
		while(!option1.equals("Q")){
			System.out.println("Select an option:");
			System.out.println("Type \"A\" to add an appliance");
			System.out.println("Type \"D\" to delete an appliance");		
			System.out.println("Type \"G\" to find an appliance");
			System.out.println("Type \"L\" to list all appliances of a location");
			System.out.println("Type \"T\" to list all appliances of a particular type");
			System.out.println("Type \"Q\" to Quit");
			option1=scan.nextLine();
			
			switch (option1) {
				case "A":	System.out.println("To add regular appliance type \"Regular\" or type \"Smart\" for smart appliance or type \"File\" to read from a file");
							option2 = scan.nextLine();
							if(option2.equals("Smart")){
								System.out.println("Enter location");
								str1 = scan.nextLine();
								loca = Integer.parseInt(str1);
								System.out.println("Enter type");
								type = scan.nextLine();
								System.out.println("Enter the on wattage");
								str3 = scan.nextLine();
								HW = Integer.parseInt(str3);
								System.out.println("Enter the probability");
								str4 = scan.nextLine();
								pb = Float.parseFloat(str4);
								System.out.println("Enter the wattage reduce rate");
								str5 = scan.nextLine();
								LWatt = Double.parseDouble(str5);
								System.out.println("Enter the ID: ");
								str6 = scan.nextLine();
								sm = new Smart(loca, type, HW, pb, LWatt);
								ID = Integer.parseInt(str6);
								sm.setID(ID);
								A.addElement(sm);
								System.out.println(sm.toString());
							}
							else if(option2.equals("Regular")){
								System.out.println("Enter location");
								str1 = scan.nextLine();
								loca = Integer.parseInt(str1);
								System.out.println("Enter type");
								type = scan.nextLine();
								System.out.println("Enter the on wattage");
								str3 = scan.nextLine();
								HW = Integer.parseInt(str3);
								System.out.println("Enter the probability");
								str4 = scan.nextLine();
								pb = Float.parseFloat(str4);
								System.out.println("Enter the ID: ");
								str6 = scan.nextLine();
								reg = new Regular(loca, type, HW, pb);
								ID = Integer.parseInt(str6);
								reg.setID(ID);
								A.addElement(reg);
								System.out.println(reg.toString());
							}
							else if(option2.equals("File")){
								System.out.println("Enter the file name");
								str1 = scan.nextLine();
								try {
									File myFile2=new File(str1);
									scan=new Scanner(myFile2);
									while(scan.hasNextLine()){ //Stores the Appliances in the vector
										str=scan.nextLine();				
										String [] token = str.split(",");
										int location2 = Integer.parseInt(token[0]);
										int ON2 = Integer.parseInt(token[2]);
										float prob2 = Float.parseFloat(token[3]);
										double LW2 = Double.parseDouble(token[5]);
										if (token[4].equals("false")){
											reg = new Regular(location2, token[1],ON2,prob2);
											A.addElement(reg);
										}
										else if (token[4].equals("true")){
											sm = new Smart(location2, token[1],ON2,prob2,LW2);
											A.addElement(sm);
										}
									}
									scan.close();
								}catch(IOException ioe){ 
									System.out.println("The file can not be read");
								}
							}
							
							//System.out.println(A.size());
							break;									
				
				case "D":   System.out.println("Enter the Appliance ID");
							//System.out.println(S.size() + " " + RS.size()); Check the initial size
							option2 = scan.nextLine();
							ID = Integer.parseInt(option2);
							Delete(ID);
							System.out.println(A.size());
							break;
				
				case "G":   System.out.println("Enter the appliance ID"); // Sorting
							option2 = scan.nextLine();
							ID = Integer.parseInt(option2);
							for(int i = 0; i<A.size(); i++){
								if(A.get(i).getID() == ID){
									System.out.println(A.get(i).toString());
								}
							}
							break;
							
				case "L":	System.out.println("Enter the location");
							option2 = scan.nextLine();
							loca = Integer.parseInt(option2);
							LocApp(loca);
							break;
							
				case "T":	System.out.println("Enter the type");
							option2 = scan.nextLine();
							TypeApp(option2);
							break;
							
				case "Q": 	//System.out.println(numberLocations());
				
							//System.out.println("Quitting program " + numberTypes());
							System.exit(0);
							
				default:	System.out.println("Wrong option! Try again");
							break;
			
			}
		}
		
		final int ARRIVAL_MEAN=5;
		int simulationLength=0, minute=0, nextArrivalTime, callCount=0; 
		Scanner input = new Scanner(System.in);
	
		while (simulationLength<=0)	{
			System.out.print("How many minutes long is the simulation? "); 

			while (!input.hasNextInt()) {
				input.next();
				System.out.print("Please enter an integer: ");
			}
			simulationLength = input.nextInt();
		}

		nextArrivalTime = minute + getRandInt('E', ARRIVAL_MEAN, 0);
		
		while(minute<=simulationLength) {
			while ((minute == nextArrivalTime) && (minute<=simulationLength)) {
				callCount++;
				System.out.println("Minute:"+minute+" Event#"+callCount);
				nextArrivalTime=minute+getRandInt('E', ARRIVAL_MEAN, 0);
			}
			minute++;
		} 
		System.out.println("Number of events = " + callCount);
		
	}
}