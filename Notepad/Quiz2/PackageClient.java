package A2;
import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class PackageClient{
	public static void main(String []args){
		//read the package information from the file
		//file format is 
		//from-address:to-address:wt:package-type
		//package-type=1 (two day) 2(overnight)
		Vector <TwoDayPackage> TwoDay = new Vector<TwoDayPackage>();
		Vector <OverNightPackage> OverNight = new Vector<OverNightPackage>();
		
		String line=new String();
		try{
			//read the file and create the objects
			File textFile = new File("package-dup.txt");
			Scanner scan = new Scanner(textFile);
			while(scan.hasNextLine())
			{
				line=scan.nextLine();				
				String []tok=line.split(":");
				String fromAddress=tok[0];
				String toAddress=tok[1];
				float wt=Float.parseFloat(tok[2]);
				int type=Integer.parseInt(tok[3]);
				if(type == 1){
					TwoDayPackage TPack = new TwoDayPackage(fromAddress, toAddress, wt);
					TwoDay.add(TPack);
				}
				else if(type == 2){
					OverNightPackage OPack = new OverNightPackage(fromAddress, toAddress, wt);
					OverNight.add(OPack);
				}
			}
			
		}catch(IOException e){
			System.out.println("Issuse with reading the file. Aborting");
			System.out.println(e.getMessage());
		}
		
		//For loop to remove the duplicate package
		for(int i=0; i<TwoDay.size(); i++){
			for(int k=0; k<TwoDay.size(); k++){
				if((TwoDay.elementAt(i).getFromAddress() == TwoDay.elementAt(k).getFromAddress()) && (TwoDay.elementAt(i).getToAddress() == TwoDay.elementAt(k).getToAddress()) && (TwoDay.elementAt(i).getWeight() == TwoDay.elementAt(k).getWeight())){
					TwoDay.remove(TwoDay.elementAt(k));
				}
			}
		}
		
		//For loop to remove the duplicate package
		for(int i=0; i<OverNight.size(); i++){
			for(int k=0; k<OverNight.size(); k++){
				if((OverNight.elementAt(i).getFromAddress() == OverNight.elementAt(k).getFromAddress()) && (OverNight.elementAt(i).getToAddress() == OverNight.elementAt(k).getToAddress()) && (OverNight.elementAt(i).getWeight() == OverNight.elementAt(k).getWeight())){
					OverNight.remove(OverNight.elementAt(k));
				}
			}
		}
		
		for(int i=0; i<TwoDay.size(); i++){
			System.out.println(TwoDay.get(i).printReceipt());
		}
		
		for(int i=0; i<OverNight.size(); i++){
			System.out.println(OverNight.get(i).printReceipt());
		}
	}
}