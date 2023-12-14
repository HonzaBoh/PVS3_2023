package oop.inheritance;

import fileworks.DataImport;

public class InheritanceHospital {

    public static void main(String[] args) {
        CardiacSurgeon doc;
        CardiacSurgeon lowestIncome = new CardiacSurgeon("TMP");
        lowestIncome.salary = Integer.MAX_VALUE;
        CardiacSurgeon highestIncome = new CardiacSurgeon("TMP");
        highestIncome.salary = Integer.MIN_VALUE;
        DataImport di = new DataImport("hospitalData.txt");
        String line;
        String[] params;
        while (di.hasNext()){
            line = di.readLine();
            params = line.split(";");
            doc = new CardiacSurgeon(params[0]);

            for (int i = 1; i < params.length; i++) {
                switch (params[i]){
                    case "B":
                        doc.diagnose();
                        break;
                    case "S":
                        doc.surgery();
                        break;
                    case "C":
                        doc.cardiacSurgery();
                        break;
                }
            }

            if (doc.salary < lowestIncome.salary){
                lowestIncome = doc;
            }
            if (doc.salary > highestIncome.salary){
                highestIncome = doc;
            }
        }
        System.out.println("Highest income: " + highestIncome.getSalary() + " to " + highestIncome.name);
        System.out.println("Lowest income: " + lowestIncome.getSalary() + " to " + lowestIncome.name);
        //name, procedury
        //OUTPUT: největší plat, nejmenší plat
        di.finishImport();
    }

}
