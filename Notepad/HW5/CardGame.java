package PartB;
import java.util.*;

public abstract class CardGame implements Card{
	
	public Vector <String> deck = new Vector <String> (52);
	public int cardNumber = 0;
	
	public CardGame(){
		for(int i=0; i<card.length; i++){
			for(int k=0; k<suit.length; k++){
				deck.add(card[i]+ " of " + suit[k]);
			}
		}
	}
	
	public void shuffle() {
		
		for(int i=0;i<52;++i){
			int rndVal= (int)(Math.random()*(52));
			String tmp = deck.elementAt(rndVal);
			String temp = deck.elementAt(i);
			deck.set(i, tmp);
			deck.set(rndVal, temp);
		}
	}
	
	public abstract void displayDescription();
	public abstract void deal();
}