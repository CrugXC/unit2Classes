import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Creates a grid of lines in intervals of 50, to be used only when testing program
 * 
 * @author Jay Rixie 
 * @version 10/3/15
 */
public class Grid
{
    /* intervalCord   Used as the x and y cord for the graphs starting coordinate
     * XDIM    Used as the x dimension for the rectangles
     * YDIM    Used as the y dimension for the rectangles
     */

    private double intervalCord;
    private final double XDIM = 1920;
    private final double YDIM = 940;
    
    public Grid()
    {
        intervalCord = 50;
    }
    
        
    /**
     * Creates Grid on rectangles
     *
     */
    public void draw(Graphics2D g2)
    {
        while(intervalCord < 2000)
        {
            Rectangle2D.Double vertLine = new Rectangle2D.Double(intervalCord, 0, 2, YDIM);
            Rectangle2D.Double horzLine = new Rectangle2D.Double(0, intervalCord, XDIM, 2);
            g2.drawString("cord" + intervalCord, 930.0, intervalCord + 30);
            g2.drawString("" + intervalCord,  intervalCord + 30, 20.0);
            g2.setPaint(new Color(0, 0, 0));
            g2.fill(vertLine);
            g2.fill(horzLine);
            
            intervalCord += 50;
        }
    }
}
