package observerdesignpattern;

import java.util.ArrayList;
import java.util.Observer;

public class Golfer implements Subject{
    private ArrayList observers;
    private String name;

    Golfer(String name)
    {
        this.name = name;
    }

    public void registerObserver(Observer observer)
    {

    }

    public void removeObserver(Observer observer)
    {

    }

    public void notifyObservers(Observer observer)
    {

    }

    public void enterScore(int strokes, int par)
    {

    }

    public String getName()
    {
        return this.name;
    }
}
