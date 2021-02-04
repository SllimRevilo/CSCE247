package factorydesignpattern;

/**
 * sets defaults of a tricycle
 * @author @sllimrevilo
 */
public class Tricycle extends Bike {
    /**
     * makes a tricycle
     */
    Tricycle()
    {
        this.name = "tricycle";
        this.numWheels = 3;
        this.hasPeddals = true;
        this.price = 54.95;
    }
}
