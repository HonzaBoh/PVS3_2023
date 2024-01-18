package oop.collections;

import java.util.*;

public class Listing {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        numbers.add(15);
        System.out.println(numbers.toString());

        System.out.println("Size: " + numbers.size());

        numbers.remove(15);
        System.out.println(numbers.toString());
        System.out.println("Size: " + numbers.size());

        ArrayList<Integer> removeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            removeList.add(i+10);
        }
        System.out.println(removeList.toString());

        numbers.removeAll(removeList);
        System.out.println(numbers);

        numbers.addAll(10, removeList);
        System.out.println(numbers);

//        numbers.contains(15);//moc nepouzivat

        numbers.indexOf(15);

        numbers.lastIndexOf(15);

        numbers.clear();
        System.out.println(numbers.toString());
        System.out.println("Size: " + numbers.size());

        //showcase - unique randoms
        HashSet<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 100){
            numberSet.add((int)(Math.random() * 150 + 1));
        }
        System.out.println(numberSet);
        ArrayList<Integer> usableNumbers = new ArrayList<>();
        usableNumbers.addAll(numberSet);
        System.out.println("Randomize:");
        Collections.shuffle(usableNumbers);
        System.out.println(usableNumbers);

    }
}
