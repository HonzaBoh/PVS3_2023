package fileworks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Reading {
    public static void main(String[] args) throws IOException {
        String filePath = "resources//test.txt";
        //cteni po znacich/bytech
        FileReader fr = new FileReader(filePath);
        int read = fr.read();
        while (read != -1){
            System.out.print((char) (read));
            read = fr.read();
        }
        System.out.println();
        fr.close();

        System.out.println("Scanner version:");
//        String text = "exemplarni5text6pro3scanner";
        Scanner sc = new Scanner(new File(filePath));
        sc.useLocale(Locale.US);
//        sc.useDelimiter("\\|");
        while (sc.hasNextDouble()){
            System.out.println(sc.nextDouble());
        }
        sc.close();

        //buffering - cteni po radcich:
        System.out.println("Buffered Reader:");
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

        //handy: oldie goldie
        System.out.println("All lines:");
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        System.out.println(lines);
        for (String oneLine : lines){
            System.out.println(oneLine);
        }
    }
}
