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

    @Override
    public String toString() {
        return name + "(" + blood.toString() + ")";
    }

    static void loadData(ArrayList<PersonWithBlood> persons) {
        DataImport di = new DataImport("darciKrve.txt");
        String line;
        String[] params;
        while (di.hasNext()) {
            line = di.readLine();
            params = line.split(",");
            persons.add(new PersonWithBlood(params[0], Integer.parseInt(params[1]),
                    Integer.parseInt(params[2]), Integer.parseInt(params[3]),
                    BloodType.eval(params[4])));

        }
        di.finishImport();
    }

    boolean compatibleToGive(PersonWithBlood toGive) {
        return BloodType.BLOOD_COMPATIBILITY[this.blood.position][toGive.blood.position];
    }

    static void mockDonations(ArrayList<PersonWithBlood> persons) {
        PersonWithBlood first;
        PersonWithBlood second;
        for (int i = 0; i < 1000; i++) {
            first = persons.get((int) (Math.random() * persons.size()));
            second = persons.get((int) (Math.random() * persons.size()));
            if (first.compatibleToGive(second)) {
                System.out.println("Osoba: " + first + " uspesne darovano: " + second);
            }
            else {
                System.out.println("Nekompatibilni typy:");
                System.out.println(first);
                System.out.println(second);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<PersonWithBlood> persons = new ArrayList<>();
        loadData(persons);
        mockDonations(persons);
    }
}

enum BloodType {
    A_PLUS("A+",0),
    A_MINUS("A-",1),
    B_PLUS("B+",2),
    B_MINUS("B-",3),
    O_PLUS("O+",4),
    O_MINUS("O-",5),
    AB_PLUS("AB+",6),
    AB_MINUS("AB-",7);

    BloodType(String s, int position) {
        this.position = position;
    }

    public final int position;
    public static final boolean[][] BLOOD_COMPATIBILITY = {
//          A+    A-    B+      B-    0+    0-    AB+    AB-
            { true, true, false, false, true, true, false, false },  // A+
            { false, true, false, false, false, true, false, false}, // A-
            { false, false, true, true, true, true, false, false},   // B+
            { false, false, false, true, false, true, false, false}, // B-
            { false, false, false, false, true, true, false, false}, // 0+
            { false, false, false, false, false, true, false, false},// 0-
            { true, true, true, true, true, true, true, true},       // AB+
            { false, true, false, true, false, true, false, true}    // AB-

    };


    static BloodType eval(String toEval) {
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
