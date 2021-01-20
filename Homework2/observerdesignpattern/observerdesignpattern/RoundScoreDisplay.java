package observerdesignpattern;

/**
 * Is an observer that has a subject it observes and integers total strokes and total par which it observes
 * It also has the ability to show the current score of its subject
 * @author @SllimRevilo
 */
public class RoundScoreDisplay implements Observer{
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * given a golfer it assigns it to itself and then has the golfer register its new observer
     * sets the par and strokes to 0
     * @param golfer the golfer being observed
     */
    public RoundScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        this.golfer.registerObserver(this);
        this.strokesTotal = 0;
        this.parTotal = 0;
    }

    /**
     * updates the total strokes and par and then displays the current score
     * @param strokes the number of strokes the golfer took
     * @param par the number of strokes the golfer should have took 
     */
    public void update(int strokes, int par)
    {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }

    /**
     * displays the total score as well as how many strokes over or under par
     */
    private void displayRoundScore() {
        System.out.println("\nCurrent Round Stats\nPar: " + this.parTotal + "\nStrokes: " + this.strokesTotal);
        if (this.strokesTotal > this.parTotal) {
            System.out.println(this.strokesTotal - this.parTotal + " over par");
        } else if (this.strokesTotal < this.parTotal) {
            System.out.println(this.parTotal - this.strokesTotal + " under par");
        }
        else
        {
            System.out.println("Made par");
        }
    }
}
