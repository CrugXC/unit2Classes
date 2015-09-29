import java.util.Scanner;


public class NumberConvertor
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Number: ");
        String number = s.next();
        
        number = number.replace(",","");
        
        
        System.out.println("New Number: " + number);
    }
}
        