import java.util.Scanner;


public class Rectangle
{
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
           
        System.out.print("What is the length: ");
        double length = s.nextDouble();
        
        System.out.print("What is the width: ");
        double width = s.nextDouble();
        
        System.out.println("\nThe Area is " + (length*width) + "\nThe Perimeter is " + (2 * width + 2 * length) );
        
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        
        System.out.printf("The Diagonal is %.2f" , diagonal);
    }
}
        
    