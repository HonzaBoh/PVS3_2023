package oop.Basics;

public class Song {
    String name;
    public int year;
    double rating;
    int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1800)
            this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Song(String name, int year, double rating, int duration) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " (" + year + ")";
    }

    public String getInfo(){
        String info;
        info = "Song: " + name + "\n" +
                "Year of release: " + year + "\n" +
                "rating: " + rating + "/10\n" +
                "duration: " + duration;//formát MM:SS

        return info;
    }

}
