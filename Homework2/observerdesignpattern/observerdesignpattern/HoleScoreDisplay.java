package observerdesignpattern;

public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        this.strokes = 0;
        this.par = 0;
    }

    public void update(int strokes, int par)
    {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    private void displayCurrentScore()
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
