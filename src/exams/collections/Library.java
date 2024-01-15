package exams.collections;

import java.util.ArrayList;

/**
 * @author Honza.Boh
 * @version 11-01-2024
 * Trida reprezentujici knihovnu pro praci s kolekci List pro tridu {@link Book}
 */
public class Library {

    /**
     * Kolekce vsech knih, automaticky inicializovana pri vytvoreni instance knihovny.
     * Uklada instance Book {@link Book}
     */
    ArrayList<Book> books = new ArrayList<>();

    /**
     * Nacte vsechny instance knih ze souboru a ulozi do listu books.
     * Akceptovany format: NazevKnihy;JmenoAutora;rokVydani
     * @param filePath cesta k souboru
     */
    void loadBooks(String filePath){

    }

    /**
     * Zkontroluje, zda se v kodu vyskytuje alespon jedna kniha daneho autora
     * @param authorName jmeno autora
     * @return {@code true}, pouze pokud je v kolekci kniha napsana autorem ze vstupu
     */
    boolean containsAuthor(String authorName){
        return true;
    }

    /**
     * Odstrani z kolekce vsechny knihy napsane v predanem roce
     * @param year rok vydani knih, ktere maji byt z kolekce odstraneny
     */
    void removePublishedIn(int year){

    }

    /**
     * Zkontroluje, zda se v kolekci knih predana kniha nachazi *prave* jednou
     * @param toCheck reference na knihu
     * @return {@code true}, pouze pokud je v kolekci kniha vickrat nez jednou
     */
    boolean multiples(Book toCheck){
        return true;
    }

    /**
     * Vypise vsechny knihy, ktere napsal predany autor.
     * @param authorName jmeno autora
     */
    void listWrittenBy(String authorName){

    }

    /**
     * Vrati vsechny knihy v listu, ktere byly napsany v danem obdobi
     * @param start pocatecni datum
     * @param end koncove datum
     * @return list vsech knih napsane v obdobi od zacatecniho data do koncoveho
     */
    ArrayList<Book> booksIn(int start, int end){
        return null;
    }


    public static void main(String[] args) {
        Library library = new Library();
        library.loadBooks("books.txt");
        //Jsou nactene?
        System.out.println(library);
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
    public Book(String title, String author, int yearOfRelease) {
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
        return title + "\t|" + author + "\t|" + yearOfRelease + "\n";
    }
}

