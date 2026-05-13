package iterators;

import model.Song;

import java.util.List;
import java.util.NoSuchElementException;

public class PlaylistIterator implements Iterator{

    private final List<Song> songs;
    private int index;

    public PlaylistIterator(List<Song> songs) {
        this.songs = songs;
        this.index = 0;
    }

    @Override
    public Object next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        return songs.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }
}
