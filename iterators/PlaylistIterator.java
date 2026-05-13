package iterators;

public interface PlaylistIterator<T> {
    T next();
    boolean hasNext();
}
