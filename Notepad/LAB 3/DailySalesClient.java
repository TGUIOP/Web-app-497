import java.util.*;

public class DailySalesClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days");
		int days = sc.nextInt();
		DailySales day1 = new DailySales (days);
		
		
		int wdays;
		int salesD;
		
		do{
		System.out.println("Enter the day\nOr enter a negative value to exit");
		wdays = sc.nextInt();
			if ((wdays > 0) && (wdays <= days)) {
				do{
					System.out.println("Enter the sales");
					salesD = sc.nextInt();
					if (salesD < 0){
						System.out.print("invalid sales number \nEnter the value again\n");
					}
				}while (salesD < 0);
				day1.addSales(wdays, salesD);
			}
			
			System.out.println(day1.toString());
		}
		while ((wdays > 0) && (wdays <= days));
		
		int[] salesBelow = day1.salesBelowGoal();
		int[] daysBelow = day1.daysBelowGoal();
		
		System.out.println("Days not meeting goal: ");
		for (int i = 0; i<salesBelow.length; i++) {
			System.out.println("Day " + daysBelow[i] + ": " + salesBelow[i]);
		}
		
		System.out.println("Max sales occured on Day " + day1.maxDay());
	}
}
