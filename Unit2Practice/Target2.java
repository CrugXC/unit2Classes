import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class Target2
{
    private int xCord;
    private int yCord;
    private int rings;
    private Color[] colorArray = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE, Color.YELLOW, Color.CYAN, Color.GRAY, Color.GREEN, Color.PINK};
    private int color;
    private int r;
    
    
    public Target2(int x, int y, int numberOfRings, radius)
    {
        xCord = x;
        yCord = y;
        rings = numberOfRings;
        r = radius;
    }
    
    public void draw(Graphics2D g2)
    {
        
        Random r1 = new Random();
        
        for(int i = 0; i < rings; i ++)
        {
            Ellipse2D.Double circle = new Ellipse2D.Double(i * r, i * r, (10 - i) * r, (10-i) *r);
            color = r1.nextInt(8);
            g2.setPaint(colorArray[color]);
            g2.fill(circle);
            
        }
    }
}
        
        
        
    
