import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws 5 circles to create a target pattern
 * 
 * @author Jay Rixie 
 * @version 9/17/2015
 */
public class TargetComponent extends JComponent
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target t1 = new Target(0,0);
        
        Target t2 = new Target(100,100);
        
        Target t3 = new Target(200,200);
        
        t1.draw(g2);
        t2.draw(g2);
        t3.draw(g2);
    }

}
