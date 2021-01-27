package CSCE247.Homework3.decoratordesignpattern;

/**
 * A sedan is a type of vehicle which sets its description to its name
 * A sedan returns its cost in getCost
 * @author @SllimRevilo
 */
public class Sedan extends Vehicle {
    public Sedan()
    {
        this.description = "Sedan";
    }

    public double getCost()
    {
        return 20000;
    }
}
