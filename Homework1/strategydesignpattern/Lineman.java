package strategydesignpattern;

import java.util.Random;

/**
 * Creates a Lineman player for the project
 * @author Oliver Mills
 */
public class Lineman extends Player {

    /**
     * Creates a lineman with correct behaviors
     * @param name the name of the player
     */
    Lineman(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenseBehavior();
	}

	/**
     * Randomly chooses between 2 behaviors for the defencive behavior
     */
    public void setDefenceBehavior()
    {
        int numChoices = 2;
        Random rand = new Random();
        int choice = rand.nextInt(numChoices);

        if(choice == 0)
        {
            BlockBehavior blockBehavior = new BlockBehavior();
            this.defenceBehavior = blockBehavior;
        }
        else if(choice == 1)
        {
            StripBehavior stripBehavior = new StripBehavior();
            this.defenceBehavior = stripBehavior;
        }
        else if(choice == 2)
        {
            SackBehavior sackBehavior = new SackBehavior();
            this.defenceBehavior = sackBehavior;
        }
        else
        {
            // There is an error. This should not happen.
            this.defenceBehavior = null;
        }
	}

	/**
     * sets the offencive behavior to the oblock behavior
     */
    public void setOffenseBehavior()
    {
        OBlockBehavior oBlockBehavior = new OBlockBehavior();
		this.offenceBehavior = oBlockBehavior;
	}

}
