package repository;

import model.Song;
import pattern.InMemoryDatabase;

import java.util.List;

public class SongRepositoryImpl implements SongRepository{

    private InMemoryDatabase db;

    public SongRepositoryImpl() {
        this.db = new InMemoryDatabase();
        this.db.seeder();
    }

    @Override
    public void addSong(Song song) {
        this.db.addSong(song);
    }

    @Override
    public void removeSong(int id) {
        this.db.removeSone(id);
    }

    @Override
    public List<Song> getAllSongs() {
        return this.db.getAllSongs();
    }
}
