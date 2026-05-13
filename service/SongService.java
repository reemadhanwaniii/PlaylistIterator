package service;

import iterators.PlaylistIterator;
import iterators.ForwardIterator;
import model.Playlist;
import model.Song;
import repository.SongRepository;
import repository.SongRepositoryImpl;

public class SongService {
  private SongRepository songRepository;

  public SongService() {
      this.songRepository = new SongRepositoryImpl();
  }

  public void addSongToRepository(Song song) {
      this.songRepository.save(song);
  }

  public Playlist createPlayList(String name) {
      return new Playlist(name);
  }

  public void addSongToPlayList(Playlist playlist,int songId) {
      Song song = this.songRepository.findById(songId);

      if(song == null) {
          throw new IllegalArgumentException("Song not found");
      }

      playlist.addSong(song);
  }

  public void playPlaylist(Playlist playlist) {
      PlaylistIterator iterator = playlist.iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }
  }
}
