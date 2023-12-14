package oop.Basics;

import fileworks.DataImport;

public class Parsing {
    public static void main(String[] args) {
        DataImport di = new DataImport("osoba.txt");
        String line;
        String[] attributes;
        Osoba o;
        while (di.hasNext()) {
            line = di.readLine();
            attributes = line.split(",");
            o = new Osoba(attributes[0],
                    Integer.parseInt(attributes[1]),
                    Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]));

            System.out.println(o);
        }
        di.finishImport();
    }
}
