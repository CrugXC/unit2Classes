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
   {
       JFrame frame = new JFrame();
       
       frame.setSize(200,200);
       frame.setTitle("Target");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       TargetComponent component = new TargetComponent();
       frame.add(component);
       
       frame.setVisible(true);
    }
}