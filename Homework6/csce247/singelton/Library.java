package csce247.singelton;

import java.util.HashMap;

/**
 * @author @SllimRevilo
 * a library creates a hash map then stores, takes out, and displays its contents
 */
public class Library {
    private HashMap<String, Integer> books;
    private static Library library;

    /**
     * sets books to a new hashmap and prints prompt
     */
    private Library()
    {
        books = new HashMap<String, Integer>();
        System.out.println("Creating our Library. Time to begin reading");
    }

    /**
     * creates the library and returns it
     * @return the library
     */
    public static Library getInstance()
    {
        library = new Library();
        return library;
    }

    /**
     * checks out a book if there is one available
     * displays it checked out or not
     * @param bookName name of book
     * @return if there is a book or not t/f
     */
    public boolean checkoutBook(String bookName)
    {
        // if has book in library
        if(books.containsKey(bookName))
        {
            // if has book in stock
            if(books.get(bookName) <= 0)
            {
                System.out.println("Sorry. " + bookName + " is not in stock");
                return false;
            }
            // reduce amount in stock
            books.put(bookName, books.get(bookName)-1);
            System.out.println(bookName + " was successfully checked out");
            return true;
        }
        // if book not in library
        else
        {
            System.out.println("Sorry. " + bookName + " is not in stock");
            return false;
        }
    }

    /**
     * Adds books to the library
     * displays it checked in or new copy checked in
     * @param bookName name of the book
     * @param numToAdd number of the book to add
     */
    public void checkInBook(String bookName, int numToAdd)
    {
        // if exists in library
        if(books.containsKey(bookName))
        {
            System.out.print("A new copy of ");
            // add amount in library and the new ones
            books.put(bookName, books.get(bookName)+numToAdd);
        }
        // not in library
        else
        {
            // just add to library
            books.put(bookName, numToAdd);
        }
        System.out.println(bookName + " was added to the library");
        return;
    }

    /**
     * displays books and their quantities in the library
     */
    public void displayBooks()
    {
        System.out.println("Inventory: ");
        for(String book : books.keySet())
        {
            System.out.println(" - " + book + ", copies: " + books.get(book));
        }
    }
}