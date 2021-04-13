package CSCE247.Homework7;

import java.util.ArrayList;

/**
 * The home state of a tv
 * @author sllimrevilo
 */
public class HuluState implements State {
    private TV tv;
    private ArrayList<String> movies;
    private ArrayList<String> tvShows;

    /**
     * makes a hulu state
     * @param tv tv that is being used
     */
    public HuluState(TV tv)
    {
        this.tv = tv;
        movies = new ArrayList<String>();
        movies.add("Pokemon 2000");
        movies.add("Star Wars: A New Hope");
        movies.add("DeadPool");
        movies.add("Indiana Jones and the Last Crusade");
        movies.add("Sherlock Holmes");

        tvShows = new ArrayList<String>();
        tvShows.add("One Piece");
        tvShows.add("Attack on Titan");
        tvShows.add("Brooklyn 99");
        tvShows.add("The Way of the Househusband");
        tvShows.add("Naruto");

    }
    /**
     * Changes state and says which state its changing to
     */
    public void pressHomeButton()
    {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }
    /**
     * Changes state and says which state its changing to
     */
    public void pressNetflixButton()
    {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }
    /**
     * Prints already is in the state
     */
    public void pressHuluButton()
    {
        System.out.println("We are already in Hulu\n");
    }
    /**
     * shows the movies
     */
    public void pressMovieButton()
    {
        printMovies();
    }
    /**
     * shows the tv shows
     */
    public void pressTVButton()
    {
        printTVShows();
    }

    /**
     * prints out all tv shows
     */
    private void printTVShows()
    {
        System.out.println("Netflix TV Shows:");
        tvShows.forEach(show -> System.out.println(" - " + show));
        System.out.println();
    }

    /**
     * prints out all movies
     */
    private void printMovies()
    {
        System.out.println("Netflix Movies:");
        movies.forEach(movie -> System.out.println(" - " + movie));
        System.out.println();
    }
}