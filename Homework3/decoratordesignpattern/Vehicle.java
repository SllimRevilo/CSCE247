package CSCE247.Homework3.decoratordesignpattern;

public abstract class Vehicle {
    protected String description;

    public String toString()
    {
        return this.description;
    }
    
    public abstract double getCost();
}
