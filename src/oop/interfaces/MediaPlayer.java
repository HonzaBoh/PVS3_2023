package oop.interfaces;

public class MediaPlayer {
    public static void main(String[] args) {
        Media m = new Music(2007, 181, "You're gonna go far kid", "Offspring");
        Media film = new Film("Horror", "Poltergeist", 7850, 1982);
        Media[] media = {m, film};
        for (Media tmp : media) {
            tmp.play();
        }

    }
}
