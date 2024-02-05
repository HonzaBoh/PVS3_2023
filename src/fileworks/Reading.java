package fileworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("resources//test.txt");
        int read = fr.read();
        while (read != -1){
            System.out.print((char) (read));
            read = fr.read();
        }
        fr.close();


    }
}
