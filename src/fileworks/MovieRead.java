package fileworks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieRead {
    static ArrayList<Movie> movies = new ArrayList<>();


    static void loadMovies(String filepath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = br.readLine()) != null){
//                System.out.println(line);
               movies.add(parseMovie(line));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //alternativne
        try{
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            for (String line : lines){
                movies.add(parseMovie(line));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    static Movie parseMovie(String line) {
        Movie m;
        String[] params = line.split(";");
        m = new Movie(params[0], Integer.parseInt(params[1]), Double.parseDouble(params[2]));
        return m;
    }

    public static void main(String[] args) {
        loadMovies("resources\\ComparableMovies.txt");
        System.out.println(movies);
    }

}

class Movie {
    String name;
    int year;
    double rating;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " (" +year+") "+ "[" + rating + "/10]";
    }
}
