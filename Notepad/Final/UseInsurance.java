package PartA1;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class UseInsurance{
	
	public static Vector <Insurance> totalInsurance = new Vector <Insurance> ();
	
	public static void main(String []args){		
	//arg[0]: text file  containing the policy information		
				
		Scanner scan;
		String str;
		try {
			File myFile=new File("insurance.txt");
            scan=new Scanner(myFile);//each line has the format 
			//name;age;policy-type{Health or Life}
			while(scan.hasNextLine()){
				str=scan.nextLine();			
				String []tok=str.split(";");
				String name=tok[0];//name of the policy holder
				int age = Integer.parseInt(tok[1]);//age of the policy holder
				String type = tok[2];//type of the insurance values are "Health" or "Life"
				if(type.compareTo("Health")==0){
					//this is a Health insurance policy	
					HealthInsurance h = new HealthInsurance(name, age, type);
					totalInsurance.add(h);
				}
				else{
					//this is a Life insurance policy
					LifeInsurance l = new LifeInsurance(name, age, type);
					totalInsurance.add(l);
				}				
			}
			scan.close();
        }catch(IOException ioe){ 
			System.out.println("The file can not be read");
		}
		
		InsuranceGroup IG = new InsuranceGroup(totalInsurance);
	}
}