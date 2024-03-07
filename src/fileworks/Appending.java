package fileworks;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Appending {

    public static void main(String[] args) {
        //V normalnim pripade se soubory prepisuji
//        try{
//        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
//        pw.println("Hello");
//        pw.println(42);
//        pw.close();
//
//        pw = new PrintWriter(new FileWriter("output.txt"));
//        pw.println("V jakem souboru bude tohle?");
//        pw.close();
//        } catch (IOException e) {
//            System.out.println("Chyba: " + e.getMessage());
//        }

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("Output.txt"));
            pw.println("Originalni radka");
            pw.close();;
            pw = new PrintWriter(new FileWriter("Output.txt", true));
//            pw.append("nova radka");
            pw.println("Nova radka");
            pw.close();
        } catch (IOException e) {
            System.out.println("Chyba: " + e.getMessage());
        }
    }
}
