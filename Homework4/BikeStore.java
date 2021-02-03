package factorydesignpattern;

public class BikeStore {

	public void runBikeStore() {
		BikeStore bikeStore = new BikeStore();
		
		Bike tricycle = bikeStore.orderBike("tricycle");
		System.out.println("\n-----------------------------------\n");
		
		Bike strider = bikeStore.orderBike("strider");
		System.out.println("\n-----------------------------------\n");
		
		Bike kidsBike = bikeStore.orderBike("kids bike");
		System.out.println("\n-----------------------------------\n");
	}
	public static void main(String[] args) {
		BikeStoreDriver driver = new BikeStoreDriver();
		driver.runBikeStore();
	}

	public Bike orderBike(String type)
	{

	}

	private Bike createBike(String type)
	{
		
	}
}
