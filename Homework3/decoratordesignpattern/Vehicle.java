package CSCE247.Homework3.decoratordesignpattern;

/**
 * A vehicle has a description which it prints out with its toString
 * All vehicles also have a cost returned in getCost
 * @author @SllimRevilo
 */
public abstract class Vehicle {
    protected String description;

    public String toString()
    {
        return this.description;
    }
    
    public abstract double getCost();
}
