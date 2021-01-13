package strategydesignpattern;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
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