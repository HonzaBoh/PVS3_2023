package oop.inheritance;

import oop.Basics.Song;

import java.util.ArrayList;

public class MyList extends ArrayList<Song> {

    @Override
    public boolean add(Song song) {
        if (song.year > 2000){
            //vlozi neco do listu
            return super.add(song);
        }
        return false;
    }

    public static void main(String[] args) {
        MyList list = new MyList();
    }
}
