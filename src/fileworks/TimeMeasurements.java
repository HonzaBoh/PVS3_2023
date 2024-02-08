package fileworks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TimeMeasurements {

    static String filePath = "resources//time.txt";

    static void generateData(){
        DataExport de = new DataExport(filePath);
        for (int i = 0; i < 1_000_000; i++) {
            de.writeLine("Line#" + (i+1));
        }
        de.finishExport();
    }


    public static void main(String[] args) throws IOException {
        generateData();
        System.out.println("FileReader:");
        FileReader fr = new FileReader(filePath);
        int reader = fr.read();
        long start = System.nanoTime();
        while (reader != -1){
//            System.out.print((char) reader);
            reader = fr.read();
        }
        fr.close();
        long stop = System.nanoTime();
        System.out.println("Duration (FileReader): " + (stop-start));






    }
}
