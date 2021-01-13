package strategydesignpattern;

import java.util.Random;

public class RunBehavior implements OffenceBehavior {
    public String play()
    {
        String ret = "";
        int numChoices = 4;
        Random rand = new Random();
        int choice = rand.nextInt(numChoices);

        if(choice == 0)
        {
            ret = "drive (up the gut)";
        }
        else if(choice == 1)
        {
            ret = "draw";
        }
        else if(choice == 2)
        {
            ret = "pitch";
        }
        else if(choice == 3)
        {
            ret = "reverse";
        }
        else
        {
            // There is an error. This should not happen.
            ret = "error";
        }

        return "runs a " + ret;
    }
}