
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class JukeBox1 {
    ArrayList<Song> songList = new ArrayList<Song>();
    int val;

    public static void main(String[] args) {
        new JukeBox1().go();
    }

    // inner class
    class ArtistCompare implements Comparator<Song> {
        public int compare (Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }
    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        TreeSet<Song> songSet = new TreeSet<Song>();  // calling the no-arg constructor on TreeSet so it will use Song object's compareTo()
        songSet.addAll(songList);
    }

    void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line=reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {ex.printStackTrace();}
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
