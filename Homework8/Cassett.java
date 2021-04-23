package CSCE247.Homework8;
import java.util.ArrayList;

/**
 * implements all the functions of an analog album in order to use a cassette tape
 * @author @SllimRevilo
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Makes a cassette with 5 songs and sets the index to 0
     * @param song1 song name
     * @param song2 song name
     * @param song3 song name
     * @param song4 song name
     * @param song5 song name
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5)
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
     * plays the current song
     * @return current song or that youre at the end of the tape
     */
    public String play()
    {
        if(currentIndex >= songs.size())
        {
            return "At the end of the cassette you need to rewind";
        }
        else
        {
            return "Playing song " + currentIndex + ": " + songs.get(currentIndex);
        }
    }

    /**
     * rewinds the tape one
     * @return previous song or that youre at the start of the tape
     */
    public String rewind()
    {
        if(currentIndex <= 0)
        {
            return "Fully Rewound";
        }
        else
        {
            --currentIndex;
            return "Rewinding to song " + songs.get(currentIndex);
        }
    }

    /**
     * fast forwards the tape one song
     * @return current song, at the end of the tape, or just reached end
     */
    public String ffwd()
    {
        if(currentIndex >= songs.size())
        {
            return "At the end of the cassette you need to rewind";
        }
        else
        {
            ++currentIndex;
            if(currentIndex == songs.size())
            {
                return "Forwarded to the end of the cassette";
            }
            else
            {
                return "Forwarding to song " + songs.get(currentIndex);
            }
        }
    }

    /**
     * pauses the tape
     * @return pausing
     */
    public String pause()
    {
        return "Pausing...";
    }

    /**
     * stops and ejectst the tape
     * @return stopping and ejecting
     */
    public String stopEject()
    {
        return "Stopping cassette and ejecting";
    }
}
