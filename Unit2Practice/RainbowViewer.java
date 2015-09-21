import javax.swing.JFrame;

public class RainbowViewer
{
    public static void main(String[] args)
    {
       JFrame frame = new JFrame();
       frame.setSize(600, 600);
       frame.setTitle("Rainbow");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       RainbowComponent component = new RainbowComponent();
       frame.add(component);
       
       frame.setVisible(true);
    }
}
        