package strategydesignpattern;

/**
 * Sack behavior is a defencive behavior
 * @author Oliver Mills
 */
public class SackBehavior implements DefenceBehavior {

    /**
     * @return returns the string sack the quarterback for the play
     */
    public String play()
    {
        return "Sack the quarterback";
    }
}