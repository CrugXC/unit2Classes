import java.util.Scanner;

public class Change
{
     public static void main(String[] args)
     {
         Scanner s = new Scanner(System.in);
         
         System.out.print("What is the amount of change you owe(in pennies): ");
         int changeOwed = s.nextInt();
         
         int dollars = changeOwed / 100;
         
         changeOwed = changeOwed - (dollars * 100);
         
         int quarters = changeOwed / 25;
         changeOwed = changeOwed - (quarters * 25);
         
         int dimes = changeOwed / 10;
         changeOwed = changeOwed - (dimes * 10);
        
         int nickels = changeOwed / 5;
         changeOwed = changeOwed - (nickels * 5);
         
         int pennies = changeOwed;
         
         System.out.println("You owe " + dollars + " Dollars, " + quarters + " Quarters, " + dimes + " Dimes, " + nickels + " Nickels, " + pennies + " Pennies.");
     }
}
         