import javax.swing.JFrame;

/**
 * Enables the user to view the target in a window.
 * 
 * @author Jay Rixie
 * @version 9/17/2015
 */
public class TargetViewer
{
   public static void main(String[] args)
    throws InterruptedException
   {
       JFrame frame = new JFrame();
       
       frame.setSize(400,400);
       frame.setTitle("Target");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       TargetComponent component = new TargetComponent();
       frame.add(component);
       
       frame.setVisible(true);
       int t = 0;
       while( t != 10)
       {
           Thread.sleep(1000);
           frame.repaint();
           t += 1;
        }
    }
}