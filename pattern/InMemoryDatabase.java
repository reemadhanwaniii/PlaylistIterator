package pattern;

import model.Song;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase {
    List<Song> songs = new ArrayList<>();

    private void seeder() {
        songs.add(new Song(1,"Shape of You","Ed sheeran"));
        songs.add(new Song(2,"Blinding Lights","Ed sheeran"));
        songs.add(new Song(3,"Bohemian Rhapsody","Ed sheeran"));
        songs.add(new Song(4,"Gehra hua","Ed sheeran"));
        songs.add(new Song(5,"jaiye sajna","Ed sheeran"));
        songs.add(new Song(6,"saiyaara","Ed sheeran"));
        songs.add(new Song(7,"khat","Ed sheeran"));
    }

    public List<Song> getAllSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public boolean removeSone(int id) {
        return songs.removeIf(song -> song.getId() == id);
    }


}
