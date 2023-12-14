package oop.interfaces;

import java.util.List;

public class Film implements Media {
    String genre, name;
    int duration, year;

    public Film(String genre, String name, int duration, int year) {
        this.genre = genre;
        this.name = name;
        this.duration = duration;
        this.year = year;
    }


    @Override
    public void play() {
        System.out.println("Playing " + name + " (" + year + ")");
    }

    @Override
    public void getDuration() {
        int hrs = duration/3600;
        int min = (duration-3600*hrs) / 60;
        int sec = duration - hrs*3600 - min*60;
        System.out.println(name + " - " + hrs + ":" + min + ":" + sec);
    }
}
