package strategydesignpattern;

import java.util.Random;

/**
 * block behavior is a defence behavior
 * @author Oliver Mills
 */
public class BlockBehavior implements DefenceBehavior {

    /**
     * returns 1 of 4 random strings for the behavior
     */
    public String play()
    {
        String ret = "";
        int numChoices = 4;
        Random rand = new Random();
        int choice = rand.nextInt(numChoices);

        if(choice == 0)
        {
            ret = "kick";
        }
        else if(choice == 1)
        {
            ret = "punt";
        }
        else if(choice == 2)
        {
            ret = "pass";
        }
        else if(choice == 3)
        {
            ret = "catch";
        }
        else
        {
            // There is an error. This should not happen.
            ret = "error";
        }

        return "block a " + ret;
    }
}