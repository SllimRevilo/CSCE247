package CSCE247.Homework8;

/**
 * Implements functionality for a CD
 * @author @SllimRevilo
 */
public interface DigitalAlbum {
    public String playFromBeginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
