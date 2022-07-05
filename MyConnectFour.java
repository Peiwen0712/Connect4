//Create a MyConnectFour class


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random; // generate random int for computer'c choice

public class MyConnectFour {

  private Human player1; //human
  private AI player2; //computer
  private int position;
  private BufferedReader input;
	private char[][] board;

  public MyConnectFour(){
    player1 = new Human('r'); //r is red
    player2 = new AI('y'); //y is yellow
		startGame();
	}
// Game instructions that prints once the game loads.
  public void startGame(){

		int S;
    S = 4; //start the game

		  Board board = new Board(S);
      board.printBoard(); 
  
		  boolean hasWon = false;
      while(!hasWon){
        
        //player1(human)
        System.out.println("Your turn:");
        position = 0;
        while (position<1 || position>7){ //input 1 - 7

          try{
            position = player1.getPlayerInput();
          }
          catch (NumberFormatException e){
            System.out.println("Please try again.");
          }
        }
      //check valid move
        while(board.checkColFull(position)==true){
          System.out.println("Column full, please try again.");
          try{
            position = player1.getPlayerInput();
          }
          catch (NumberFormatException e){
            System.out.println("Please try again. Enter a valid number.");
            position = player1.getPlayerInput();
          }
        }
      board.makeMove(player1.getry(), position);
      if (board.checkWin(player1.getry()) == true){ //check win
        hasWon = true;
        break; 
      }

      //player2 (AI) 
      position = player2.getPlayerInput();
      //check valid move
      while(board.checkColFull(position)==true){
        position = player2.getPlayerInput();
      }
      board.makeMove(player2.getry(),position);
      System.out.println("------------------------------");//loop print every round
      System.out.println("Bot chose column" + position);

      if (board.checkWin(player2.getry()) == true){ //check win
        hasWon = true;
        System.out.println("Player 2 wins!");
        break;
      }

  }
  }
  } 





  