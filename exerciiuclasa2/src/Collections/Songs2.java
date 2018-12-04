package Collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
//Hashset trebuie pus unlock de set (si Treeset)

public class Songs2 {
    public static void main(String[] args) {

        TreeSet<Song> songs = new TreeSet<>();

        //ArrayList<Song> songs = new ArrayList<>();
        try

            {
                BufferedReader reader = new BufferedReader(new FileReader("src/Collections/songs.txt"));
                //FileInputStream stream = new FileInputStream( "src/streams/numbers.txt");
                String song;
                while ((song = reader.readLine()) != null) {
                    String title = song.substring(0, song.indexOf('/'));
                    String artist = song.substring(song.indexOf('/') + 1);

                    Song songObject = new Song(title, artist);
                    songs.add(songObject);


                }
                reader.close();
            }
        catch(
            Exception e)

            {
                e.printStackTrace();
            }

            //Collections.sort(songs);
           for(Song song: songs){
               System.out.println(song);
           }


            if("Circles".compareToIgnoreCase("Pink")==-1){

            }

        }

}

