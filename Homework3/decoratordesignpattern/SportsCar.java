package CSCE247.Homework3.decoratordesignpattern;

/**
 * A sports car is a type of vehicle which sets its description to its name
 * A sports car returns its cost in getCost
 * @author @SllimRevilo
 */
public class SportsCar extends Vehicle{
    public SportsCar()
    {
        this.description = "Sports Car";
    }

    public double getCost()
    {
        return 30000;
    }
}
