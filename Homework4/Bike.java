package factorydesignpattern;

public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;

    public void createBike()
    {
        this.createFrame();
        this.addWheels();
        this.addPedals();
    }

    private void createFrame()
    {
        System.out.println("Assembling " + this.name + " frame");
    }

    private void addWheels()
    {
        if(this.numWheels > 0)
        {
            System.out.println("Adding " + this.numWheels + " wheels");
            if(hasTrainingWheels)
            {
                System.out.println("Adding training wheels");
            }
        }
    }

    private void addPedals()
    {
        if(hasPeddals)
        {
            System.out.println("Adding pedals");
        }
    }

    public double getPrice()
    {
        return this.price;
    }
}
