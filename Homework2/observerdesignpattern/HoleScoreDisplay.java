package observerdesignpattern;

import java.util.Observer;

import javax.security.auth.Subject;

public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer)
    {

    }

    public void update(int strokes, int par)
    {

    }

    private void displayCurrentScore()
    {

    }
}
