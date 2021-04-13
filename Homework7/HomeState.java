package CSCE247.Homework7;

/**
 * The home state of a tv
 * @author sllimrevilo
 */
public class HomeState implements State {
    private TV tv;

    /**
     * makes a home state
     * @param tv tv that is being used
     */
    public HomeState(TV tv)
    {
        this.tv = tv;
    }
    /**
     * Prints already is in the state
     */
    public void pressHomeButton()
    {
        System.out.println("TV is already on the home screen\n");
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
     * Changes state and says which state its changing to
     */
    public void pressHuluButton()
    {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }
    /**
     * Displays that you cannot view movies here
     */
    public void pressMovieButton()
    {
        System.out.println("You must pick an app to show movies.\n");
    }
    /**
     * Displays that you cannot view tv shows here
     */
    public void pressTVButton()
    {
        System.out.println("You must pick an app to show tv shows.\n");
    }
}
