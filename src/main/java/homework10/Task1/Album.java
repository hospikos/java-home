package homework10.Task1;

import java.util.ArrayList;
import java.util.Objects;

public class Album {
    private String title;
    private SongList songList;

    public Album(String title) {
        this.title = title;
        this.songList = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public SongList getSongList() {
        return songList;
    }

    public static class Song {
        private String title;
        private double duration;

        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public double getDuration() {
            return duration;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Song song = (Song) obj;
            return Objects.equals(title, song.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title);
        }

        @Override
        public String toString() {
            return "Song{" +
                    "title='" + title + '\'' +
                    ", duration=" + duration +
                    '}';
        }
    }

    public class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }

        public Song findSongByTitle(String title) {
            for (Song song : songs) {
                if (song.getTitle().equalsIgnoreCase(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSongByTrackNumber(int trackNumber) {
            if (trackNumber > 0 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Album album = new Album("Greatest Hits");
        Song song1 = new Song("Song One", 4.23);
        Song song2 = new Song("Song Two", 3.45);
        Song song3 = new Song("Song Three", 5.12);

        album.getSongList().addSong(song1);
        album.getSongList().addSong(song2);
        album.getSongList().addSong(song3);

        System.out.println("Album: " + album.getTitle());
        System.out.println("Song by title 'Song Two': " + album.getSongList().findSongByTitle("Song Two"));
        System.out.println("Song by track number 3: " + album.getSongList().findSongByTrackNumber(3));
    }
}