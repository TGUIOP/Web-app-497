import java.util.*;

public class Palindrome{
	
	
	public static boolean testPalindrome(String str) {
		char[] checking = str.toCharArray();
		
		if (str.length() == 0 || str.length() == 1) {
			return true;
		} else if (checking[0] != checking[str.length()-1]) {
			return false;
		} else { //recursive case
			testPalindrome(str.substring(1, str.length()));
		}
		
		return false; //never happen
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		String lower = input.toLowerCase();
		String fixed = lower.replaceAll("\\s+","");
		//System.out.println("fixed string is " + fixed);
		System.out.println(testPalindrome(fixed));
		
	}
	
}