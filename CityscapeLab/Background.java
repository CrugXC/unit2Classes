import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Creates 2 green circles below the page, so the top of them peaks into the screen to form 2 island like shapes
 * and a blue rectangle at the base to look like water, and a dark blue background to be the sky
 * @author Jay Rixie
 * @version 10/1/15
 */
public class Background
{
    /** radius1   correlates to the size of the first island
        radius2   correlates to the size of the second island
        waterHeight */
    private double radius1;
    private double radius2;

    /**
     * Default constructor for objects of class Background
     */
    public Background()
    {
        radius1 = 800;
        radius2 = 600;
    }

    /**
     * Draw Method creates all the instances used in background on JFrame
     *
     * @pre     This method must be used in correlation with a JFrame of dimensions 1920x1040
     * 
     * @post    The island objects will be created on theJFrame class.

     */
    public void draw(Graphics2D g2)
    {
        /* Creates two ellipses using the Ellipse2D.Double class */
        Ellipse2D.Double island1 = new Ellipse2D.Double(-100, 830, 1000, 500);
        
        Ellipse2D.Double island2 = new Ellipse2D.Double(900, 855, 1000, 400);
        
        /*Sets the paint color to a dark green and fills each ellipse */
        g2.setPaint(new Color(0, 50, 0));
        g2.fill(island1);
        g2.fill(island2);
    }

}
