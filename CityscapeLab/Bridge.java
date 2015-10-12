/* NOTE: This class was scrapped due to the approaching due date and the difficulty in the mathemtics of calculating parameters for the QuadCurve2D class*/



import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;


/**
 * Creates a Suspension Bridge Design using rectangles, lines, and Quadratic Curves
 * 
 * @author Jay Rixie
 * @version 10/2/15
 */
public class Bridge
{
    /** bridgeHeight    Defines the height of the bridge */
    private double bridgeHeight;

    /**
     * Default constructor for objects of class Bridge
     */
    public Bridge(double b_Height)
    {
        bridgeHeight = b_Height;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        The background must already be drawn, and the JFrame must be 1920x940
     * @post       A Suspension Bridge will be drawn on the JFrame
     */
    public void draw(Graphics2D g2)
    {
        /* Creates the framework for the bridge, 1 horizontal rectangle spanning between the islands, and 2 vertical rectangles as a tower */
        Rectangle2D.Double bridgeRoad = new Rectangle2D.Double(720, 815, 300, 20);
        
        g2.setColor(Color.BLACK);
        g2.fill(bridgeRoad);
    }

}
