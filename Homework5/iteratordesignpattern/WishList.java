package iteratordesignpattern;

import java.util.Iterator;

public class WishList {
    private String name;
    private Item[] items;
    private int count = 0;

    public WishList(String name)
    {
        this.name = name;
        items = new Item[5];
;    }

    public void addItem(String title, String description, double price)
    {
        if(items.length >= count)
        {
            this.items = growArray(this.items);
        }
        this.items[count] = new Item(title, description, price);
        count++;
    }

    public WishListIterator createIterator()
    {
        return new WishListIterator(items);
    }

    public double getTotalCost()
    {
        double price = 0;
        for(int i = 0; i < count; i++)
        {
            price += items[i].getPrice();
        }
        return price;
    }

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
