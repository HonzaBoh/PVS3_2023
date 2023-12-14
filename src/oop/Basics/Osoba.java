package oop.Basics;

public class Osoba {
    String name;
    int height;
    int weight;
    int age;

    public Osoba(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Jmenuju se " + name
                + ", je mi " + age + ", merim " + height + " a vazim " + weight;
    }
}
