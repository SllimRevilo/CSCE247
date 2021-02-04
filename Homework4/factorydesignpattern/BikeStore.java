package factorydesignpattern;

/**
 * this class makes allows the program to pick a bike based on a string
 * @author @sllimrevilo
 */
public class BikeStore {
    /**
     * creates a bike and returns it
     * @param type type of bike
     * @return the bike
     */
    public Bike orderBike(String type)
	{
        return createBike(type);
	}

    /**
     * makes the bike based on the string, calls the text displays
     * @param type type of bike
     * @return the bike
     */
	private Bike createBike(String type)
	{
        Bike ret;
        if(type.equals("tricycle"))
        {
            ret = new Tricycle();
        }
        else if(type.equals("strider"))
        {
            ret = new Strider();
        }
        else if(type.equals("kids bike"))
        {
            ret = new KidsBike();
        }
        else
        {
            System.out.println("invalid bike type");
            return null;
        }
        ret.createBike();
        return ret;
	}
}