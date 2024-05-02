package oop.collections.mapping;

public class MovieMapping {
    String name;
    int yearOfRelease;
    String genre;
    double rating;
//    int duration;//tbd
//    String director;

    public MovieMapping(String name, int yearOfRelease, String genre) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.rating = 0;
    }

    @Override
    public String toString() {
        return "===================\n"
                 + "Name: " + name + "\n"
//                 + "Written by: " + director + "\n"
                 + "Genre: " + genre + "\n"
                 + "Released in: " + yearOfRelease + "\n"
//                 + "Runtime: " + duration + "\n"
                 + "Rated: " + rating + "10\n"
                + "===================\n";
    }
}
