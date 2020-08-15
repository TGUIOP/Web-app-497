import java.util.Random;
class Client{
	
	public static void main(String [] args){

		Random rn = new Random();

		int [][] myArray;
		myArray = new int [9][9];
		myArray = new int [][]{{4,3,5,2,6,9,7,8,1},{6,8,2,5,7,1,4,9,3},{1,9,7,8,3,4,5,6,2},{8,2,6,1,9,5,3,4,7},{3,7,4,6,8,2,9,1,5},{9,5,1,7,4,3,6,2,8},{5,1,9,3,2,6,8,7,4},{2,4,8,9,5,7,1,3,6},{7,6,3,4,1,8,2,5,9}}; //Sudoku Solution

		for (int i=0; i<myArray.length; i++){ //Random generate the sudoku
			for(int j=0; j<myArray[i].length;j++){
				int rand = (int)(Math.random()*9+1);
				myArray[i][j] = rand;
			}
		}
		
		Sudoku game = new Sudoku(myArray);

		System.out.println(game.toString());
		System.out.println("Row check : " + game.checkRow(myArray));
		System.out.println("Column check: " + game.checkCol(myArray));
		System.out.println("Block check: " + game.checkBlock(myArray));
		System.out.println("Sudoku check: " + game.equals());
		
	}
}