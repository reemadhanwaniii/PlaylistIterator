package repository;

import model.Song;

import java.util.List;

public interface SongRepository {
    void addSong(Song song);
    void removeSong(int id);
    List<Song> getAllSongs();
}
