package Client;
import Client.Services.Classes.MyBills;
import Client.Services.BillsType;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
class MyBillsClient{
	public String[] totalExpensesPerMonth(MyBills []bills)
	{
		String []totExpenses=new String[bills.length];
		String month;
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US); 
		for(int i=0;i<bills.length;++i)
		{
			while(bills[i]!=null)//while object is not null
			{
				month=bills[i].getMonthExpenses();
				double totAmt=0;
				for(int j=i;j<bills.length;++j)
				{					
					if((bills[j].getMonthExpenses()).equals(month))
					{
						for(int k=0;k<(bills[j].getExpenseAmt()).length;++k)
						{
							totAmt=totAmt+(bills[j].getExpenseAmt())[k];
						}
						bills[j]=null;
					}
				}
				totExpenses[i]= "The total of all expenses for the month of "+ month+ " is : " + n.format(totAmt);				
			}
			
		}
		return totExpenses; 
	}
	public static void main(String []args)
	{
		String line;
		String []tokens;
		int cnt=0;//no of lines
		//find the number of lines in the text file
		
		MyBills []bills;
		try
		{
			File myFile=new File("myexpenses.txt");
			Scanner scan=new Scanner(myFile);
			while(scan.hasNextLine())
			{
				line=scan.nextLine();
				
				line=scan.nextLine();
			
				++cnt;				
			}
			System.out.println("done reading file: " + cnt);
			scan.close();
			scan=new Scanner(myFile);		
			bills=new MyBills[cnt];
			cnt=0;
			while(scan.hasNextLine())
			{
				line=scan.nextLine();
				System.out.println(line);
				tokens=line.split(":");
				String month=tokens[1];
				BillsType type=BillsType.valueOf(tokens[3]);
				line=scan.nextLine();
				tokens=line.split(",");
				int noDays=tokens.length;
				double []expenseAmt=new double[noDays];
				for(int i=0;i<noDays;++i)
				{
					expenseAmt[i]=Double.parseDouble(tokens[i]);
				}
				//create an object
				bills[cnt++]=new MyBills(month, type, expenseAmt,noDays);
				System.out.println("creating object: " + cnt);				
			}
			scan.close();
			//display the expense objects
			System.out.println("_________Output # 1______________");
			for(int i=0;i<bills.length;++i)
			{
				System.out.println(bills[i].toString());
			}
			
			System.out.println("_________Output # 2______________");
			MyBillsClient client=new MyBillsClient();
			String []output=client.totalExpensesPerMonth(bills);
			
			for(int i=0;i<output.length;++i)
			{
				if(output[i]!=null)
				System.out.println(output[i]);
			}
			
		}//end of try block of code!!!!!!
		catch(IOException ioe){ 
			System.out.println("The file can not be read");
			
		}
	}
}