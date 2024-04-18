package exams.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Highlights {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("resources\\out.txt", true);
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej neco do souboru:");
        fw.write(sc.nextLine());
        fw.close();
    }
}
