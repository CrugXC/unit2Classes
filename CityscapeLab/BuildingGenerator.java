import java.util.Random;
import java.util.ArrayList;

/**
 * Generates the buildings and saves their data to an Arraylist
 * 
 * @author Jay Rixie
 * @version 10/11/15
 */
public class BuildingGenerator
{
    // avHeight   the user's imported average height for the buildings
    //xCord    determines the position on the X Coordinate of the island
    private double avHeight;
    private int xCord = 50;

    /**
     * Constructor for objects of class BuildingGenerator
     */
    public BuildingGenerator(double averageHeight)
    {
        // initialise instance variables
        avHeight = averageHeight;
    }

    /**
     * Randomly generates a set of buildings and returns their data in an ArrayList
     * 
     * @return     returns an ArrayList with building data in it
     */
    public ArrayList BuildingMaker()
    {

            ArrayList buildingData = new ArrayList();

            /* Creates a random object, then generates a number based of that in order to decide the type of building */
            Random r1 = new Random();
            
            int baseCord = 810;
            
            int arrayTracker = 0;
            buildingData.add(arrayTracker);
            
            
            while(xCord < 1800)
            {
                /* Color Randomizer */
                buildingData.add(r1.nextInt(13));
                
               
                
                /*Chooses building Type*/
                buildingData.add(r1.nextInt(2));
                
                /*Determines the height and width of this building instance */
                double yHeight = avHeight + (r1.nextInt((int)(avHeight/3)) - (int)(avHeight/6.0));
                
                buildingData.add(yHeight);
                
                buildingData.add(baseCord - yHeight);
                
                double xWidth = ((avHeight/4) + (r1.nextInt((int) (avHeight/10)) - (int) (avHeight/20)));
                
                buildingData.add(xWidth);
                
                xCord += xWidth + 20;
                
                buildingData.add(xCord);
                arrayTracker += 6;
            }
            
            
            buildingData.set(0, arrayTracker);
            return buildingData;
    }
}
