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
        this.getPrice();
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

    public void getPrice()
    {
        System.out.println("Price: $" + this.price);
    }
}
