package oop.Basics;

import fileworks.DataImport;

import java.util.ArrayList;


public class LoadPlaylist {
    static ArrayList<Song> loadSongs(String filePath){
        ArrayList<Song> playlist = new ArrayList<>();
        DataImport file = new DataImport(filePath);
        String[] attributes;
        String line;
        while (file.hasNext()){
            line = file.readLine();
            attributes = line.split(";");
            playlist.add(new Song(attributes[0], Integer.parseInt(attributes[1]), Double.parseDouble(attributes[2]),
                    Integer.parseInt(attributes[3])));
        }
        file.finishImport();
        return playlist;
    }

    public static void main(String[] args) {
//        Song[] arr = new Song[0];
        ArrayList<Song> playlist = loadSongs("Tracks.txt");

       for (Song song : playlist){
           System.out.println(song.toString());
       }

        
    }
}
