package oop.collections.mapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
                movieID = Integer.parseInt(params[1]);
                ratingValue = Double.parseDouble(params[2]);

                if (!ratings.containsKey(movieID)){ // film v mape neni
                    ArrayList<Double> toAdd = new ArrayList<>();
                    toAdd.add(ratingValue);
                    ratings.put(movieID, toAdd);
                } else {//film v mape je
                    ratings.get(movieID).add(ratingValue);
                }
            }

            System.out.println("Movies mapped");
            System.out.println("Ratings: " + lines.size());
            //ukazka - vytisk k jednomu filmu
//            for (Double num : ratings.get(8360)){
//                System.out.println(num);
//            }
            List<Double> listedRating;
            for(MovieMapping movie : movies){
                listedRating = ratings.get(movie.id);
                if (listedRating == null){
                    continue;
                }

                double rating = ratings.get(movie.id).stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(0);

                movie.setRating(rating);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieMapping> movies = loadMovies("resources//movies//input.csv");
        System.out.println("Total count: " + invalidCount);
        setRatings(movies, "resources//movies//ratings.csv");
//        System.out.println(movies);

        Map<String, List<MovieMapping>> ratingCategories = movies.stream()
                .collect(Collectors.groupingBy(
                        movieMapping -> {
                            double rating = movieMapping.rating;
                            if (rating >= 3.7) return "Velmi dobre";
                            else if (rating >= 3) return "Dobre";
                            else return "Prumer";
                        }
                ));

        System.out.println(ratingCategories.get("Velmi dobre"));
    }
}
