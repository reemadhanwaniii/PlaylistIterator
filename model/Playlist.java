package model;

import iterators.ForwardIterator;
import iterators.PlaylistIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private final String name;
    private final List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public boolean removeSong(int id) {
        return songs.removeIf(song -> song.getId() == id);
    }

    public String getName() {
        return this.name;
    }

    public List<Song> getSongs() {
        return Collections.unmodifiableList(songs);
    }

    public PlaylistIterator iterator() {
        return new ForwardIterator(songs);
    }
}
