package oop.Basics;

import fileworks.DataImport;

import javax.xml.crypto.Data;

public class Extremes {
    public static void main(String[] args) {
        DataImport dataImport = new DataImport("osoba.txt");
        Osoba youngest = new Osoba("young", 123, 123, Integer.MAX_VALUE),
                tallest = new Osoba("tall", Integer.MIN_VALUE, 123, 21),
                preload;
        String line;
        String[] parameters;
        while (dataImport.hasNext()){
            line = dataImport.readLine();
            parameters = line.split(",");
            preload = new Osoba(parameters[0],
                    Integer.parseInt(parameters[1]),
                    Integer.parseInt(parameters[2]),
                    Integer.parseInt(parameters[3]));

            if(preload.age < youngest.age){
                youngest = preload;
            }
            if (preload.height > tallest.height){
                tallest = preload;
            }
        }
        dataImport.finishImport();
        System.out.println(tallest);
        System.out.println(youngest);
    }
}
