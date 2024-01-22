package exams.collections;
import java.util.ArrayList;

/**
 * Hlavni trida pro ukol, pouziva pomocne rozhrani a dve tridy umistene v souboru
 * Trida TextMSG je pro ukazku, funkcionalitu doplnujete zde (GreatTale) a do Tridy Book
 */
public class GreatTale {

    /**
     * Tato metoda by mela zvladnout praci s TextMsg i Book
     */
    static int wordCount(Readable toRead){
        return toRead.getText().split(" ").length;
    }


    public static void main(String[] args) {
        ArrayList<String> LOTR = new ArrayList<>();
        LOTR.add("One Ring to rule them all."); //stranka #1
        LOTR.add("Folk takes their peril with them into Lorien.");
        LOTR.add("Hinder me? Thou fool. No living man may hinder me!");
        LOTR.add("Don’t the great tales never end?"); //stranka #4

        TextMsg msg = new TextMsg("Johnny", "27-06-2003", "Oh, Hi Mark!");
        Book LordOTR = new Book("Lord of the rings", "J. R. R. Tolkien", "29-07-1968", 243, LOTR);
        Book LordOfTheRings = new Book("Lord of the Rings", "John Ronald Reuel Tolkien", "29-07-1968", 243, LOTR);
        System.out.println(LordOTR.equals(LordOfTheRings));//melo by vratit True, maji stejne knizni ID (IBM)

        System.out.println("Wordcount for LOTR: "  + wordCount(LordOTR));
        System.out.println("Wordcount for Msg: " + wordCount(msg));

//        System.out.println("LOTR read:");
        //read ve formatu
        // 1/4
        // text prvni stranky
        // 2/4
        // text druhe stranky
        System.out.println("LOTR TEXT:");
        System.out.println(LordOfTheRings.getText());

        LordOfTheRings.read();

        System.out.println("Message read:");
        msg.read();
    }

}
interface Readable {
    void read();

    String getText();

}

/**
 * Zde je vas ukol pro implementaci dle zadani
 */
class Book implements Readable, Comparable<Book>{

    String name, author, date;
    int IBN;
    ArrayList<String> pages;

    public Book(String name, String author, String date, int IBN, ArrayList<String> pages) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.IBN = IBN;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return this.IBN == ((Book) obj).IBN;
        return false;
    }

    @Override
    public void read() {
        for (int i = 0; i < pages.size(); i++) {
            System.out.println((i+1)+"/"+ pages.size());
            System.out.println(pages.get(i));
        }
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();

        for (String page : pages) {
            sb.append(page);
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.pages.size(), o.pages.size());
    }
}

class TextMsg  implements Readable, Comparable<TextMsg>{
    String sender;
    String date;
    String text;


    public TextMsg(String sender, String date, String text) {
        this.sender = sender;
        this.date = date;
        this.text = text;
    }

    @Override
    public int compareTo(TextMsg o) {
        String another = o.sender;
        return this.sender.compareTo(another);
    }

    @Override
    public void read() {
        System.out.println("Message received " + date);
        System.out.println(sender + " wrote: ");
        System.out.println(text);
    }

    @Override
    public String getText() {
        return text;
    }
}
