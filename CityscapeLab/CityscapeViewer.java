import javax.swing.JFrame;
import java.awt.Color;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author Jay Rixie
 * @version 10/1/15
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_HALFSECONDS = 120;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(1920 /* x */, 940 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // creating scanner object
        Scanner s1 = new Scanner(System.in);
        
        
        //Asks user how many Star objects will be created and saves it as an int
        System.out.print("How many stars are in the sky(Recommended 0 - 1000): ");
        int amountStars = s1.nextInt();
        
        //Asks user how high they want the water to be and saves it as a double
        System.out.print("What is the height of the water(Recommended 25 - 100): ");
        double waterHeight = s1.nextDouble();
        
        //Asks user what they want the average height of the city to be and saves it as a double
        System.out.print("What is the average height of the buildings in the city(Recommended 100 - 300): ");
        double avHeight = s1.nextDouble();
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(amountStars, waterHeight, avHeight);
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_HALFSECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 500 );
        }
        
    }

}
