import iterators.PlaylistIterator;
import iterators.ReverseIterator;
import iterators.ShuffleIterator;
import model.Playlist;
import service.SongService;

public class Main {
    public static void main() {

        SongService service = new SongService();
        Playlist playlist = service.createPlayList("Reema's playlist");
        service.addSongToPlayList(playlist,1);
        service.addSongToPlayList(playlist,2);
        service.addSongToPlayList(playlist,3);
        service.addSongToPlayList(playlist,4);

        service.playPlaylist(playlist);

        PlaylistIterator reverseIterator =
                new ReverseIterator(playlist.getSongs());

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        System.out.println("\n=== SHUFFLE PLAY ===");

        PlaylistIterator shuffleIterator =
                new ShuffleIterator(playlist.getSongs());

        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }
    }
}
