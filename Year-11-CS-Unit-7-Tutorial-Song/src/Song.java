import java.util.ArrayList;
import java.util.HashSet;

public class Song {
    private String title;
    private String artist;
    private HashSet<String> listeners = new HashSet<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> newListeners) {
        int count = 0;
        for (String listener : newListeners) {
            if (!listeners.contains(listener.toLowerCase())) {
                listeners.add(listener.toLowerCase());
                count++;
            }
        }
        return count;
    }
}
