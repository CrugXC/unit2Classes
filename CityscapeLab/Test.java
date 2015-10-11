import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.util.Random;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;


public class Test extends JComponent
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        
        Rectangle2D.Double bridgeRoad = new Rectangle2D.Double(500, 500, 100, 20);
        Rectangle2D.Double tower1 = new Rectangle2D.Double(525, 450, 7, 100);
        Rectangle2D.Double tower2 = new Rectangle2D.Double(568, 450, 7, 100);
        QuadCurve2D.Double rope1 = new QuadCurve2D.Double(500, 500, 525, 500, 525, 450);
        QuadCurve2D.Double rope1Fill = new QuadCurve2D.Double(500, 498, 525, 498, 525, 448);
        
        
        g2.setColor(Color.BLACK);
        g2.fill(bridgeRoad);
        g2.fill(tower1);
        g2.fill(tower2);
        g2.fill(rope1);
        
        
        g2.setColor(Color.WHITE);
        g2.fill(rope1Fill);
    }
}
