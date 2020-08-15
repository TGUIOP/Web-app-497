
class Sudoku {
	private int [][] sudoku;
	
	public Sudoku() {
		int [][] sudoku = new int [9][9];
	}
	public Sudoku (int [][] sudoku) {
		this.setSudoku (sudoku);
	}
	//mutator
	public void setSudoku(int [][] sudoku){
		this.sudoku = sudoku;
	}
	//accessor
	public int[][] getSudoku(){
		return this.sudoku;
	}
	
	public boolean checkRow(int [][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				for (int k = j+1; k < board[i].length; k++) {
					if (board[i][j] == board[i][k]) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public boolean checkCol(int [][] board){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++)  {
				for (int k = j+1; k < board.length; k++) {
					if (board[j][i] == board[k][i]){
						return false;
					}
				}
			}
		}
		return true;
	}
	public boolean checkBlock(int [][] board) {
		int [] b = new int [9];
		int cnt = 0;
		for (int i = 0; i < 9; i+=3) {
			for (int j = 0; j < 9; j +=3) {
				for (int k = i; k < (i+3); k++) {
					for (int l = j; l < (j+3); l++) {
						b[cnt++] = board[l][k];
					}
				}
				for (int x = 0; x < 9; x++) {
					for (int y = x+1; y < 9; y++) {
						if (b[x] == b[y]) {
							return false;
						}
					}
				}
				cnt = 0;
			}
		}
		return true;
	}
	// public boolean equals (Sudoku game) {
	//	if((game.checkRow() == true) && (game.checkCol() == true) && (game.checkBlock() == true)){
	public boolean equals () {
		if (this.checkRow(this.sudoku) && this.checkCol(this.sudoku) && this.checkBlock(this.sudoku)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString(){
		String str = "";
		for(int i = 0; i<9; i++){
			for(int j =0; j<9; j++){
				str += this.getSudoku()[i][j] + " ";
				if (j == 8) {
					str += "\n";
				}
			}
		}
		return str;
	}
}