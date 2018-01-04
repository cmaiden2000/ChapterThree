
// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class RockPaperSiccors
{
    public static void main(String[] args)
    {
        String pOne;    //User's play -- "R", "P", or "S"
        String computersTurn;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        //Get player's play -- note that this is stored as a string
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Choose one, Rock, Paper or Scissors");
        
        pOne = scan.next().toUpperCase();

        
        computerInt = generator.nextInt(2) + 1;
        //Translate computer's randomly generated play to string
        if (computerInt == 0) {
          computersTurn = "Rock";
          
        } else if (computerInt == 1) {
          computersTurn = "Paper";
          
        } else {
          computersTurn = "Scissors";
          
        }
        //Print computer's play
        System.out.println("Your turn: " + pOne);
        System.out.println("Computer's turn: " + computersTurn);
        //See who won.
        if (computersTurn.equals("Rock") && pOne.equals("Scissors")) {
          System.out.println("Boom! You Lose");
          
        } else if (computersTurn.equals("Rock") && pOne.equals("Paper")) {
          System.out.println("Nice! You won");
          
        } else if (computersTurn.equals("Rock") && pOne.equals("Rock")) {
          System.out.println("Tie, play again");
          
        } else if (computersTurn.equals("Paper") && pOne.equals("Rock")) {
          System.out.println("Boom! You Lose");
          
        } else if (computersTurn.equals("Paper") && pOne.equals("Scissors")) {
          System.out.println("Nice! You won");
          
        } else if (computersTurn.equals("Paper") && pOne.equals("Paper")) {
          System.out.println("Tie, play again");
          
        } else if (computersTurn.equals("Scissors") && pOne.equals("Rock")) {
          System.out.println("Nice! You won");
          
        } else if (computersTurn.equals("Scissors") && pOne.equals("Paper")) {
          System.out.println("Boom! You Lose");
          
        } else if (computersTurn.equals("Scissors") && pOne.equals("Scissors")) {
          System.out.println("Tie, play again");
          
        } 
        }
    }
