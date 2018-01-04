
import java.util.Scanner;

public class StarsClass {
  public static void main (String[] args)  {
    // Scanner scan = new Scanner(System.in);
    // String directionInput;

    // int maxNum;

    // System.out.println("How many stars do you want in the big row?");
    // maxNum = scan.nextInt();
    // System.out.println("What direction, up or down?");
    // directionInput = scan.next().toLowerCase();
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("Pattern 1");
    System.out.println("");
    System.out.println("");
    patternOne();
    //=======================================================================
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("Pattern 2");
    System.out.println("");
    System.out.println("");
    patternTwo();
    //=======================================================================
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("Pattern 3");
    System.out.println("");
    System.out.println("");
    patternThree();
    //=======================================================================
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("Pattern 4");
    System.out.println("");
    System.out.println("");
    patternFour();
  }

  public static void patternOne() {
    int stars = 10;

    for (int x = 0; x < 10; x++) {
      // System.out.println("Stars: " + stars);
      for (int i = 0; i < stars; i++) {
        System.out.print("*");
      }
      stars--;
      System.out.println();
    }

  }

  
  }
