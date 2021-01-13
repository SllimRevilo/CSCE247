package strategydesignpattern;

import java.util.Random;

public class QuarterBack extends Player {
    QuarterBack(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenseBehavior();
    }

    @Override
    public void setDefenceBehavior()
    {
        this.defenceBehavior = null;
    }

    @Override
    public void setOffenseBehavior()
    {
        int numChoices = 2;
        Random rand = new Random();
        int choice = rand.nextInt(numChoices);

        if(choice == 0)
        {
            RunBehavior runBehavior = new RunBehavior();
            this.offenceBehavior = runBehavior;
        }
        else if (choice == 1)
        {
            PassBehavior passBehavior = new PassBehavior();
            this.offenceBehavior = passBehavior;
        }
        else
        {
            // There is an error. This should not happen.
            this.offenceBehavior = null; 
        }
    }

}
