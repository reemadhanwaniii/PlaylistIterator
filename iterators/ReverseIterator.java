package iterators;

import model.Song;

import java.util.List;

public class ReverseIterator implements PlaylistIterator{

    private final List<Song> songs;
    private int index;

    public ReverseIterator(List<Song> songs) {
        this.songs = songs;
        this.index = songs.size() - 1;
    }
    @Override
    public Object next() {
        return songs.get(index--);
    }

    @Override
    public boolean hasNext() {
        return index >=0;
    }
}
