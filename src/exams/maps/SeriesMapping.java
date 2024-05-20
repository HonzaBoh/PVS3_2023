package exams.maps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;

public class SeriesMapping {

    static void printSeries(Series s){
        System.out.println(s.name + ":");
        for (Episode episode : s.episodes){
            System.out.println(episode);
        }
    }

    static ArrayList<Series> seriesLoad(String filePath){
        ArrayList<Series> series = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            String[] params;
            lines.remove(0);//preskoc prvni radek
            for (String line : lines){
                params = line.split(";");
                series.add(new Series(params[0], params[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return series;
    }

    static HashMap<String, Series> mapSeries(ArrayList<Series> series){
        HashMap<String, Series> seriesMap = new HashMap<>();
        for (Series s : series){
            seriesMap.put(s.seriesID, s);
        }
        return seriesMap;
    }

    static void loadEpisodes(String filePath, ArrayList<Series> series){
        HashMap<String, Series> seriesMap = mapSeries(series);
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            String[] params;
            lines.remove(0);
            for (String line : lines){
                params = line.split(";");
                if (seriesMap.containsKey(params[3])){
                    seriesMap.get(params[3]).episodes.add(
                            new Episode(Integer.parseInt(params[0]),
                                    Integer.parseInt(params[1]),
                                    Double.parseDouble(params[2]))
                    );
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Episode e = new Episode(2, 9,0.9);
        System.out.println(e);
//        ArrayList<Series> series = seriesLoad("resources\\series.csv");
//        System.out.println(series);
//        loadEpisodes("resources\\episodes.csv", series);
//        for (Series s : series){
//            s.setSeriesRating();
//            System.out.println(s);
//        }
//        printSeries(series.get(80));

    }
}

class Series{
    String seriesID;
    String name;
    ArrayList<Episode> episodes;

    double seriesRating;

    public Series(String seriesID, String name) {
        this.seriesID = seriesID;
        this.name = name;
        this.episodes = new ArrayList<>(); // pripraveno na vkladani, zatim tam nic neni
        this.seriesRating = 0;//zatim
    }


    @Override
    public String toString() {
        return name + ", rated: " + seriesRating +'\n';
    }

    public void setSeriesRating() {
        double average = episodes.stream()
                .mapToDouble(episode -> episode.rating)
                .average()
                .orElse(0);
        this.seriesRating = average;
    }
}
class Episode{
    int season;
    int episode;
    double rating;

    public Episode(int season, int episode, double rating) {
        this.season = season;
        this.episode = episode;
        this.rating = rating;
    }

    final static Comparator<Episode> BY_EPISODE = new Comparator<Episode>() {
        @Override
        public int compare(Episode o1, Episode o2) {
            if (o1.season == o2.season){
                return o1.episode - o2.episode;
            } else {
                return o1.season - o2.season;
            }
        }
    } ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Episode episode1 = (Episode) o;
        return season == episode1.season && episode == episode1.episode && Double.compare(rating, episode1.rating) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(season, episode, rating);
    }

    @Override
    public String toString() {
        return "S"+season+"E"+episode+": " + rating;
    }
}
