package pattern;

import model.Song;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDatabase {
    private Map<Integer,Song> db;

    public InMemoryDatabase() {
        this.db = new HashMap<>();
    }

    public void seeder() {
        this.db.put(1,new Song(1, "Shape of You", "Ed Sheeran"));
        this.db.put(2,new Song(2, "Believer", "Imagine Dragons"));
        this.db.put(3,new Song(3, "Perfect", "Ed Sheeran"));
        this.db.put(4,new Song(4, "Closer", "Chainsmokers"));
    }

    public Map<Integer, Song> getDb() {
        return db;
    }
}
