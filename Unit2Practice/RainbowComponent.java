import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RainbowComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rainbow r1 = new Rainbow();
        
        r1.draw(g2);
    }
}