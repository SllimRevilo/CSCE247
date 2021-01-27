package CSCE247.Homework3.decoratordesignpattern;

/**
 * Rims accepts a vehicle which it then modifies the cost and description
 * It takes the vehicle's cost and adding its own cost to it with getCost
 * It takes the vehicle's description and appends it with toString
 * @author @SllimRevilo
 */
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
