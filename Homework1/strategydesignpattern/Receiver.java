package strategydesignpattern;

public class Receiver extends Player{

    Receiver(String name)
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
        ReceiveBehavior receiveBehavior = new ReceiveBehavior();
        this.offenceBehavior = receiveBehavior;
    }

}
