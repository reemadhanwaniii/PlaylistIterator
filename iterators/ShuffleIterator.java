package iterators;

import model.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class ShuffleIterator implements PlaylistIterator{

    private final List<Song> songs;
    private int index;

    public ShuffleIterator(List<Song> songs) {
        this.songs = new ArrayList<>(songs);
        Collections.shuffle(this.songs);
        this.index = 0;
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs available");
        }

        return songs.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }
}
