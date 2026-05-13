package service;

import iterators.Iterator;
import iterators.PlaylistIterator;
import model.Song;
import repository.SongRepository;
import repository.SongRepositoryImpl;

public class SongService {
    Iterator<Song> songIterator;
    SongRepository songRepository;

    public SongService() {
        this.songRepository = new SongRepositoryImpl();
        this.songIterator = new PlaylistIterator(this.songRepository.getAllSongs());
    }

    public void getSongs() {
        while (!songIterator.hasNext()) {
            System.out.println(songIterator.next());
        }
     }
}
