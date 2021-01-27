package CSCE247.Homework3.decoratordesignpattern;

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
