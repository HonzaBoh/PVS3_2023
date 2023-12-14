package oop.inheritance;

import fileworks.DataExport;
import fileworks.DataImport;

import java.util.ArrayList;

public class InheritanceHospitalAdvanced {
    public static void main(String[] args) {
        Doctor doc = null;
        DataImport di = new DataImport("hospitalDataAdvanced.txt");
        String line;
        String[] params;
        ArrayList<Doctor> doctors = new ArrayList<>();
        while (di.hasNext()){
            line = di.readLine();
            params = line.split(";");
            switch (params[1]){
                case "D":
                    doc = new Doctor(params[0]);
                    break;
                case "C":
                    doc = new CardiacSurgeon(params[0]);
                    break;
                case "S":
                    doc = new Surgeon(params[0]);
                    break;
            }
            doctors.add(doc);
            for (int i = 2; i < params.length; i++) {
                switch (params[i]){
                    case "Basic":
                        doc.diagnose();
                        break;
                    case "Surgery":
                        if (doc instanceof Surgeon){
                            ((Surgeon) doc).surgery();
                        } else{
                            System.out.println("Not authorized!");
                            doc.salary = doc.salary - 50000;
                        }
                        break;
                    case "CardiacSurgery":
                        if (doc instanceof CardiacSurgeon){
                            ((CardiacSurgeon) doc).cardiacSurgery();
                        } else {
                            System.out.println("Not authorized");
                            doc.salary -= 75000;
                        }
                        break;
                }
            }
        }
        DataExport de = new DataExport("hospitalReport.txt");
        for (Doctor tmp : doctors){
            de.writeLine(tmp.name + ": " + tmp.getSalary());
        }
        de.finishExport();
        di.finishImport();
    }
}
