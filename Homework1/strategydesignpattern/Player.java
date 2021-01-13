package strategydesignpattern;

public abstract class Player {
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    Player(String name)
    {
        this.name = name;
    }

    public abstract void setDefenceBehavior();

    public abstract void setOffenseBehavior();

    public String play()
    {

    }

    public void turnover()
    {
        
    }
}