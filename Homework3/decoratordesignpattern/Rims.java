package CSCE247.Homework3.decoratordesignpattern;

public class Rims extends VehicleDecorator{
    private Vehicle vehicle;

    public Rims(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public String toString()
    {
        return this.vehicle.toString() + ", cool rims";
    }

    public double getCost()
    {
        return this.vehicle.getCost() + 200;
    }
}
