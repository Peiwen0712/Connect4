//Create a seperate AI class

import java.util.Random; 
// generate random int for computer'c choice

public class AI extends Player{
  
  private int one; 
  private int eight;
  private int next;

  public AI(char circle){super(circle);}

  public int getPlayerInput(){
  Random move = new Random();
  one = 1;
  eight = 8;
  next = move.nextInt(eight-one)+one; //random number generated 
  return next;
  }
}