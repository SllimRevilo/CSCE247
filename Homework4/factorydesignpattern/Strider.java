package factorydesignpattern;

/**
 * sets defaults of a strider
 * @author @sllimrevilo
 */
public class Strider extends Bike{
    /**
     * makes a strider
     */
    Strider() 
    {
        this.name = "strider";
        this.numWheels = 2;
        this.hasPeddals = false;
        this.price = 65.99;
    }
}
