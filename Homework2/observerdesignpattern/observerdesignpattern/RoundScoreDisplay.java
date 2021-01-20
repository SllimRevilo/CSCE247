package observerdesignpattern;

public class RoundScoreDisplay implements Observer{
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        this.golfer.registerObserver(this);
        this.strokesTotal = 0;
        this.parTotal = 0;
    }

    public void update(int strokes, int par)
    {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }

    private void displayRoundScore() {
        System.out.println("Current Hole Stats\nPar: " + this.parTotal + "\nStrokes: " + this.strokesTotal);
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
