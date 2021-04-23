import java.util.ArrayList;
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
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
    public String play()
    {
        if(currentIndex >= songs.size())
        {
            return "At the end of the cassette you need to rewind";
        }
        else
        {
            return "Playing song " + currentIndex + "; " + songs.get(currentIndex);
        }
    }

    public String
}
