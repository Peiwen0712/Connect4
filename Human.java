//Create a seperate Human class

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Human extends Player {
private BufferedReader input;
public Human(char piece){ //piece is user input(r)
  super(piece);
  input = new BufferedReader(new InputStreamReader(System.in));  //asks a move from the user input(System.in.)
}
  
  public int getPlayerInput(){

    input = new BufferedReader(new InputStreamReader(System.in));

		String toReturn = null;
		try{			
			toReturn = input.readLine(); 
		}
		catch(Exception e){
			
		}
    int position = Integer.parseInt(toReturn);
		return position;
	}
}