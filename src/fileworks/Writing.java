package fileworks;

import java.io.*;
import java.util.Locale;

public class Writing {


    public static void main(String[] args) throws IOException {
        String path = "resources//export.txt";
//        FileWriter fw = new FileWriter(path);
//        fw.write("neco");
//        fw.write('a');
//        fw.write(55);
//        fw.close();
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter(path), 1024);
//        bw.write("dlouhej text");
//        bw.newLine();
//        for (int i = 0; i < 10000; i++) {
//            bw.write("Line#"+(i+1));
//            bw.newLine();
//        }

//        bw.close();

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path), 64*1024));

        for (int i = 0; i < 10000; i++) {
            pw.println("Line#" + (i+1));
        }
//        pw.close();
//        pw.flush();

    }
}
