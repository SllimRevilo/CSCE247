package observerdesignpattern;

/**
 * Is an observer that has a subject it observes and integers strokes and par which it observes
 * It also has the ability to show the current score of its subject
 * @author @SllimRevilo
 */
public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * given a golfer it assigns it to itself and then has the golfer register its new observer
     * sets the par and strokes to 0
     * @param golfer the golfer being observed
     */
    public HoleScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        this.golfer.registerObserver(this);
        this.strokes = 0;
        this.par = 0;
    }

    /**
     * updates the strokes and par and then displays the current score
     * @param strokes the number of strokes the golfer took
     * @param par the number of strokes the golfer should have took 
     */
    public void update(int strokes, int par)
    {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * displays the current score as well as how many strokes over or under par
     */
    private void displayCurrentScore()
    {
        System.out.println("\nCurrent Hole Stats\nPar: " + this.par + "\nStrokes: " + this.strokes);
        if(this.strokes > this.par)
        {
            System.out.println(this.strokes - this.par + " over par");
        }
        else if(this.strokes < this.par)
        {
            System.out.println(this.par - this.strokes + " under par");
        }
        else
        {
            System.out.println("Made par");
        }
    }
}
