package repository;

import model.Song;

import java.util.List;

public interface SongRepository {
  void save(Song song);
  void delete(int id);
  Song findById(int id);
  List<Song> findAll();

}
