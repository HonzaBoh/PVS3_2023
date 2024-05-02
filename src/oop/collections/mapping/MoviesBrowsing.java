package oop.collections.mapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
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
//            System.out.println(movie);
            return movie;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e){
            invalidCount++;
            return null;
        }
    }

    static void setRatings(ArrayList<MovieMapping> movies, String filePath){
        HashMap<Integer, List<Double>> ratings = new HashMap<>();
        
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            double ratingValue;
            int movieID;
            String[] params;
            lines.remove(0);
            for(String line : lines){
                params = line.split(",");
                // TODO: 02.05.2024 : nacist dvojice, pripad unikatni/uz tam je 
                movieID = Integer.parseInt(params[1]);
                ratingValue = Double.parseDouble(params[2]);
            }
            // TODO: 02.05.2024 Priradit k filmum 
            System.out.println("Ratings: " + lines.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieMapping> movies = loadMovies("resources//movies//input.csv");
        System.out.println("Total count: " + invalidCount);
        setRatings(movies, "resources//movies//ratings.csv");

    }
}
