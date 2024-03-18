package fileworks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Appending {

    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter(
                            new BufferedWriter(
                            new FileWriter("output.txt")));

            pw.println("novej radek");
            pw.println(213);
            pw.close();
            pw = new PrintWriter(
                    new BufferedWriter(
                    new FileWriter("output.txt", true)));
            pw.println("Hello world!");
            pw.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
