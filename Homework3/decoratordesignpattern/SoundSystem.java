package CSCE247.Homework3.decoratordesignpattern;

public class SoundSystem extends VehicleDecorator{
    private Vehicle vehicle;

    public SoundSystem(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public String toString()
    {
        return this.vehicle.toString() + ", awesome sound";
    }

    public double getCost()
    {
        return this.vehicle.getCost() + 350;
    }
}
