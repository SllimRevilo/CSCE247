package strategydesignpattern;

/**
 * A player is an abstract class of 1 of 3 different types of football players.
 * They have a name, an offence behavior, a defense behavior, and a boolean to determine if on defense
 * @author Oliver Mills
 */
public abstract class Player {
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    /**
     * creates a player given a name and then sets them to be on offence
     * @param name the name of the player
     */
    Player(String name)
    {
        this.name = name;
        defence = false;
    }

    /**
     * sets a defencive behavior
     */
    public abstract void setDefenceBehavior();

    /**
     * sets an offencive behavior
     */
    public abstract void setOffenseBehavior();

    /**
     * It shows the play the player is making
     * @return returns the offencive or defencive play or not playing if there is none 
     */
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

    /**
     * Changes the player from offence to defence or defence to offence
     */
    public void turnover()
    {
        defence  = !defence;
    }
}
