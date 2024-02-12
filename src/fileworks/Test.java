package fileworks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        String filePath = "resources//testik.txt";

        //pocet slov
        FileReader fr1 = new FileReader(filePath);
        int read = fr1.read();
        int words = 0;
        while (read != -1){
            if ((char)(read) ==' ' || (char)(read) =='\n' ){
                words++;
            }
        }
        System.out.println(words);
        fr1.close();

        //pocet znaku
        FileReader fr2 = new FileReader(filePath);
        int read2 = fr2.read();
        int znaky = 0;
        while (read2 != -1){
            System.out.print((char) (read2));
            read2 = fr2.read();
            znaky++;

        }
        System.out.println("\n" + znaky);
        fr2.close();

        //pocet vet
        FileReader fr3 = new FileReader(filePath);
        int read3 = fr3.read();
        int vety = 0;
        while (read3 != -1){
            if ((char)(read3) =='.' ||(char)(read3) =='?'||(char)(read3) =='!'){
                vety++;
            }
        }
        System.out.println(words);
        fr3.close();














    }
}
