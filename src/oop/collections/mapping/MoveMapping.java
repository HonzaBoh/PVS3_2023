package oop.collections.mapping;

public class MoveMapping {
    String name;
    int yearOfRelease;
    String genre;
    double rating;
    int duration;//tbd
    String director;

    public MoveMapping(String name, int yearOfRelease, String genre, double rating, int duration, String director) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.director = director;
    }

    @Override
    public String toString() {
        return "===================\n"
                 + "Name: " + name + "\n"
                 + "Written by: " + director + "\n"
                 + "Genre: " + genre + "\n"
                 + "Released in: " + yearOfRelease + "\n"
                 + "Runtime: " + duration + "\n" /*todo: mm:ss  format, dle datasetu */
                 + "Rated: " + rating + "10\n"
                + "===================\n";
    }
}
