package csce247.singelton;

import java.util.HashMap;

public class Library {
    private HashMap<String, Integer> books;
    private static Library library;

    private Library()
    {
        books = new HashMap<String, Integer>();
        System.out.println("Creating our Library. Time to begin reading");
    }

    public static Library getInstance()
    {
        library = new Library();
        return library;
    }

    public boolean checkoutBook(String bookName)
    {
        if(books.containsKey(bookName))
        {
            books.get(bookName);
            System.out.println(bookName + " was successfully checked out");
            return true;
        }
        else
        {
            System.out.println("Sorry. " + bookName + " is not in stock");
            return false;
        }
    }

    public void checkInBook(String bookName, int numToAdd)
    {
        
        if(books.containsKey(bookName))
        {
            System.out.print("A new copy of ");
            books.put(bookName, books.get(bookName)+numToAdd);
        }
        else
        {
            books.put(bookName, numToAdd);
        }
        System.out.println(bookName + " was added to the library");
        return;
    }

    public void displayBooks()
    {
        System.out.println("Inventory: ");
        for(String book : books.keySet())
        {
            System.out.println(" - " + book + ", copies: " + books.get(book));
        }
    }
}
