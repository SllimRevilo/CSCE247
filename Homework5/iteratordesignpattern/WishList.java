package iteratordesignpattern;

import java.util.Iterator;

/**
 * @author @SllimRevilo
 * Wishlist is the list of items you want to keep
 */
public class WishList {
    private String name;
    private Item[] items;
    private int count = 0;

    /**
     * sets the name and inits the items to an array with 5 items
     * @param name name of the wishlist
     */
    public WishList(String name)
    {
        this.name = name;
        items = new Item[5];
    }

    /**
     * creates an item and adds it to the list and increments the list
     * if the list is full it doubles the size
     * @param title name of item
     * @param description description of the item
     * @param price price of the item
     */
    public void addItem(String title, String description, double price)
    {
        if(items.length >= count)
        {
            this.items = growArray(this.items);
        }
        this.items[count] = new Item(title, description, price);
        count++;
    }

    /**
     * makes an iterator
     * @return a wishlistlIterator
     */
    public WishListIterator createIterator()
    {
        return new WishListIterator(items);
    }

    /**
     * gets cost of all items 
     * @return price of all items
     */
    public double getTotalCost()
    {
        double price = 0;
        for(int i = 0; i < count; i++)
        {
            price += items[i].getPrice();
        }
        return price;
    }

    /**
     * doubles size of the list
     * @param items the original array
     * @return the bigger array
     */
    private Item[] growArray(Item[] items)
    {
        int size = items.length;
        Item[] newArray = new Item[size*2];
        for(int i = 0; i < count; i++)
        {
            newArray[i] = items[i];
        }
        return newArray;
    }
}
