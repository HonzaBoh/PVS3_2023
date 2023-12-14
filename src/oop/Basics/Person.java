package oop.Basics;

public class Person {
    String name;
    int age;
    double shoeSize;

    public Person(){
        //bezparametricky konstruktor
    }

    public Person(String name, int age, double shoeSize) {
        //uplny parametricky konstruktor
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        shoeSize = 42.0;
    }

    public Person(String name, double shoeSize) {
        this.name = name;
        this.shoeSize = shoeSize;
    }
}
