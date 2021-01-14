package strategydesignpattern;

import java.util.Random;

/**
 * Makes a quarterback which is an extension of the player
 * @author Oliver Mills
 */
public class QuarterBack extends Player {
    
    /**
     * Creates a quarterback with correct behaviors
     * @param name the name of the player
     */
    QuarterBack(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenseBehavior();
    }

    /**
     * sets the defence behavior to null
     */
    public void setDefenceBehavior()
    {
        this.defenceBehavior = null;
    }

    /**
     * sets the offence behavior to 1 of 2 random behaviors
     */
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
