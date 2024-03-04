package fileworks;

import java.io.*;

public class Multiples {
    public static void main(String[] args) throws IOException {
        //sekvence psani do souboru
        String pathBase = "resources\\sequence";
        //otevira soubory
        for (int i = 1; i < 11; i++) {
            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                    new FileWriter(pathBase + i + ".txt")));

            //pise do jednotlivych souboru
            for (int j = 0; j < 1000; j++) {
                pw.println(Math.random()*1000);
            }
            pw.close();
        }

        double sum = 0;
        int lineCount = 0;
        String line;
        //cteni vice souboru
        for (int i = 1; i < 11; i++) {
            BufferedReader br = new BufferedReader(
                    new FileReader(pathBase + i + ".txt"));
            while ((line = br.readLine()) != null){
                lineCount++;
                sum += Double.parseDouble(line);
            }
            br.close();
        }
        //vypis prumeru:
        System.out.println("Average value: " + (sum/lineCount));
    }
}
