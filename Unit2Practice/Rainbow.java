import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Graphics;

public class Rainbow
{
    public Rainbow()
    {
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle5 = new Ellipse2D.Double(0,0,600,600);
        g2.setPaint(Color.RED);
        g2.fill(circle5);
        
        Ellipse2D.Double circle4 = new Ellipse2D.Double(50,50,500,550);
        g2.setPaint(Color.YELLOW);
        g2.fill(circle4);
        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(100,100,400,500);
        g2.setPaint(Color.GREEN);
        g2.fill(circle3);
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(150,150,300,450);
        g2.setPaint(Color.BLUE);
        g2.fill(circle2);
        
        Ellipse2D.Double circle1 = new Ellipse2D.Double(200,200,200,400);
        g2.setPaint(Color.WHITE);
        g2.fill(circle1);
        
        
        g2.draw(circle5);
        g2.draw(circle4);
        g2.draw(circle3);
        g2.draw(circle2);
        g2.draw(circle1);
    }
}
        
        