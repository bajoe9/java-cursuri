package Collections;

public class Song implements Comparable<Song> {
   protected String title;
   protected String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public int compareTo(Song o) {
        return this.artist.compareTo(o.artist);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
