package CSCE247.Homework7;

import java.util.ArrayList;

public class HuluState implements State {
    private TV tv;
    private ArrayList<String> movies;

    public HuluState(TV tv)
    {
        this.tv = tv;
        movies = new ArrayList<String>();
        movies.add
    }
    public void pressHomeButton()
    {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }
    public void pressNetflixButton()
    {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }
    public void pressHuluButton()
    {
        System.out.println("We are already in Hulu");
    }
    public void pressMovieButton()
    {

    }
    public void pressTVButton()
    {

    }
}
