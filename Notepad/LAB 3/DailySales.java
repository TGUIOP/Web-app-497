
public class DailySales {
	
	private int TotalDays;
	private int DayNumber;
	//private int sales;
	//int [] dayN = new int [TotalDays];
	private int [] salesN;
	private int count = 0;
	
	
	public DailySales(int TotalDays) {
		this.TotalDays = TotalDays;
		this.salesN = new int[TotalDays];
	}
	
	
	public boolean addSales(int DayNumber, int sales) {
	
		if((DayNumber <= TotalDays) && (sales >= 0) && (DayNumber > 0)) {
			//dayN [DayNumber-1] = DayNumber;
			salesN [DayNumber-1] += sales;
			return true;
		}
		else{
			return false;
		}
	}
	
	public int maxDay() {
		int max = 0;
		int index = 0;
		for(int i = 0; i<TotalDays;i++) {
			if(salesN[i] > max) {
				max = salesN[i];
				index = i+1;
			}
		}
		return index;
	}
	
	public int maxSales(int j){
		return salesN[j-1];
	}
	
	public int [] salesBelowGoal() { //must call before
		int[] belowGoal;
		int min = 100;
		for (int i = 0; i<TotalDays; i++) { //counts saless that are below the goal
			if (salesN [i] < min) {
				this.count++;
			}
		}
		int idx = 0;
		belowGoal = new int[count];
		for (int i = 0; i<TotalDays; i++) { //get the sasles
			if (salesN [i] < min) {
				belowGoal[idx] = salesN[i];
				idx++;
			}
		}

		return belowGoal;
	}
	
	public int [] daysBelowGoal() { //must call before
		int[] belowGoal = new int[count]; //determined from above
		int min = 100;

		int idx = 0;
		for (int i = 0; i<TotalDays; i++) { //get the sasles
			if (salesN [i] < min) {
				belowGoal[idx] = i+1;
				idx++;
			}
		}
		
		return belowGoal;
	}
	
	public String toString() {
		String ret = "";
		for(int i = 0; i  < TotalDays; i++){
			ret += "Day " + (i+1) + " " + salesN[i] + " \n";
		}
		return ret;
	}
	
	
	
	
	
	
	
}

