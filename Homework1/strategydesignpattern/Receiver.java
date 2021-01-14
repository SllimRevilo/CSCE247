package strategydesignpattern;

/**
 * A receiver is a player who has a name an offencive behavior and a defencive behavior along with everything else in the player class not specified
 * @author Oliver Mills
 */
public class Receiver extends Player{

    /**
     * Creates a receiver with correct behaviors
     * @param name the name of the player
     */
    Receiver(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenseBehavior();
    }

    /**
     * sets the defencive behavior to null
     */
    public void setDefenceBehavior()
    {
        this.defenceBehavior = null;
    }

    /**
     * sets the offencive behavior to the receive behavior
     */
    public void setOffenseBehavior()
    {
        ReceiveBehavior receiveBehavior = new ReceiveBehavior();
        this.offenceBehavior = receiveBehavior;
    }

}
