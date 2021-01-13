package strategydesignpattern;

public abstract class Player {
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    Player(String name)
    {
        this.name = name;
        defence = true;
    }

    public abstract void setDefenceBehavior();

    public abstract void setOffenseBehavior();

    public String play()
    {
        if(defence)
        {
            return defenceBehavior.play();
        }
        else
        {
            return offenceBehavior.play();
        }
    }

    public void turnover()
    {
        defence  = !defence;
    }
}
