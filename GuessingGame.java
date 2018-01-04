
import java.util.Scanner;
import java.util.Random;
 
public class GuessingGame
{
  public static void main(String[] args)
  {
    int numToGuess;           //Number the user tries to guess
    int guess;                //The user's guess
    int numberGuess = 0;
    int numberGuessLow = 0;
    int numberGuessHigh = 0;

    Scanner scan = new Scanner(System.in);
    Random generator = new Random();

    numToGuess = generator.nextInt(10) + 1;
    System.out.println("Guess a number between 1 and 10");
    guess = scan.nextInt();
    while (guess != numToGuess)
    {
      if ( guess > numToGuess) {
        System.out.println("Too high");
        System.out.println("Guess again");
        guess = scan.nextInt();
        numberGuessHigh += 1;
      } else if (guess < numToGuess) {
        System.out.println("Too low");
        System.out.println("Guess again");
        guess = scan.nextInt();
        numberGuessLow += 1;
      } else {
        System.out.println("ERROR 404");
      }
      numberGuess++;
    }
    System.out.println("Sorry, you guessed wrong");
    System.out.println("You guessed " + numberGuess + " times");
    System.out.println("You guessed high " + numberGuessHigh + " times");
    System.out.println("You guessed low " + numberGuessLow + " times");
  }
}