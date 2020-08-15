package library.client.classes;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
//import user defined classes
import carddeck.service.classes.CardSign;
import carddeck.service.classes.CardValue;
import carddeck.service.classes.Card;

class CardGame{
	Card [] userHand;
	Card [] dealerHand;
	CardGame(){//constructor
		this.userHand = new Card[5];
		this.dealerHand = new Card[5];
	}

    private void generateDealerHand(){
		int rndSign;
		int rndValue;
		for(int i=0;i<5;++i){
			//random generation of the cards
			rndSign = (int)(Math.random()*4);
			rndValue = (int)(Math.random()*13);
			dealerHand[i]=new Card(CardSign.values()[rndSign],CardValue.values()[rndValue]);
		}
	}
	private void printHand(){
		System.out.println("User's Hand:");
		for(int i=0;i<this.userHand.length;++i){
			System.out.println(this.userHand[i].toString());
		}
		System.out.println("Dealer's Hand:");
		for(int i=0;i<this.dealerHand.length;++i){
			System.out.println(this.dealerHand[i].toString());
		}
	}
	private boolean checkFlush(int flag){//Any five cards of the same suit/sign
		Card [] tmpHand;
		int tmpSign;
		if(flag==1)//check user hand
			tmpHand = this.userHand;
		else // check dealer hand
		    tmpHand = this.dealerHand;
		tmpSign = tmpHand[0].getSign().ordinal();
		for(int i=1;i<5;++i){
			if(tmpSign!=tmpHand[i].getSign().ordinal()){//check if the cards are of the same sign/suite
				return false;
			}
		}
		return true;
	}
	private boolean checkRoyalFlush(int flag){//ACE, KING, QUEEN, JACK, TEN, all of the same suit.
		//check if the cards are of the same suit/sign
		if(!this.checkFlush(flag))
			return false; // if the cards are not of the same suit, then they cannot have the Royal Flush
		//check if the hand has ACE, KING, QUEEN, JACK, TEN 
		Card [] tmpHand;
		int tmpSign;
		if(flag==1)//check user hand
			tmpHand = this.userHand;
		else // check dealer hand
		    tmpHand = this.dealerHand;
		for(int i=9;i<13;++i){
			for(int j=0;j<5;++j){
				if(tmpHand[j].getSign().ordinal() != i)
					return false;
			}			
		}
		return true;
	}
	private int getScore(){//what is the highest hand of the dealer and player?
		int userScore=0;
		int dealerScore=0;
		//check the dealer's hand
		if(checkRoyalFlush(0)){
			dealerScore=2;
		}else if(checkFlush(0)){
			dealerScore=1;
		}
		else{
			dealerScore=0;
		}
		//check the player's hand
		if(checkRoyalFlush(1)){
			
		}else if(checkFlush(1)){
			userScore=1;
		}
		else{
			userScore=0;
		}
		
		if(userScore==0 && dealerScore==0){
			return 0; //tie
		}
		else if(userScore>=dealerScore){
			return 1;//user wins
		}
		else
			return -1;//dealer wins
	}	
	public static void main(String []args){
	//arg[0]: file containing user hand
		CardGame game=new CardGame();
		//read the the files from text files
		int counter=0;
		Card aCard;
		Scanner scan;
		String str;
		try {
			File myFile=new File(args[0]);
            scan=new Scanner(myFile);
			while(scan.hasNextLine()){
				str=scan.nextLine();				
				String []tok=str.split(":");
				aCard = new Card(CardSign.valueOf(tok[0]),CardValue.valueOf(tok[1]));
				game.userHand[counter++]=aCard;
			}			
		
		//lets play iPoker!!
		//User interactive part
		String option1;
		scan = new Scanner(System.in);
		int score;
		while(true){
			System.out.println("Select an option:");
			System.out.println("Type \"P\" to play a round of iPoker");			
			System.out.println("Type \"Q\" to Quit");
			option1=scan.nextLine();
			
			switch (option1) {								 
				case "P":   game.generateDealerHand();
				            score=game.getScore();
							game.printHand();///First print out the hands
							System.out.println("\n\nCompare the two hands:");
							if(score < 0)
								System.out.println("Dealer Wins :-(");
							else if (score == 0)
								System.out.println("Its a draw");
							else if (score > 0)
								System.out.println("Congrats You win !!");
							else
								System.out.println("Somethings wrong!");
							break;
				
				case "Q":   System.out.println("Quitting program");
							System.exit(0);
							
				default:	System.out.println("Wrong option! Try again");
							break;
			
			}			
		}
		}catch(IOException ioe){ 
			System.out.println("The file can not be read");
		}catch(IllegalArgumentException ia){ 
            System.out.println(ia.getMessage());
		} catch(NullPointerException np){
			System.out.println(np.getMessage());
		}
	}	

}