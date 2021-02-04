package factorydesignpattern;

public class KidsBike extends Bike
{
    KidsBike()
    {
        this.name = "kids bike";
        this.numWheels = 2;
        this.hasPeddals = true;
        this.hasTrainingWheels = true;
        this.price = 80.99;
    }
}