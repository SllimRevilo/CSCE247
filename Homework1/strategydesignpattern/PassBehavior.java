package strategydesignpattern;

import java.util.Random;

/**
 * Pass behavior is an offencive behavior 
 * @author Oliver Mills
 */
public class PassBehavior implements OffenceBehavior {

    /**
     * returns 1 of 4 random strings for the play
     */
    public String play()
    {
        String ret = "";
        int numChoices = 5;
        Random rand = new Random();
        int choice = rand.nextInt(numChoices);

        if(choice == 0)
        {
            ret = "slant route";
        }
        else if(choice == 1)
        {
            ret = "out route";
        }
        else if(choice == 2)
        {
            ret = "seem route";
        }
        else if(choice == 3)
        {
            ret = "screen pass";
        }
        else if(choice == 4)
        {
            ret = "hail mary";
        }
        else
        {
            // There is an error. This should not happen.
            ret = "error";
        }

        return "throws a " + ret;
    }
}