package observerdesignpattern;

import java.util.ArrayList;

/**
 * Golfer is a subject which also has a name and allows you to enter scores
 * @author @SllimRevilo
 */
public class Golfer implements Subject{
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String name;

    /**
     * Constructs a golfer and just updates its name
     * @param name the name of the golfer 
     */
    Golfer(String name)
    {
        this.name = name;
    }

    /**
     * adds an observer to the list of golfer observers
     * @param observer in our case either a HoleScoreDisplay or a RoundScoreDisplay
     */
    public void registerObserver(Observer observer)
    {
        this.observers.add(observer);
    }

    /**
     * removes an observer to the list of golfer observers
     * @param observer in our case either a HoleScoreDisplay or a RoundScoreDisplay
     */
    public void removeObserver(Observer observer)
    {
        this.observers.remove(observer);
    }

    /**
     * updates each observer on the strokes and par
     * @param strokes the number of strokes the golfer took
     * @param par the number of strokes the golfer should have took 
     */
    public void notifyObservers(int strokes, int par)
    {
        for(Observer i: observers)
        {
            i.update(strokes, par);
        }
    }

    /**
     * notifies the observers on the strokes and par
     * @param strokes the number of strokes the golfer took
     * @param par the number of strokes the golfer should have took 
     */
    public void enterScore(int strokes, int par)
    {
       notifyObservers(strokes, par);
    }

    /**
     * returns the name of the golfer
     * @return their name
     */
    public String getName()
    {
        return this.name;
    }
}
