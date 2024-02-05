package fileworks;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Basics {

    static void tree(File root){
        File[] folderContents;
        if (root.isFile()){
            System.out.println("Soubor: " + root.getPath());
        } else if (root.isDirectory()){
            System.out.println("Slozka: " + root.getPath());
            folderContents = root.listFiles();
            for(File file : folderContents){
                tree(file);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("resources//test.txt");
        System.out.println("Existuje? " + file.exists());
        System.out.println("Cesta (abs)? " + file.getAbsolutePath());
        System.out.println("Cesta? " + file.getPath());
        System.out.println("Nazev? " + file.getName());
        System.out.println("Soubor: " + file.isFile());
        System.out.println("Slozka: " + file.isDirectory());

        System.out.println("Velikost: " + file.length());
        System.out.println("Velikost (kB): " + (file.length()/1024));

//        File newOne = new File("resources//novej");
//        newOne.createNewFile();
//        newOne.mkdir();
        File directory = new File(".//src");
//        File[] contents = directory.listFiles();//ulozi vsechny File z adresare
//        System.out.println(Arrays.toString(contents));
        tree(directory);
    }
}
