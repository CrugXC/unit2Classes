import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
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
    private Color[] colorArray = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE, Color.YELLOW, Color.CYAN, Color.GRAY, Color.GREEN, Color.PINK};
        
    private int color1;
    private int color2;



    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        Random r1 = new Random();
        xCord = x;
        yCord = y;
        
        
        color1 = r1.nextInt(8);
        color2 = r1.nextInt(8);
        while(color1 == color2)
        {
            color2 = r1.nextInt(5);
        }
    }

    
    public Point2D getCords()
    {
        Point2D p1 = new Point2D.Double(xCord, yCord);
        return p1;
    }
    
    
    
    /**
     * Creates the target on the screen
     *
     * @post    The target will appear
     */
    public void draw(Graphics2D g2)
    {
        
        Ellipse2D.Double circle5 = new Ellipse2D.Double(xCord + 25, yCord + 25,100,100);
        g2.setPaint(colorArray[color1]);
        g2.fill(circle5);
        
        Ellipse2D.Double circle4 = new Ellipse2D.Double(xCord + 35,yCord + 35,80,80);
        g2.setPaint(colorArray[color2]);
        g2.fill(circle4);
        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(xCord + 45, yCord + 45,60,60);
        g2.setPaint(colorArray[color1]);
        g2.fill(circle3);
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(xCord + 55, yCord +55,40,40);
        g2.setPaint(colorArray[color2]);
        g2.fill(circle2);
        
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xCord + 65, yCord + 65,20,20);
        g2.setPaint(colorArray[color1]);
        g2.fill(circle1);
 
        
        g2.draw(circle5);
        g2.draw(circle4);
        g2.draw(circle3);
        g2.draw(circle2);
        g2.draw(circle1);
        
        
                /* Arrow */
        
        g2.setPaint(Color.BLACK);
        
        
        
        Point2D.Double mainPoint = new Point2D.Double(xCord, yCord);
        
        
        Random r1 = new Random();
        
        Double xCord2 = (mainPoint.getX() + (r1.nextInt(100) + 20));
        Double yCord2 = (mainPoint.getY() + (r1.nextInt(100) + 20));
        
        Point2D.Double p1 = new Point2D.Double(xCord2, yCord2);
        Point2D.Double p2 = new Point2D.Double(xCord2 - 20, yCord2 + 10);
        Point2D.Double p3 = new Point2D.Double(xCord2 - 20, yCord2 - 10);
        Point2D.Double p4 = new Point2D.Double(xCord2 - 20, yCord2);
        Point2D.Double p5 = new Point2D.Double(xCord2 - 70, yCord2);
        
        Line2D.Double l1 = new Line2D.Double(p1, p2);
        g2.fill(l1);
        
        Line2D.Double l2 = new Line2D.Double(p1, p3);
        g2.fill(l2);
        
        Line2D.Double l3 = new Line2D.Double(p2, p3);
        g2.fill(l3);
        
        Line2D.Double l4 = new Line2D.Double(p4, p5);
        g2.fill(l4);
        
        
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
        g2.draw(l4);
        
    }

}
