package fileworks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Lines {

    static int lineCount(String filePath) {
        int count = 0;
        try {
//            BufferedReader br = new BufferedReader(new FileReader(filePath));
//            while (br.readLine() != null){
//                count++;
//            }
//            br.close();

//            List<String> lines = Files.readAllLines(Paths.get(filePath));
//            count = lines.size();
//            return Files.readAllLines(Paths.get(filePath)).size();

            FileReader fr = new FileReader(filePath);
            int character = fr.read();
            while (character != -1) {
                if (character == '\n'){
                    count++;
                }
                character = fr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lineCount("resources\\ComparableMovies.txt"));
    }
}
