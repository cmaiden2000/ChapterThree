
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance;  // employee's current  salary
           double additionalCharges;              // amount of the raise
           double newBalance;          // new salary for the employee
           double minimum;             // performance rating
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter your previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter additional charges ");
           additionalCharges = scan.nextDouble();
 
           newBalance = ((previousBalance + additionalCharges)*1.02);

           // Compute the raise using if ...
          if (newBalance < 50) {
            minimum = newBalance;
            
          } else if (newBalance >= 50 && newBalance <= 300) {
            minimum = 50.00;
            
          } else {
            minimum = (0.2 * newBalance);
            
          }
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Previous Balance:     " + money.format(previousBalance));
           System.out.println("Additional Charges:   " + money.format(additionalCharges));
           System.out.println("New Balance:          " + money.format(newBalance));
           System.out.println("Minimum Payment:      " + money.format(minimum));
        }
}