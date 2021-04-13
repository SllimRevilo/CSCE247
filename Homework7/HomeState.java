package CSCE247.Homework7;

public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv)
    {
        this.tv = tv;
    }
    public void pressHomeButton()
    {
        System.out.println("TV is already on the home screen");
    }
    public void pressNetflixButton()
    {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }
    public void pressHuluButton()
    {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }
    public void pressMovieButton()
    {
        System.out.println("You must pick an app to show movies.");
    }
    public void pressTVButton()
    {
        System.out.println("You must pick an app to show tv shows.");
    }
}
