import java.util.Scanner;

public class Annuity
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Starting money: ");
        double pmt = s.nextDouble();
        
        System.out.print("Fractional Percentage: ");
        double i = s.nextDouble();
        
        System.out.print("Number of Periods: ");
        double n = s.nextDouble();
        
        double output = pmt*(((Math.pow((1+i), (n-1)) - 1)/i) / (Math.pow((1+i), n-i)) + 1);
        
        
        
        System.out.printf("Total money: %.2f" , output);
        
        
    }
}
