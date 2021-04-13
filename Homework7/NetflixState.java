package CSCE247.Homework7;
import java.util.ArrayList;

/**
 * The netflix state of a tv
 * @author sllimrevilo
 */
public class NetflixState implements State {
    private TV tv;
    private ArrayList<String> movies;
    private ArrayList<String> tvShows;

    /**
     * makes a netflix state
     * @param tv tv that is being used
     */
    public NetflixState(TV tv)
    {
        this.tv = tv;
        movies = new ArrayList<String>();
        movies.add("Pokemon The First Movie");
        movies.add("Star Wars: Attack of the Clones");
        movies.add("DeadPool 2 ");
        movies.add("Indiana Jones and the Raiders of the Lost Arc");
        movies.add("Sherlock Holmes: A Game of Shadows");

        tvShows = new ArrayList<String>();
        tvShows.add("Gurren Lagann");
        tvShows.add("Cowboy Bebop");
        tvShows.add("Space Dandy");
        tvShows.add("Star Wars the Clone Wars");
        tvShows.add("Naruto Shippuden");
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
     * Prints already is in the state
     */
    public void pressNetflixButton()
    {
        System.out.println("We are already in Netflix\n");
    }
    /**
     * Changes state and says which state its changing to
     */
    public void pressHuluButton()
    {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
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
