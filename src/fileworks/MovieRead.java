package fileworks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MovieRead {
    static ArrayList<ComparableMovie> movies;


    //varianta 1: Scanner
    static void loadMoviesScanner(String path) throws IOException {
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter(";");
        sc.useLocale(Locale.US);
        ComparableMovie movie;
        while (sc.hasNext()){
            movie = new ComparableMovie(sc.next(),
                    sc.nextInt(),
                    sc.nextDouble());
            movies.add(movie);
        }
        sc.close();
    }

    //Varianta 2: po radcich + parse
    static void loadMoviesReaders(String path) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        String[] attributes;
        ComparableMovie movie;
        while ( (line = reader.readLine()) != null ){
             attributes = line.split(";");
             movie = new ComparableMovie(
                     attributes[0],
                     Integer.parseInt(attributes[1]),
                     Double.parseDouble(attributes[2])
             );
             movies.add(movie);
        }
    }

    //varianta 3 - all-in
    static void loadMoviesAll(String path) throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(path));

        String[] attributes;
        ComparableMovie movie;
        for(String line : lines){
            attributes = line.split(";");
            movie = new ComparableMovie(
                    attributes[0],
                    Integer.parseInt(attributes[1]),
                    Double.parseDouble(attributes[2])
            );
            movies.add(movie);
        }
    }
    public static void main(String[] args) throws IOException{
        movies = new ArrayList<>();
        String path = "resources//ComparableMovies.txt";
        loadMoviesScanner(path);
//        loadMoviesReaders(path);
//        loadMoviesAll(path);
        System.out.println(movies);
    }
}
class ComparableMovie{
    String name;
    int year;
    Double rating;

    public ComparableMovie(String name, int year, Double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " (" + year + ") [" + rating + "/10]";
    }
}
