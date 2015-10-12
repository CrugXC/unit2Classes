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
    /*  numberOfStars   The user passes in the number of stars they want to see in the sky
     *  starInfo    ArrayList imported from StarGenerator class that contains all necesary parameters used in creating the star objects
     *  base    Background object that draws the backdrop, 2 islands, and a water lever
     *  NOTE: CLASS REMOVED - suspBridge  Bridge object drawn between the islands
     *  skyscrapers Buildings object that creates multiple random buildings across the islands
     */
    private int numberOfStars;
    private ArrayList starInfo;
    private Background base;
    //CLASS REMOVED - private Bridge suspBridge;
    private Buildings skyscrapers;
    //CLASS NOT PRESENT IN VERSION - private Grid mainGrid;
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    public CityscapeComponent(int amountStars, double waterHeight, double avHeight)
    {
        //Saves amountStars to numberOfStars
        numberOfStars = amountStars;
        
        
        starInfo = new ArrayList(numberOfStars);
        StarGenerator starInformation = new StarGenerator(numberOfStars);
        starInfo = starInformation.starMaker();
        
        //Creates the Background object based on the parameter of waterHeight
        base = new Background(waterHeight);
        
        //Creates the Bridge object based on the parameter of towerHeight
        //CLASS REMOVED - suspBridge = new Bridge(towerHeight);
        
        //Creates the Buildings object based on the parameter of avHeight
        skyscrapers = new Buildings(avHeight);
        
        //Not used in this version of the program, also it currently does not work, reason unknown
        //mainGrid = new Grid();
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        
        //Creates Stars object by passing in the int numberOfStars and the ArrayList starInfo 
        Stars starDots = new Stars(numberOfStars, 5, 5, starInfo);

        
        
        //Draws all objects
        base.draw(g2);
        starDots.draw(g2);
        skyscrapers.draw(g2);
        
        //Not used in this version, refer to object creation in constructor
        //mainGrid.draw(g2);
    }

    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        
        
        // No need to given automatic updates within the classes
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        this.repaint();
    }

}
