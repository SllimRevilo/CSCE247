package observerdesignpattern;

/**
 * A subject can register or delete an observer to themselves and also notify its observers
 * @author @SllimRevilo
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
}