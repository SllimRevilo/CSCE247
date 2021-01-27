package CSCE247.Homework3.decoratordesignpattern;

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
