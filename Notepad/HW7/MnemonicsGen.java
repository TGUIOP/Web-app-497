import java.util.*;

public class MnemonicsGen implements letter{
	
	public static Vector<String> Final = new Vector<>();
	
	public static Vector <String> ListMnemonics(String number){
		Vector <String> output = new Vector<>();
		AllOutput(output, "" , number);
		return output;
	}
	
	public static void AllOutput(Vector<String>output, String PosOutput, String digits){
		char[] CharNumb = digits.toCharArray();
		if(digits.length() == 0){
			output.add(PosOutput);
			//return;
		}
		else{
			String letters = letter[Character.getNumericValue(CharNumb[0])];
			digits = digits.substring(1);
			for(int i = 0; i<letters.length(); i++){
				PosOutput = PosOutput + letters.charAt(i);
				AllOutput(output, PosOutput, digits);
				PosOutput = PosOutput.substring(0, PosOutput.length()-1);
			}
		}
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits");
		String numbers = sc.nextLine();
		Final = ListMnemonics(numbers);
		for(int i = 0; i<Final.size(); i++){
			System.out.println(Final.get(i));
		}
	}
}