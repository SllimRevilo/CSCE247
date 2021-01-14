package strategydesignpattern;

/**
 * Makes an Offence behavior for the OBlock
 * @author Oliver Mills
 */
public class OBlockBehavior implements OffenceBehavior {

    /**
     * @return returns a string block defenders
     */
    public String play()
    {
        return "block defenders";
    }
}