import javax.swing.JFrame;

public class Target2Viewer
{
   public static void main(String[] args)
    throws InterruptedException
   {
       JFrame frame = new JFrame();
       
       frame.setSize(400,400);
       frame.setTitle("Target");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       Target2Component component = new Target2Component();
       frame.add(component);
       
       frame.setVisible(true);
    }
}