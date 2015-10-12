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
    private double xCord;
    private double baseCord;
    private double frameSize;
    private Color[] colorArray = {new Color(0,0,50), new Color(0,0,200), new Color(20,0,0), new Color(0,0, 130), new Color(10, 0, 20), new Color(25,5,15), new Color(20,20,20), new Color(50,50,50), new Color(100,100,100), new Color(150,150,150), new Color(200,200,200), new Color(250, 250, 250)};
    /**
     * Default constructor for objects of class Buildings
     */
    public Buildings(double averageHeight)
    {
        avHeight = averageHeight;
        xCord = 50;
        baseCord = 810; 
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
        while(xCord < 1800 )
        {
            /* Creates a random object, then generates a number based of that in order to decide the type of building */
            Random r1 = new Random();
            
            /* Color Randomizer */
            int buildingColor = r1.nextInt(13);
            
            
            /*Chooses building Type*/
            int buildingType = r1.nextInt(2);
            
            /*Determines the height and width of this building instance */
            double yHeight = avHeight + (r1.nextInt((int)(avHeight/3)) - (int)(avHeight/6.0));
            double buildingCord = baseCord - yHeight;
            double xWidth = (avHeight/4) + (r1.nextInt((int) (avHeight/10)) - (int) (avHeight/20));
            
            
            /* Sets paint color */
            g2.setPaint(colorArray[buildingColor]);
            
            if(xCord < 700 || xCord > 1050)
            {
                /* Determines what the variable it and draws the building based on that*/
                if(buildingType == 0)
                {
                    /*Creates a rectangular building */
                    Rectangle2D.Double building = new Rectangle2D.Double(xCord, buildingCord, xWidth, yHeight);
                    g2.fill(building);
                }
                
                if(buildingType == 1)
                {
                    /*Creates a stacked building using rounded rectangle */
                    double firstHeight = yHeight/1.5;
                    Rectangle2D.Double baseRectangle = new Rectangle2D.Double(xCord, baseCord - firstHeight, xWidth, firstHeight);
                    Rectangle2D.Double secondTop = new Rectangle2D.Double (xCord + xWidth/4, buildingCord, xWidth/2, yHeight);
                    
                    /* Fills them with set color */
                    g2.fill(baseRectangle);
                    g2.fill(secondTop);
                    
                }
            }
            
            xCord += xWidth + 20;
        }
    }

}
