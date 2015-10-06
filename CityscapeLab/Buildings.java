import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 * Creates a building between 3 different subclasses, rectang
 * 
 * @author Jay Rixie
 * @version 10/5/15
 */
public class Buildings
{
    /** description of instance variable x (add comment for each instance variable) */
    private double avHeight;
    private double x1;
    private double x2;
    private double baseCord;
    private double frameSize;
    private Color[] colorArray = {Color.GRAY, Color.LIGHT_GRAY, Color.BLACK, Color.BLUE};
    /**
     * Default constructor for objects of class Buildings
     */
    public Buildings(double averageHeight)
    {
        avHeight = averageHeight;
        x1 = 40;
        x2 = 1070;
        baseCord = 800; 
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        There must not be buildings already drawn on the Frame, and the JFrame must be 1920x940
     * @post    Multiple buildings of different shapes will be drawn
     */
    public void draw(Graphics2D g2)
    {
        /* Creates a random object, then generates a number based of that in order to decide the type of building */
        Random r1 = new Random();
        
        /* Color Randomizer */
        int buildingColor = r1.nextInt(4);
        
        
        /*Chooses building Type*/
        int buildingType = r1.nextInt(2);
        
        /*Determines the height and width of this building instance */
        double yHeight = avHeight + (r1.nextInt((int)(avHeight/3)) - (int)(avHeight/6.0));
        double buildingCord = baseCord - yHeight;
        double xWidth = (avHeight/4) + (r1.nextInt((int) (avHeight/10)) - (int) (avHeight/20));
        
        
        /* Sets paint color */
        g2.setPaint(colorArray[buildingColor]);
        
        /* Determines what the variable it and draws the building based on that*/
        if(buildingType == 0)
        {
            /*Creates a rectangular building */
            Rectangle2D.Double building = new Rectangle2D.Double(x1, buildingCord, xWidth, yHeight);
            g2.fill(building);
        }
        
        if(buildingType == 1)
        {
            /*Creates a stacked building using rounded rectangle */
            double firstHeight = avHeight/2;
            double secondHeight = avHeight/1.5;
            Rectangle2D.Double startRectangle = new Rectangle2D.Double(x1, buildingCord + firstHeight, xWidth, firstHeight);
            RoundRectangle2D.Double firstTop = new RoundRectangle2D.Double (x1, buildingCord + firstHeight - 20, xWidth, firstHeight, xWidth/2, xWidth/2);
            
            /* Fills them with set color */
            g2.fill(startRectangle);
            g2.fill(firstTop);
            
        }
    }

}
