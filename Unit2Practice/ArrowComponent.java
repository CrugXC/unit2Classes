import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This component draws lines to create an arrow
 * 
 * @author Jay Rixie 
 * @version 9/17/2015
 */
public class TargetComponent extends JComponent
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        p1 = t1.getCord();
        p2 = t2.getCord();
        p3 = t3.getCord();
        
        Random r1 = new Random();
        
        
        Arrow a1 = new Arrow((p1.getX + (r1(100) - 50)), (p1.getY + (r1(100) - 50)));
        Arrow a2 = new Arrow((p2.getX + (r1(100) - 50)), (p2.getY + (r1(100) - 50)));
        Arrow a3 = new Arrow((p3.getX + (r1(100) - 50)), (p3.getY + (r1(100) - 50)));
        
        a1.draw(g2);
        a2.draw(g2);
        a3.draw(g3);
    }
}
        