package iteratordesignpattern;

/**
 * @author @SllimRevilo
 * An item is a thing with a name price and desription
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * makes an item
     * @param title the title
     * @param description the description
     * @param price thr price
     */
    public Item(String title, String description, double price)
    {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * makes a string of the elements of the items
     * @return the string of elements
     */
    public String toString()
    {
        return "\n***** " + this.title + " *****\n" + this.description + "\nPrice: $" + this.price;
    }

    /**
     * the price of the item
     * @return the price of the item
     */
    public double getPrice()
    {
        return this.price;
    }

    /**
     * prints the toString
     */
    public void print()
    {
        System.out.println(this.toString());
    }
}
