package oop.interfaces;

import java.util.Comparator;

public class Human implements Comparable<Human>{
    String name;
    int age;
    double shoeSize;

    final static Comparator<Human> BY_SHOE_SIZE = new Comparator<Human>() {
        @Override
        public int compare(Human o1, Human o2) {
            return Double.compare(o1.shoeSize, o2.shoeSize);
        }
    };

    final static Comparator<Human> BY_AGE = new Comparator<Human>() {
        @Override
        public int compare(Human o1, Human o2) {
            return Integer.compare(o1.age, o2.age);
        }
    };

    final static Comparator<Human> BY_NAME = new Comparator<Human>() {
        @Override
        public int compare(Human o1, Human o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public Human(String name, int age, double shoeSize) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
    }

    @Override
    public int compareTo(Human o) {
        return Double.compare(this.shoeSize, o.shoeSize);
    }
}
