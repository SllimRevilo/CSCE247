package factorydesignpattern;

/**
 * A bike has a name, price, number of wheels, pedals or not, and training wheels or not
 * you can create the bike and then display its attributes
 * @author @sllimrevilo
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;

    /**
     * displays the bike's attributes
     */
    public void createBike()
    {
        this.createFrame();
        this.addWheels();
        this.addPedals();
        this.getPrice();
    }

    /**
     * displays type of bike
     */
    private void createFrame()
    {
        System.out.println("Assembling " + this.name + " frame");
    }

    /**
     * displays bike's wheels if applicable
     */
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

    /**
     * displays pedals if applicable
     */
    private void addPedals()
    {
        if(hasPeddals)
        {
            System.out.println("Adding pedals");
        }
    }

    /**
     * displays the price
     */
    public void getPrice()
    {
        System.out.println("Price: $" + this.price);
    }
}
