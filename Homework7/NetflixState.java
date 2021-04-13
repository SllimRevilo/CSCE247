package CSCE247.Homework7;

public class NetflixState implements State {
    private TV tv;

    public NetflixState(TV tv)
    {
        this.tv = tv;
    }
    public void pressHomeButton()
    {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }
    public void pressNetflixButton()
    {
        System.out.println("We are already in Netflix");
    }
    public void pressHuluButton()
    {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }
    public void pressMovieButton()
    {

    }
    public void pressTVButton()
    {

    }
}
