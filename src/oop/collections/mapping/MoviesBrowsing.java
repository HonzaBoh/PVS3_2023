package oop.collections.mapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MoviesBrowsing {
    static int invalidCount = 0;

    static ArrayList<MovieMapping> loadMovies(String filePath){
        ArrayList<MovieMapping> movies = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            lines.remove(0);
            for (String line : lines){
                movies.add(parseMovie(line));
            }
        } catch (IOException e) {
            System.out.println("IOE: " + e.getMessage());
        }
        return movies;
    }

    static MovieMapping parseMovie(String line){
        String[] params = line.split(",");
        try{
            MovieMapping movie = new MovieMapping(
                    Integer.parseInt(params[0]),
                    params[1],
//                    Integer.parseInt(params[1].substring(params[1].length()-5, params[1].length()-1)),
                    params[2]
            );
            System.out.println(movie);
            return movie;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e){
            invalidCount++;
            return null;
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieMapping> movies = loadMovies("resources//movies//input.csv");
        System.out.println("Total count: " + invalidCount);
    }
}
