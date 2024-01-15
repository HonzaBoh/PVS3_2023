package oop.references;

import fileworks.DataImport;

import java.util.ArrayList;

public class PersonWithBlood {
    String name;
    int weight, age, height;
    BloodType blood;

    public PersonWithBlood(String name, int height, int weight, int age, BloodType blood) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.height = height;
        this.blood = blood;
    }

    void loadData(ArrayList<PersonWithBlood> persons){
        DataImport di = new DataImport("darciKrve.txt");
        String line;
        String[] params;
        while (di.hasNext()){
            line = di.readLine();
            params = line.split(",");
            persons.add(new PersonWithBlood(params[0], Integer.parseInt(params[1]),
                    Integer.parseInt(params[2]), Integer.parseInt(params[3]),
                    BloodType.eval(params[4])));

        }
        di.finishImport();
    }

    public static void main(String[] args) {
        ArrayList<PersonWithBlood> persons = new ArrayList<>();
    }
} enum BloodType {
   O_PLUS("O+"),
   O_MINUS("O-"),
   A_MINUS("A-"),
   A_PLUS("A+"),
   AB_MINUS("AB-"),
   AB_PLUS("AB+"),
   B_PLUS("B+"),
   B_MINUS("B-");

    BloodType(String s) {
    }

    static BloodType eval(String toEval){
        return switch (toEval) {
            case "O+" -> O_PLUS;
            case "O-" -> O_MINUS;
            case "A+" -> A_PLUS;
            case "A-" -> A_MINUS;
            case "B+" -> B_PLUS;
            case "B-" -> B_MINUS;
            case "AB+" -> AB_PLUS;
            case "AB-" -> AB_MINUS;
            default -> null;
        };
    }
}
