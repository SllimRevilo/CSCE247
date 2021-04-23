package CSCE247.Homework8;
import java.util.ArrayList;
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Makes a CD with 5 songs and sets the index to 0
     * @param song1 song name
     * @param song2 song name
     * @param song3 song name
     * @param song4 song name
     * @param song5 song name
     */
    public CD(String song1, String song2, String song3, String song4, String song5)
    {
        songs = new ArrayList<String>();
        currentIndex = 0;
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * plays the first song and moves index forward 1 after
     * @return song 1 and its title
     */
    public String playFromBeginning()
    {
        ++currentIndex;
        return "Playing song 1 : " + songs.get(0);
    }

    /**
     * plays entered song number
     * @param num track number to play
     * @return song being played or invalid song
     */
    public String playSong(int num)
    {
        if(num >=0 && num < songs.size())
        {
            return "Playing " + num + ": " + songs.get(num);
        }
        else
        {
            return "Not a valid song number";
        }
    }

    /**
     * goes to next song or back to start if at end and plays song
     * @return next song
     */
    public String nextSong()
    {
        if(currentIndex >= songs.size())
        {
            currentIndex =0;
        }
        else
        {
            ++currentIndex;
        }
        return "Playing " + currentIndex + ": " + songs.get(currentIndex);
    }

    /**
     * goes to previous song or stays if at start
     * @return prev song
     */
    public String prevSong()
    {
        if(currentIndex > 0)
        {
            --currentIndex;
        }

        return "Skipping back and playing " + currentIndex + ": " + songs.get(currentIndex);
    }

    /**
     * pauses the CD
     * @return pausing
     */
    public String pause()
    {
        return "Pausing...";
    }

    /**
     * stops and ejectst the CD
     * @return stopping and ejecting
     */
    public String stop()
    {
        return "Stopping CD and ejecting";
    }

    
    
}
