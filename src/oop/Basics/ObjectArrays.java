package oop.Basics;

import java.util.Arrays;

public class ObjectArrays {
    public static void main(String[] args) {
        Song dreamOn = new Song("Dream on", 1973, 9.9, 267);
        //static verze pole
        Song[] songs = {
              dreamOn,
              new Song("You're gonna go far, kid", 2008, 8.8, 173)
        };
        System.out.println(songs[1]);
        Song[] moreSongs = new Song[2];
        moreSongs[1] = dreamOn;
        dreamOn.rating = 9.5;
        System.out.println(moreSongs[1].rating);
        System.out.println(Arrays.toString(songs));
    }
}
