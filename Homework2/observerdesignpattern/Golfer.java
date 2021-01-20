package observerdesignpattern;

import java.util.ArrayList;

public class Golfer implements Subject{
    private ArrayList observers;
    private String name;

    Golfer(String name)
    {
        this.name = name;
    }

    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyObservers(int strokes, int par)
    {
        for(Observer i: observers)
        {
            i.update(strokes, par);
        }
    }

    public void enterScore(int strokes, int par)
    {
        for(Observer i: observers)
        {
            i.update(strokes, par);
        }
    }

    public String getName()
    {
        return this.name;
    }
}
