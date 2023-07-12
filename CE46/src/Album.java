import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (songs.findSong(title) != null) return false;
        return songs.add(new Song(title, duration));
    }

//    private Song findSong(String title) {
//        return songs.findSong(title);
//    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        if (track <= 0 || track > songs.songs.size()) return false;
        playlist.add(songs.songs.get(track - 1));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = songs.findSong(title);
        if (song == null) return false;
        playlist.add(song);
        return true;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) return false;
            songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (Objects.equals(song.getTitle(), title)) return song;
            }
            return null;
        }

        private Song findSong(int track) {
            if (track <= 0 || track > songs.size()) return null;
            return songs.get(track - 1);

        }
    }
}
