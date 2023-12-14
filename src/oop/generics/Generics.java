package oop.generics;

import java.util.ArrayList;
import java.util.Comparator;

public class Generics {


    static <E> void printArray(E[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

//    static <T> T multiplication(T n, T e){
//        return n*e;
//    }
    
    static <T extends Comparable<T> > T max(T x, T y, T z){
        T tmp = x;
        if (tmp.compareTo(y) < 0){
            tmp = y;
        }
        if (tmp.compareTo(z) < 0){
            tmp = z;
        }
        return tmp;
    }

    public static void main(String[] args) {
//        ArrayList<int[]> data = new ArrayList();
        Integer[] nums = {24, 42, 51, 65, 123};
        Double[] decimals = {4.2, .5, -4.21, -.1, -1.0};
        String[] words = {"ahoj", "jan", "batman", "tok"};
        printArray(nums);
        System.out.println("---");
        printArray(decimals);
        System.out.println("---");
        printArray(words);
    }

}
