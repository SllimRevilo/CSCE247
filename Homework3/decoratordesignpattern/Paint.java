package CSCE247.Homework3.decoratordesignpattern;

public class Paint extends VehicleDecorator{
    private Vehicle vehicle;

    public Paint(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public String toString()
    {
        return this.vehicle.toString() + ", fancy paint";
    }

    public double getCost()
    {
        return this.vehicle.getCost() + 150;
    }
}
