package fileworks;

import java.io.*;

public class Writing {

    public static void main(String[] args) throws IOException {
        String path = "resources//export.txt";
        FileWriter fw = new FileWriter(path);
        fw.write("neco");
        fw.write("a");
        fw.write(123);
        fw.close();


        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write("dlouhej text");
        bw.newLine();
        bw.flush();

        bw.close();

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        for (int i = 0; i <10000 ; i++) {
            pw.println("line# "+ (i+1));
        }
        pw.flush(); // jen vyprazdni buffer
        pw.println((5.0/2.0));
        pw.close(); // konec prace s souborem



    }
}
