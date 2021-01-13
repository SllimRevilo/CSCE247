package strategydesignpattern;

import java.util.Random;

public class Lineman extends Player {

    Lineman(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenseBehavior();
	}

	@Override
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

	@Override
    public void setOffenseBehavior()
    {
        OBlockBehavior oBlockBehavior = new OBlockBehavior();
		this.offenceBehavior = oBlockBehavior;
	}

}
