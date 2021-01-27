package CSCE247.Homework3.decoratordesignpattern;

/**
 * A compact is a type of vehicle which sets its description to its name
 * A compact returns its cost in getCost
 * @author @SllimRevilo
 */
public class Compact extends Vehicle{
    public Compact()
    {
        this.description = "Compact";
    }

    public double getCost()
    {
        return 15000;
    }
}
