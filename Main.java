//Main.java
//print game introduction once at the beginning of the game
//create a MyConnectFour object

class Main {
  public static void main(String[] args) {

//game introduction
    System.out.println("");
    System.out.println("Welcome to Connect 4!");
		System.out.println("There are 2 players Red and Yellow");
		System.out.println("Player 1(you) is Red, Player 2 (Bot) is Yellow");
		System.out.println("Type in the number of the column you want to drop in");
		System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
    System.out.println("Lets's go! :D");    
    System.out.println("");

    new MyConnectFour();
  }
}

// six files in total:
//Main.java: create a MyConnectFour object
//AI.java: generate random int for computer'c choice
//Board.java: print the board, and method of checkWin, makeMove, placeCounter
//MyConnectFour
//Player.java: use red and yellow to track two players




