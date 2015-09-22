import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Creates a shooting target on the screen
 * 
 * @author Jay Rixie
 * @version 9/16/201
 */
public class Target
{
    /** xCord   Determines the x-coordinate of the target on the screen */
    private int xCord;
    
    /** yCord   Determines the y-coordinate of the target on the screen */
    private int yCord;
    



    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        Random r1 = new Random();
        xCord = x;
        yCord = y;
        Color[][] colorArray = {
            {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE, Color.YELLOW} /** CYAN, GREY, GREEN, BLACK, PINK*/
        };
        
        int color1 = r1.nextInt(5);
        int color2 = r1.nextInt(5);
        while(color1 == color2)
        {
            color2 = r1.nextInt(5);
        }
    }

    /**
     * Creates the target on the screen
     *
     * @post    The target will appear
     */
    public void draw(Graphics2D g2)
    {
        
        Ellipse2D.Double circle5 = new Ellipse2D.Double(25,25,100,100);
        g2.setPaint(colorArray[color1]);
        g2.fill(circle5);
        
        Ellipse2D.Double circle4 = new Ellipse2D.Double(35,35,80,80);
        g2.setPaint(colorArray[color2]);
        g2.fill(circle4);
        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(45,45,60,60);
        g2.setPaint(colorArray[color1]);
        g2.fill(circle3);
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(55,55,40,40);
        g2.setPaint(colorArray[color2]);
        g2.fill(circle2);
        
        Ellipse2D.Double circle1 = new Ellipse2D.Double(65,65,20,20);
        g2.setPaint(colorArray[color1]);
        g2.fill(circle1);
        
        
        
        g2.draw(circle5);
        g2.draw(circle4);
        g2.draw(circle3);
        g2.draw(circle2);
        g2.draw(circle1);
        
    }

}
