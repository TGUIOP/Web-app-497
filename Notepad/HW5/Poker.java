package PartB;

public class Poker extends CardGame{
	
	public Poker() {
		super.cardNumber = 5;
		super.shuffle();
	}
	public void displayDescription(){
		System.out.println("Poker is a family of card games that combines gambling, strategy, and skill." +
		" All poker variants involve betting as an intrinsic part of play, and determine the winner of each hand according to the combinations of players' cards," + 
		" at least some of which remain hidden until the end of the hand" + "\n");
	}
	
	public void deal(){
		for(int i=0; i<5; i++){
			System.out.println(deck.elementAt(i));
		}
		System.out.println("\n");
	}
}