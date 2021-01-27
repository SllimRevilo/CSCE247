package CSCE247.Homework3.decoratordesignpattern;

/**
 * Sound system accepts a vehicle which it then modifies the cost and description
 * It takes the vehicle's cost and adding its own cost to it with getCost
 * It takes the vehicle's description and appends it with toString
 * @author @SllimRevilo
 */
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
