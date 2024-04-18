package exams.files;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FilterFiles {

    private static final Comparator<File> BY_SIZE = new Comparator<File>() {
        @Override
        public int compare(File o1, File o2) {
            return Long.compare(o1.length(), o2.length());
        }
    };

    static String getFileName(ArrayList<File> files){
        //vsichni jsou jedno a to same, staci vzit koncovku prvniho
        String[] split = files.get(0).getName().split("\\.");
        String suffix = split[split.length-1];

        String fileName = "";
        for (File file : files){
            String[] parts = file.getName().split("\\.");
            fileName += parts[0];
        }
        fileName += "."+suffix;
        System.out.println(fileName);
        return fileName;
    }

    public static void main(String[] args) throws IOException {
        File[] files = new File("resources\\poetry").listFiles();
        System.out.println(Arrays.toString(files));

        //musi to byt txt, musi to byt mensi, nez 5 kB
        ArrayList<File> filteredFiles = new ArrayList<>();
        for(File file : files){
            if (file.getName().endsWith(".txt") &&
                file.length() < 5 * 1024){
                filteredFiles.add(file);
            }
        }
        System.out.println(filteredFiles);
        filteredFiles.sort(BY_SIZE);
        System.out.println(filteredFiles);

        getFileName(filteredFiles);

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(getFileName(filteredFiles))));
        for(File file : filteredFiles){
            String line;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null){
                pw.println(line);
            }
            br.close();
        }
        pw.close();
    }
}
