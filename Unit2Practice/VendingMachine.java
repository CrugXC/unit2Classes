

/**
 * Vending Machine filled with cans of soda. A token can be inserted to
 * recieve a can of soda. 
 * @author Jay Rixie
 * @version 9/15/15
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    private int tokens;

    /**
     * Creates a vending machine object allowing you to pass in the desired
     * amount of starting cans and sets tokens to 0
     */
    public VendingMachine(int startingCans)
    {
        cans = startingCans;
        tokens = 0;
        
    }

    /**
     * Adds cans to the vending machine
     *
     * @pre     Cannot pass in negative value 
     * @post    Will add to the current number of cans in the machine
     * @param    numberOfCans    the amount of cans you want to add
     */
    public void addCans(int numberOfCans)
    {
        cans += numberOfCans;
    }
    
    /**
     * returns the number of cans in the vending machine
     * @return  returns the number of cans currently in the vending machine
     */
    public int getCans()
    {
        return cans;
    }
    
    /**
     * Uses one token, adding that to the machine, to buy one drink, 
     * subtracting that from the machine
     *
     * @pre     machine must have drinks
     * @post    will add one token to the object, and subtract one drink
     */
    public void buyDrink()
    {
        tokens += 1;
        cans -= 1;
    }

    /**
     * Returns the number of tokens.
     * @return  returns the number of tokens
     */
    public int getTokens()
    {
        return tokens;
    }



}
