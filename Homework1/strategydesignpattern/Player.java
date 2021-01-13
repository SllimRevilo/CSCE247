package strategydesignpattern;

public abstract class Player {
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    Player(String name)
    {
        this.name = name;
        defence = false;
    }

    public abstract void setDefenceBehavior();

    public abstract void setOffenseBehavior();

    public String play()
    {
        if(defence)
        {
            if(defenceBehavior == null)
            {
                return "not playing";
            }
            else
            {
                return defenceBehavior.play();
            }
        }
        else
        {
            if(offenceBehavior == null)
            {
                return "not playing";
            }
            else
            {
                return offenceBehavior.play();
            }
        }
    }

    public void turnover()
    {
        defence  = !defence;
    }
}
