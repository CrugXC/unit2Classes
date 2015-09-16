

/**
 * The class Car has a certain fuel efficiency and a certain amount of fuel in the gas tank. A Car may be driven
 * a specified distance which reduces the amount of gas in the tank.
 * 
 * @author Rixie 
 * @version 9/10/15
 */
public class Car
{
    /** Specifies the fuel efficiency of the Car in units of miles per gallon (mpg)*/
    private double fuelEfficiency;
    
    /** Specifies the amount of fuel in gas tank in gallons */
    private double currentFuel;

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency of the car.
     */
    public Car(double fuelEfficiencyInsert)
    {
        currentFuel = 0.0;
        fuelEfficiency = fuelEfficiencyInsert;
        
        
       
    }

    /**
     * Simulates driving the car the specified distance in miles and reduces the amount of fuel in the gas tank based on the fuel efficiency.
     *
     * @pre        The specified distance cannot consume more than the fuel available in the tank.
     * @param    distance   the specified distance to drive in miles
     */
    public void drive( double distance)
    {
        currentFuel -= (distance / fuelEfficiency);
    }
    
    /**
     * Returns the number of gallons of gas in the car's tank.
     * @return  Returns the number of gallons of gas in the car's tank.
     */
    public double getGasInTank()
    {
        return currentFuel;
    }

    /**
     * Increments the fuel stored in the car's tank by the specified amount in gallons.
     *
     * @pre     Passed value must be positive
     * @param   addedGas    Amount of gallons of gas to increment the fuel in the car's tank.
     * @return  description of the return value
     */
    public void addGas(double addedGas)
    {
        currentFuel += addedGas;
    }

}
