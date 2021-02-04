package factorydesignpattern;

public class BikeStore {
    public Bike orderBike(String type)
	{
        return createBike(type);
	}

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