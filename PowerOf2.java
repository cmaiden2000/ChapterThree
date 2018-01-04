
// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//              
// ****************************************************************
import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args)
    {
        int numPowersOf2;        
        int nextPowerOf2 = 1;        
        int exponent;                
                                    
        Scanner scan = new Scanner(System.in);

        System.out.println("How many?");
        numPowersOf2 = scan.nextInt();  
       
        
        exponent = 0;
        while ( exponent < numPowersOf2)
        {
            System.out.println("2 ^ " + exponent + " = " + nextPowerOf2);
            
            nextPowerOf2 = nextPowerOf2 * 2;
            
            exponent++;
        }
    }
}