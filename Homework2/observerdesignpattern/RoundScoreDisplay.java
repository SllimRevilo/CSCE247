package observerdesignpattern;

import java.util.Observer;

public class RoundScoreDisplay implements Observer{
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        this.strokes = 0;
        this.par = 0;
    }

    public void update(int strokes, int par)
    {
        this.strokes += strokes;
        this.par += par;
        displayCurrentScore();
    }

    private void displayRoundScore()
    {
        System.out.println("Current Hole Stats\nPar: " + this.par + "\nStrokes: " + this.strokes);
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
