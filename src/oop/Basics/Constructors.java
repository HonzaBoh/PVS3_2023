package oop.Basics;

public class Constructors {


    static void Something(){
        System.out.println("whatever");
    }

    public static void SomethingElse(){
        System.out.println("whatever");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Karel";
        person.shoeSize = 42.2;
        person.age = 20;
        System.out.println("Jméno: " + person.name);
        Person another = new Person("Pepa", 31, 43.5);
        Person yetAnother = new Person();
        Person anotherAnother = yetAnother;
        Person lostCount = new Person();
        lostCount.name = another.name;
        lostCount.shoeSize  = another.shoeSize;
        lostCount.age = another.age;


//        System.out.println(yetAnother);
//        System.out.println(yetAnother.name);
//        System.out.println(yetAnother.age);
//        System.out.println(yetAnother.shoeSize);
//        System.out.println("Delka jmena: " + yetAnother.name.length());

    }
}
