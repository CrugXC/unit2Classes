import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;


/**
 * Draws small yellow circles in the sky based on the amount of stars wanted by the user
 * They will be animiated to shrink, then grow at random intervals
 * 
 * @author Jay Rixie 
 * @version 10/7/15
 */
public class Stars
{
    /** numberOfStars    Based on the users imputted number of stars
        xDim   the base x dimension
        yDim   the base y dimension
        starData    an array the keeps track of each stars x coordinate, y coordinate, and state
        */
    private int numberOfStars;
    private double xDim;
    private double yDim;
    private String[][] starData;

    /**
     * Input amountStars and assigns it to numberOfStars
     * Assigns values to xDim and yDim
     */
    public Stars(int amountStars, double xDimension, double yDimension)
    {
        numberOfStars = amountStars;
        xDim = xDimension;
        yDim = yDimension;
    }
    
    
    /**
     * Randomizes the coordinates and state of each star, then saves it to an array
     */
    public void starGenerator()
    {
        Random r1 = new Random();
        int i = 0;
        double[] arrayHolder;
        while(i < numberOfStars)
        {
            arrayHolder.add(r1.nextInt(1920) + 1);
            arrayHolder.add(r1.nextInt(750) + 1);
            arrayHolder.add(r1.nextInt(10));
            
            starData.add(arrayHolder);
            Arrays.fill(arrayHolder, null);
            
            i += 1;
        }
    }


    /**
     * Draws stars in the sky 
     * Based on their state, they start of at a percentage of the total dimension, then animate as to create a twinkling effect
     * 
     */
    public void draw(Graphics2D g2)
    {
        
    }
}
