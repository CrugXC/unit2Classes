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
    private Color[] colorArray = {Color.GRAY, Color.DARK_GRAY, Color.LIGHT_GRAY, Color.BLACK, Color.BLUE};
    /**
     * Default constructor for objects of class Buildings
     */
    public Buildings(double averageHeight)
    {
        avHeight = averageHeight;
        /* x1 = the starting x coordinate of island 1*/
        /* x2 = the starting x coordinate of island 2*/
        /* baseCord = the base coordinate of island*/
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
        int buildingColor = r1.nextInt(5);
        
        
        /*Chooses building Type*/
        int buildingType = r1.nextInt(2);
        
        /*Determines the height and width of this building instance */
        double xHeight = avHeight + (r1.nextInt(avHeight/3.0) - (avHeight/6.0));
        double yWidth = 30 + (r1.nextInt(10) - 5);
        
        /* Determines what the variable it and draws the building based on that*/
        if(buildingType == 0)
        {
            /*Creates a rectangular building */
            Rectangle2D.Double building = new Rectange2D.Double(x1, (xHeight + baseCord), xHeight, yWidth);
            g2.setPaint(colorArray[buildingColor]);
            g2.fill(building);
        }
        
        if(buildingType == 2)
        {
            /*Creates a stacked building using rounded rectangle */
            double firstHeight = xHeight/2;
            double secondHeight = xHeight/1.5;
        }
    }

}
