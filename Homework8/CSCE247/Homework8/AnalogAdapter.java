package CSCE247.Homework8;

/**
 * Allows a digital album to be used with an analog album
 * @author @SllimRevilo
 */
public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album)
    {
        this.album = album;
    }
    /**
     * plays the current song
     * @return current song or that youre at the end of the tape
     */
    public String play()
    {
        return album.nextSong();
    }

    /**
     * rewinds the tape one
     * @return previous song or that youre at the start of the tape
     */
    public String rewind()
    {
        return album.prevSong();
    }

    /**
     * fast forwards the tape one song
     * @return current song, at the end of the tape, or just reached end
     */
    public String ffwd()
    {
        return album.nextSong();
    }

    /**
     * pauses the tape
     * @return pausing
     */
    public String pause()
    {
        return album.pause();
    }

    /**
     * stops and ejectst the tape
     * @return stopping and ejecting
     */
    public String stopEject()
    {
        return album.stop();
    }
}
