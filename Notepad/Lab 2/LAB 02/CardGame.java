//package library.client.classes;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/*Task 2: Import necessary user defined classes */
import carddeck.service.classes.CardSign;
import carddeck.service.classes.CardValue;

class CardGame{
	Card [] userHand;
	Card [] dealerHand;
	
	public CardGame(){
		userHand = new Card [5];
		dealerHand = new Card [5];
	}

    private void generateDealerHand(){
		/*Task 5: Implement the class method generateDealerHand() in CardGame class. This method will use a random generator to generate signs, and values of the cards for the dealer.*/
		for(int i=0; i<5; i++){
			int random = (int)(Math.random()*(4));
			int random2 = (int)(Math.random()*(13));
			Card dealerHand2 = new Card (CardSign.values()[random], CardValue.values()[random2]);
			dealerHand[i] = dealerHand2;
		}
	}
	
	private void setUserHand(int i, Card C){
		userHand [i] = C;
	}
	
	private int getScore(){
		int dealerPoint = 0;
		int userPoint = 0;
		/*Task 3: Implement the class method getScore() in CardGame class. This method will compare the cards of the dealer and player and provide a score. If the score is zero, it means the game is a tie. If the score is positive, then the player has won the game. You should implement other methods as needed.*/
		if((dealerHand[0].getSign().ordinal() == dealerHand[1].getSign().ordinal()) && (dealerHand[1].getSign().ordinal() == dealerHand[2].getSign().ordinal()) && (dealerHand[2].getSign().ordinal() == dealerHand[3].getSign().ordinal()) && (dealerHand[3].getSign().ordinal() == dealerHand[4].getSign().ordinal())) {
				dealerPoint = 100;
		}
		else {
				dealerPoint = 0;
			}
		if((userHand[0].getSign().ordinal() == userHand[1].getSign().ordinal()) && (userHand[1].getSign().ordinal() == userHand[2].getSign().ordinal()) && (userHand[2].getSign().ordinal() == userHand[3].getSign().ordinal()) && (userHand[3].getSign().ordinal() == userHand[4].getSign().ordinal())){
				userPoint = 100;
			}
		else {
				userPoint = 0;
		}
		return userPoint;
	}

	private void printHand(){
		for (int i =0; i<5; i++){
			System.out.println(dealerHand[i].getSign() +" " + dealerHand[i].getValue());
		}
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
			File myFile=new File("hand.txt");
            scan=new Scanner(myFile);
			int i = 0;
			while(scan.hasNextLine()){
				str=scan.nextLine();
				String []tok=str.split(":");
			/*Task 4: Implement the code in the main method of the CardGame class, that will take the values read from the text file, create Card objects and populate the array Hand. userHand is an attribute of the CardGame class.*/
				Card userHand2 = new Card (CardSign.valueOf(tok[0]), CardValue.valueOf(tok[1]));
				// aCard = new Card (CardSign.valueOf(tok[0]), CardValue.valueOf(tok[1]));
				game.setUserHand(i++, userHand2);
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
				case "P":  	for(i=0; i<5; i++){
								System.out.println(game.userHand[i]);
							}
							game.generateDealerHand();
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