package fileworks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Multiples {


    static double loadFiles(String filePath) {
        double sum = 0;
        double amount = 0;
        for (int i = 0; i < 10; i++) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(filePath + (i+1) + ".txt"));
                String line;
                while ((line = br.readLine()) != null){
                    sum += Double.parseDouble(line);
                    amount++;
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return 0;
            }
        }
        return sum / amount;
    }

    static void createFiles(String filePath, int min, int max, int count) {
        PrintWriter pw = null;
        int random;
        try {
            for (int i = 0; i < count; i++) {
                pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath + (i+1) + ".txt")));
                for (int j = 0; j < 10000; j++) {
                    random = (int) (Math.random() * (max - min + 1) + min);
                    pw.println(random);
                }
                pw.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            createFiles("resources\\sequence", 0, 100000, 10);
            System.out.println("Average value: " + loadFiles("resources\\sequence"));
        }

    }
}
