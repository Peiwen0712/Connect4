//Create a seperate Board class
//where print the board, and method of checkWin, makeMove, placeCounter

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Board{

private char[][] board;
private int playCount = 0;
private int S; //initial the game, start the game
	
	public Board(int S){
	this.board = new char[6][8]; //row*coumn, i*j, the board size 
  this.S = S; //start the game
  }

	//prints the board
  public void printBoard(){ //print the board
    int i,j;
		for(i=0; i<board.length; i++){
			for(j=0; j<board[i].length-1; j++){
				if(board[i][j] == 'r'){ //check where to print r
					System.out.print("| r ");
				}
				else if(board[i][j] == 'y'){ //check where to print y
					System.out.print("| y ");
				}
				else{
					System.out.print("|   "); //print space for the rest
				}
			}
			System.out.println("|");
		}
		System.out.println("  1   2   3   4   5   6   7"); //print the bottom line
	}



  // Check  horizontal if there're 4 r or 4 y
  public boolean checkWin(char piece){
      int count = 0;
      boolean hasWon = false;
      for(int i=0; i<board.length; i++){
			  for(int j=0; j<board[i].length; j++){
				  if(board[i][j] == 'r' || board[i][j] == 'y'){ // || means or, r or y
					  count = count + 1;
					  if(count >= 4){
					  	hasWon = true;
              System.out.println("You won! Horizontal won!");              
					  }
				  }
           
				  else{
					  count = 0;
				  }
			  }
		  }
      
		  // Check  vertical if there're 4 r or 4 y
		  count = 0;
		  for(int i=0; i<board[0].length; i++){
			  for(int j=0; j<board.length; j++){
				  if(board[j][i] == 'r' || board[j][i] == 'y'){ // || means or, r or y
					  count = count + 1;
					  if(count >= 4){
						  hasWon = true;
              System.out.println("You won! Vertical won!");
               
					  }
				  }
         
          else{
					  count = 0;
				}
			}
    }

      // Check for right up diagonal  if there're 4 r or 4 
      for(int i=0; i<=6-(S-1); i++){
        for(int j=5; j>=S-1; j--){
            if (board[j][i] == piece && board[j-1][i+1] == piece && board[j-2][i+2] == piece && board[j-3][i+3] == piece){
              hasWon = true;
              System.out.println("You won! Upward diagonal won!");
            }
          }
        }
        
      // // Check for left down up diagonal  if there're 4 r or 4 
      for(int i=0; i<=7-S; i++){
        for(int j=0; j<=6-S; j++){
            if (board[j][i] == piece && board[j+1][i+1] == piece && board[j+2][i+2] == piece && board[j+3][i+3] == piece){
              hasWon = true;
              System.out.println("You won! Downward diagonal won!");
            } 
          }
        }
      return hasWon;
    }
    
    
//new function: check r and y position
    public void makeMove(char token, int position){
		boolean placed = false;
			for(int i=board.length-1; i>=0; i--){
				if(!placed){
					if((board[i][position-1] == 'r')||(board[i][position-1] == 'y')){
          }
					else {
						board[i][position-1] = token;
						placed = true;
					}
				}
			}
      printBoard();
      playCount = playCount + 1;
		}

 // new function: check if its draw
    public boolean Drawcheck(){
    boolean draw = false;
    if (playCount==42){ //row*column, make the board size bigger
      draw=true;
    }
    return draw;
  }

  //new function: check if the column is full
    public boolean checkColFull(int position){
    boolean full = false;
    if (board[0][position-1] == 'r' || board[0][position-1] == 'y'|| board[0][position-1] == 'b'){
      return true;
    }
    return full;
  }
  
  public void placeCounter(char player, int position){
		boolean placed = false;
		if(player == 'r'){
			for(int i=board.length-1; i>=0; i--){
				if(!placed){
					if(board[i][position-1] == 'y'){
						// skip
					}
					else if(board[i][position-1] != 'r'){
						board[i][position-1] = 'r';
						placed = true;
					}
				}
			}
		}
		else{
			for(int i=board.length-1; i>=0; i--){
				if(!placed){
					if(board[i][position-1] == 'r'){ 
						// skip
					}
					else if(board[i][position-1] != 'y'){
						board[i][position-1] = 'y';
						placed = true;
          }
        }
      }
    }
  }
}
