package PartB;

public class PlayCardGame{
	
	public static void main(String[]args){
		
		Bridge B = new Bridge();
		Poker P = new Poker();
		
		P.displayDescription();
		P.deal();
		
		B.displayDescription();
		B.deal();
		
		/*Bridge B2 = new Bridge();
		Poker P2 = new Poker();
		
		P2.displayDescription();
		P2.deal();
		
		B2.displayDescription();
		B2.deal();*/
		
	}
}