import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.ArrayList;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Jay Rixie
 * @version 10/1/15
   */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int numberOfStars;
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(int amountStars)
    {
        numberOfStars = amountStars;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        
        ArrayList starInfo = new ArrayList(numberOfStars);
        StarGenerator starInformation = new StarGenerator(numberOfStars);
        starInfo = starInformation.starMaker();
        
        
        Background base = new Background(50);
        Stars starDots = new Stars(100, 5, 5, starInfo);
        Bridge suspBridge = new Bridge(100);
        Buildings skyscrapers = new Buildings(200);
        Grid mainGrid = new Grid();
        
        
        
        base.draw(g2);
        starDots.draw(g2);
        suspBridge.draw(g2);
        skyscrapers.draw(g2);
        mainGrid.draw(g2);
    }

    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
