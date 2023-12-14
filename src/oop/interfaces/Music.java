package oop.interfaces;

public class Music implements Media{
    int year, duration;
    String name, composer;

    public Music(int year, int duration, String name, String composer) {
        this.year = year;
        this.duration = duration;
        this.name = name;
        this.composer = composer;
    }

    @Override
    public void play() {
        System.out.println("Playing " + name + " by " + composer);
    }

    @Override
    public void getDuration() {
        System.out.println(name + " - " + (duration/60) + ":" + duration%60);
    }
}
