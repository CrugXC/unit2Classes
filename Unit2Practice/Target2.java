import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
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
    
    
    public Target2(int x, int y, int numberOfRings)
    {
        xCord = x;
        yCord = y;
        rings = numberOfRings;
        
    }
    
    public void draw(Graphics2D g2)
    {
        int offset = 0;
        
        Random r1 = new Random();
        
        for(int i = 0; i < rings; i ++)
        {
            Ellipse2D.Double circle = new Ellipse2D.Double(xCord + (offset * 20), yCord + (offset * 20), (50 * offset), (50 * offset));;
            color = r1.nextInt(8);
            g2.setPaint(colorArray[color]);
            g2.fill(circle);
            offset += 1;
            
        }
    }
}
        
        
        
    
