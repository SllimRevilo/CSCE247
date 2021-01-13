package strategydesignpattern;

import java.util.Random;

public class ReceiveBehavior implements OffenceBehavior {
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

        return "runs a " + ret;
    }
}