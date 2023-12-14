package oop.inheritance;

public class Doctor {
    public String name;
    int salary;

    public Doctor(String name) {
        this.name = name;
        salary = 45000;
    }

    void diagnose(){
        salary += 1000;
        System.out.println("Telling what's wrong you...");
    }

    public int getSalary() {
        return salary;
    }
}
