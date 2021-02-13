package iteratordesignpattern;

import java.util.Iterator;

/**
 * @author @SllimRevilo
 * an iterator for the wishlist
 */
public class WishListIterator implements Iterator {
    private Item[] items;
    private int position = 0;

    /**
     * sets an items array to the items
     * @param items an items array 
     */
    public WishListIterator(Item[] items)
    {
        this.items = items;
    }

    /**
     * determines if there are more items in the array
     * @return if true or not
     */
    public boolean hasNext() {
		if(position >= items.length || items[position] == null)
        {
			return false;
		}
        else
        {
			return true;
		}
	}

    /**
     * if there is another item it returns it
     * o.w. it returns null
     * @return the next item if there is one
     */
    public Item next()
    {
        if(this.hasNext())
        {
            Item nextItem = this.items[position];
            position++;
            return nextItem;
        }
        else
        {
            return null;
        }
    }

}
