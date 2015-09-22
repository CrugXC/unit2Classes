import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Graphics2D;


public class Arrow
{
    private int xCord;
    private int yCord;
    
    public Arrow(int x, int y);
    {
        xCord = x;
        yCord = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Point2D.Double p1 = new Point2D.Double(xCord, yCord);
        Point2D.Double p2 = new Point2D.Double(xCord - 20, yCord + 10);
        Point2D.Double p3 = new Point2D.Double(xCord - 20, yCord - 10);
        Point2D.Double p4 = new Point2D.Double(xCord - 20, yCord);
        Point2D.Double p5 = new Point2D.Double(xCord - 70, yCord);
        
        Line2D,Double l1 = new Line2D.Double(p1, p2);
        Line2D,Double l2 = new Line2D.Double(p1, p3);
        Line2D,Double l3 = new Line2D.Double(p2, p3);
        Line2D,Double l4 = new Line2D.Double(p4, p5);
        
        g2.draw(l1);
        g2.draw(l1);
        g2.draw(l1);
        
        
        
    
