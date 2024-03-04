package fileworks;

import java.io.*;

public class Streaming {
    public static void main(String[] args) throws IOException {
//        FileInputStream stream = new FileInputStream("resources//streamRead.txt");
//        InputStreamReader reader = new InputStreamReader(stream);
//        int character;
//        System.out.println(reader.getEncoding());
//        System.out.println(reader.ready());
//        while ((character = reader.read()) != -1){
//            System.out.print((char)character);
//        }
//        reader.close();

        OutputStream out = new FileOutputStream("streamed.txt");
        out.write(100);
        out.write(52);
        out.write(50);
        String text = "\nanother line";
//        char[] chars = text.toCharArray();
        byte[] bytes = text.getBytes();
        out.write(bytes);
        out.close();
        // muze vypisovat formatovane
        //PrintWriter pw = new PrintWriter(out);
    }
}
