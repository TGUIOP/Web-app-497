package PartB;

public class Bridge extends CardGame{
	
	public Bridge() {
		super.cardNumber = 13;
		super.shuffle();
	}
	public void displayDescription(){
		System.out.println("Bridge is a trick-taking card game using a standard 52-card deck. " +
		"In its basic format, it is played by four players in two competing partnerships, with partners sitting opposite each other around a table."					
		+	"Each player, in a clockwise order, plays one card on the trick. Players must play a card of the same suit as the original card led," 
		+	" unless they have none (said to be void" + ")" + ", in which case they may play any card." + "\n");
	}
	
	public void deal(){
		for(int i=0; i<13; i++){
			System.out.println(deck.elementAt(i));
		}
		System.out.println("\n");
	}
}