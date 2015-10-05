import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


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
    private double waterHeight;

    /**
     * Default constructor for objects of class Background
     */
    public Background(double w_height)
    {
        radius1 = 800;
        radius2 = 600;
        waterHeight = w_height;
        
    }

    /**
     * Draw Method creates all the instances used in background on JFrame
     *
     * @pre     This method must be used in correlation with a JFrame of dimensions 1920x940
     * 
     * @post    The island objects will be created on theJFrame class.

     */
    public void draw(Graphics2D g2)
    {
        /* Creates two ellipses using the Ellipse2D.Double class */
        Ellipse2D.Double island1 = new Ellipse2D.Double(-100, 730, 1000, 500);
        
        Ellipse2D.Double island2 = new Ellipse2D.Double(900, 755, 1000, 400);
        
        /*Creates a rectangle to simulate water */
        Rectangle2D.Double water = new Rectangle2D.Double(0, 940 - waterHeight, 1920, waterHeight);
        
        /*Creates backdrop using rectangle */
        Rectangle2D.Double backdrop = new Rectangle2D.Double(0, 0, 1920, 940);
        
        /*Creates two rectangles to flatten out the top of the slops */
        Rectangle2D.Double flat1 = new Rectangle2D.Double(30, 725, 900, 80);
        Rectangle2D.Double flat2 = new Rectangle2D.Double(1050, 755, 900, 50);
        
        /*Sets the paint color (Dark Blue, Dark Green, Dark Blue, and Medium Blue) and fills the backdrop, the islands, and the hill flatteners, and the water, respectively */
        
        g2.setPaint(new Color(0, 0, 80));
        
        g2.fill(backdrop);
        
        g2.setPaint(new Color(0, 50, 0));
        g2.fill(island1);
        g2.fill(island2);
        
        g2.setPaint(new Color(0, 0, 80));
        g2.fill(flat1);
        g2.fill(flat2);
        
        g2.setPaint(new Color(0, 0, 150));
        g2.fill(water);
        
        
        
    }

}
