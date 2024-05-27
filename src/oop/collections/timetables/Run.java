package oop.collections.timetables;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Run {

    static ArrayList<TableSubject> subjects(String filePath){
        ArrayList<TableSubject> subjects = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            String[] params;
            for (String line : lines){
                params = line.split(";");
                subjects.add(
                        new TableSubject(params[0], params[1], params[2], params[3])
                );
            }
        } catch (IOException e) {
            System.out.println("Soubor nenalezen, nastala chyba pri cteni");
        }
        return subjects;
    }

    public static void main(String[] args) {
        ArrayList<TableSubject> subjects = subjects("resources//rozvrhove-akce.txt");
        System.out.println(subjects);
        System.out.println("Akci: " + subjects.size());
    }
}
class TableSubject{
    String workplace, subjectName, type, semester;

    public TableSubject(String workplace, String subjectName, String type, String semester) {
        this.workplace = workplace;
        this.subjectName = subjectName;
        this.type = type;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "workplace='" + workplace + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", type='" + type + '\'' +
                ", semester='" + semester + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableSubject that = (TableSubject) o;
        return this.subjectName.equals(that.subjectName) && this.workplace.equals(that.workplace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workplace, subjectName);
    }
}