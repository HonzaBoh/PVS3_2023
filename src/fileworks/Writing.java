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
//        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
//        bw.write("dlouhej text");
//        bw.newLine();
//        for (int i = 0; i < 10000; i++) {
//            bw.write("Line#"+(i+1));
//            bw.newLine();
//        }
//
//        bw.close();

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path)));
        for (int i = 0; i < 10000; i++) {
            pw.println("Line#" + (i+1));
        }
//        pw.close();
        pw.flush();
        pw.println("konec");
        pw.println((5.0/2.0));
        pw.close();

    }
}
