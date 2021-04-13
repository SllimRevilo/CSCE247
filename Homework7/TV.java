package CSCE247.Homework7;

/**
 * A tv can press one of 5 buttons and be in one of three states
 * @author sllimrevilo
 */
public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;

    private State state;

    /**
     * makes a tv with 3 possible states and a current state set to home
     */
    public TV()
    {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);

        setState(homeState);
    }

    /**
     * uses home button for current state
     */
    public void pressHomeButton()
    {
        state.pressHomeButton();
    }
    /**
     * uses netflix button for current state
     */
    public void pressNetflixButton()
    {
        state.pressNetflixButton();
    }
    /**
     * uses hulu button for current state
     */
    public void pressHuluButton()
    {
        state.pressHuluButton();
    }
    /**
     * uses movie button for current state
     */
    public void pressMovieButton()
    {
        state.pressMovieButton();
    }
    /**
     * uses tv show button for current state
     */
    public void pressTVButton()
    {
        state.pressTVButton();
    }
    /**
     * sets the current state
     */
    public void setState(State state)
    {
        this.state = state;
    }

    /**
     * gets home state
     * @return home state
     */
    public State getHomeState()
    {
        return homeState;
    }

    /**
     * gets netflix state
     * @return netflix state
     */
    public State getNetflixState()
    {
        return netflixState;
    }

    /**
     * gets hulu state
     * @return hulu state
     */
    public State getHuluState()
    {
        return huluState;
    }

}
