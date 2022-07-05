//Create a seperate Player class
//  use red and yellow to track two players

public abstract class Player {

  private char ry; // ry means red and yellow
  public abstract int getPlayerInput();
  public Player(char ry){
    this.ry = ry;
  }

  public char getry(){
    return ry;
  }
}