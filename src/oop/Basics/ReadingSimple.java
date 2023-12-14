package oop.Basics;

import fileworks.DataImport;

public class ReadingSimple {
    public static void main(String[] args) {
        DataImport read = new DataImport("osoba.txt");
//        read.printFile();
        while (read.hasNext()){
            System.out.println(read.readLine());
        }
        read.finishImport();
    }
}
