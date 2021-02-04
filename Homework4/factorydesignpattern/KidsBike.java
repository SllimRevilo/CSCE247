package factorydesignpattern;

/**
 * sets defaults of a kids bike
 * @author @sllimrevilo
 */
public class KidsBike extends Bike
{
    /**
     * makes a kids bike
     */
    KidsBike()
    {
        this.name = "kids bike";
        this.numWheels = 2;
        this.hasPeddals = true;
        this.hasTrainingWheels = true;
        this.price = 80.99;
    }
}