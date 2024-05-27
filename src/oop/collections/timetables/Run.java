package oop.collections.timetables;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Run {

    static ArrayList<TableSubject> subjects(String filePath) {
        ArrayList<TableSubject> subjects = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            String[] params;
            for (String line : lines) {
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

    static HashMap<String, ArrayList<TableSubject>> workplaceEvents(ArrayList<TableSubject> subjects) {
        HashMap<String, ArrayList<TableSubject>> events = new HashMap<>();
        for (TableSubject subject : subjects) {
            if (events.containsKey(subject.workplace)) {
                events.get(subject.workplace).add(subject);
            } else {
                events.put(subject.workplace, new ArrayList<>());
            }
        }
        return events;
    }

    public static void main(String[] args) {
        ArrayList<TableSubject> subjects = subjects("resources//rozvrhove-akce.txt");
        System.out.println(subjects);
        System.out.println("Akci: " + subjects.size());
        HashSet<TableSubject> uniqueActions = new HashSet<>(subjects);
        System.out.println(uniqueActions.size());

        long countUniques = subjects.stream()
                .distinct()
                .count();
        System.out.println(countUniques);

        HashSet<String> workplaces = new HashSet<>();
        for (TableSubject subject : subjects) {
            workplaces.add(subject.workplace);
        }
        System.out.println(workplaces.size());

        HashMap<String, ArrayList<TableSubject>> eventMap = workplaceEvents(subjects);
        ArrayList<WorkplaceEvent> events = new ArrayList<>();
        for (String workplace : eventMap.keySet()){
//            System.out.println(workplace + ": " + eventMap.get(workplace).size());
            events.add(new WorkplaceEvent(workplace, eventMap.get(workplace).size()));
        }

        Collections.sort(events);
        for (int i = 0; i < events.size(); i++) {
            System.out.println((i+1) + ". " + events.get(i).workplace + ": " + events.get(i).eventCount);
        }
    }
}

class TableSubject {
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
} class WorkplaceEvent implements Comparable<WorkplaceEvent>{
    String workplace;
    int eventCount;

    public WorkplaceEvent(String workplace, int eventCount) {
        this.workplace = workplace;
        this.eventCount = eventCount;
    }

    @Override
    public int compareTo(WorkplaceEvent o) {
        if (this.eventCount == o.eventCount){
            return this.workplace.compareTo(o.workplace);
        }
        return Integer.compare(o.eventCount, this.eventCount);
    }
}