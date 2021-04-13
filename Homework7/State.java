package CSCE247.Homework7;

/**
 * A state allows a tv to press a button to change to one of three states
 * or to press a button to show all movies or tv shows in state 
 *  @author sllimrevilo
 */
public interface State {
    public void pressHomeButton();
    public void pressNetflixButton();
    public void pressHuluButton();
    public void pressMovieButton();
    public void pressTVButton();
}
