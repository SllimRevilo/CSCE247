package strategydesignpattern;

/**
 * Strip behavior is a defencive play
 * @author Oliver Mills
 */
public class StripBehavior implements DefenceBehavior {

    /**
     * returns strip a ball from runners hands for the play
     */
    public String play()
    {
        return "Strip a ball from runners hands";
    }
}