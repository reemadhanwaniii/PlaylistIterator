package repository;

import model.Song;
import pattern.InMemoryDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongRepositoryImpl implements SongRepository{

    private InMemoryDatabase db;

    public SongRepositoryImpl() {
        this.db = new InMemoryDatabase();
        this.db.seeder();
    }

    @Override
    public void save(Song song) {
        this.db.getDb().put(song.getId(),song);
    }

    @Override
    public void delete(int id) {
        this.db.getDb().remove(id);
    }

    @Override
    public Song findById(int id) {
        return this.db.getDb().get(id);
    }

    @Override
    public List<Song> findAll() {
        return new ArrayList<>(this.db.getDb().values());
    }
}
