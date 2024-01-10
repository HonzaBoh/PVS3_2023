package exams.collections;

import java.util.ArrayList;

/**
 * Trida reprezentujici knihovnu pro praci s kolekci List pro tridu {@link Book}
 */
public class Library {

    /**
     * Kolekce vsech knih, automaticky inicializovana pri vytvoreni instance knihovny.
     * Uklada instance Book {@link Book}
     */
    ArrayList<Book> books = new ArrayList<>();


    public static void main(String[] args) {
        Library library = new Library();
    }
}

/**
 * Trida reprezentujici knihu
 */
class Book{
    /**
     * datum vydani knihy
     */
    int yearOfRelease;
    /**
     * Jmeno autora knihy ci pseudonym
     */
    String author;
    /**
     * Nazev knihy
     */
    String title;

    /**
     * Metoda pro vytvoreni instance knihy
     */
    public Book(int yearOfRelease, String author, String title) {
            this.yearOfRelease = yearOfRelease;
            this.author = author;
            this.title = title;
            }

    /**
     * Metoda pro vypis knihy. Vypis je oddelen tabulatory a automatickym odradkovanim
     * @return String ve formatu nazevKnihy by autor in rokVydani
     */
    @Override
    public String toString() {
        return title + "\n\t\t\tby" + author + "\t\t\tin" + yearOfRelease;
    }
}

