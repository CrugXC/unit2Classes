import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;


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
        starInfo    an array the keeps track of each stars x coordinate, y coordinate, and state
        */
    private int numberOfStars;
    private double xDim;
    private double yDim;
    private ArrayList starInfo;
    

    /**
     * Input amountStars and assigns it to numberOfStars
     * Assigns values to xDim and yDim
     */
    public Stars(int amountStars, double xDimension, double yDimension, ArrayList starData)
    {
        numberOfStars = amountStars;
        xDim = xDimension;
        yDim = yDimension;
        starInfo = starData;
        
    }
    

    /**
     * Draws stars in the sky 
     * Based on their state, they start of at a percentage of the total dimension, then animate as to create a twinkling effect
     * 
     */
    public void draw(Graphics2D g2)
    {
        
        
        int i = 0;
        while(i < numberOfStars * 3)
        {
            int xHolder = (int)starInfo.get(i);
            int yHolder = (int)starInfo.get(i+1);
            int stateHolder = (int)starInfo.get(i+2);
            double multiplier;
            if(stateHolder == 0 || stateHolder == 8)
            {
                multiplier = 1;
                Ellipse2D.Double star = new Ellipse2D.Double(xHolder - xDim*multiplier, yHolder - yDim*multiplier, xDim*multiplier, yDim*multiplier);
                g2.setPaint(Color.YELLOW);
                g2.fill(star);
            }
            
            if(stateHolder == 1 || stateHolder == 7)
            {
                multiplier = .75;
                Ellipse2D.Double star = new Ellipse2D.Double(xHolder - xDim*multiplier, yHolder - yDim*multiplier, xDim*multiplier, yDim*multiplier);
                g2.setPaint(Color.YELLOW);
                g2.fill(star);
            }
            
            if(stateHolder == 2 || stateHolder == 6)
            {
                multiplier = .5;
                Ellipse2D.Double star = new Ellipse2D.Double(xHolder - xDim*multiplier, yHolder - yDim*multiplier, xDim*multiplier, yDim*multiplier);
                g2.setPaint(Color.YELLOW);
                g2.fill(star);
            }
            
            if(stateHolder == 3 || stateHolder == 5)
            {
                multiplier = .25;
                Ellipse2D.Double star = new Ellipse2D.Double(xHolder - xDim*multiplier, yHolder - yDim*multiplier, xDim*multiplier, yDim*multiplier);
                g2.setPaint(Color.YELLOW);
                g2.fill(star);
            }
            
            if(stateHolder == 4)
            {
                multiplier = 0;
                Ellipse2D.Double star = new Ellipse2D.Double(xHolder - xDim*multiplier, yHolder - yDim*multiplier, xDim*multiplier, yDim*multiplier);
                g2.setPaint(Color.YELLOW);
                g2.fill(star);
            }
            
            else
            {
                Ellipse2D.Double star = new Ellipse2D.Double(1,1,1,1);
            }
            
            
            
            i += 3;
        }
    }
}
