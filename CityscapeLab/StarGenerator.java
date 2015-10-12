import java.util.Random;
import java.util.ArrayList;

/**
 * Generates the coordinates and state of each star object and exports it as an ArrayList
 * 
 * @author Jay Rixie
 * @version 10/8/15
 */
public class StarGenerator
{
    // numberOfStars    based on the user's inputted amount of stars+
    private int numberOfStars;

    /**
     * Constructor for objects of class StarGenerator
     */
    public StarGenerator(int amountStars)
    {
        numberOfStars = amountStars;
    }
    /**
     * Randomizes the coordinates and state of each star, then saves it to an array
     * 
     * @return   Returns an ArrayList with star coordinates and state in it
     */
    public ArrayList starMaker()
    {
        Random r1 = new Random();
        int i = 0;
        ArrayList starData = new ArrayList(numberOfStars * 3);

        while(i < numberOfStars)
        {
            starData.add(r1.nextInt(1920) + 1);
            starData.add(r1.nextInt(800) + 1);
            starData.add(r1.nextInt(9));
            
            
            i += 1;
        }
        return starData;
    }

}
