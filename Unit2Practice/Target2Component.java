import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.geom.Point2D;

/**
 * This component draws lines to create an arrow
 * 
 * @author Jay Rixie 
 * @version 9/17/2015
 */
public class Target2Component extends JComponent
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target2 t1 = new Target2(200, 200, 10);
        
        t1.draw(g2);
    }
}
        