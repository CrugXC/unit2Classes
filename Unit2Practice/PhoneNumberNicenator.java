import java.util.Scanner;

public class PhoneNumberNicenator
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("What is the Phone Number: ");
        String number = s.next();
        
        String start = number.substring(0,3);
        String middle = number.substring(3,6);
        String end = number.substring(6,10);
        
        System.out.println("The Formatted Number is: (" + start + ") - " + middle + " - " + end);
    }
}
    