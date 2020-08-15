package PartA2;

public class FindMax{
	
	public int getMax(int []nums){
		if(nums.length == 1){
			return nums[0];
		}
		else{
			for(int i = 0; i<nums.length; i++){
				if(nums[nums.length-1] < nums[i]){
					return getMax(nums.remove(nums.length-1));
				}
				else{
					return nums[nums.length-1];
				}
			}
		}
		return 1; //will never happen
	}
	
	public static void main(String []args){
		int []a={113,2,5,23,98};
		FindMax max = new FindMax();
		System.out.println("Max no. is " + max.getMax(a));
	}	
}