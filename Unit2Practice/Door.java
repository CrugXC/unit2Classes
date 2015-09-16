

/**
 * Simulates a named door with the states of open or closed
 * 
 * @author Jay and Nathan 
 * @version 9/15/15
 */
public class Door
{
    /** state shows whether the door is opened or closed
       name shows the chosen name for the door
       */
    private String state;
    private String name;

    /**
     * Pass in the string for the name of the door
     * Pass in the string for the state of the door, "open" or "closed"
     */
    public Door(String doorName, String doorState)
    {
        state = "open";
        name = doorName;
    }

    /**
     * @post    The door will be set to "closed"
     */
    public void close()
    {
        this.state = "closed";
    }
    
    /**
     * @return  returns the name of the door object
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * @return  returns the state of the door object
     */
    public String getState()
    {
        return this.state;
    }
    
    /**
     * @post    the door's name will  be changed
     * @param   newName     string for what the new name of the door should be
     */
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    /**
     * @post    the door's state will  be changed
     * @param   newState     string for what the new state of the door should be
     */
    public void setState(String newState)
    {
        this.state = newState;
    }



}
