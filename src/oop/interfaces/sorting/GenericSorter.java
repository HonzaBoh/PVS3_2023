package oop.interfaces.sorting;

import java.util.Arrays;

public class GenericSorter {

    public static <E extends Comparable<E>> void sort(E[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                    //array[j] > array[j+1]
                if (array[j].compareTo(array[j+1]) > 0){
                    E tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {5,6,32,15,4,1,89};
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("........");
        Double[] decimals = {5.4,6.0,32.9,.15,1.4,1.9999999,89.0};
        System.out.println(Arrays.toString(decimals));
        sort(decimals);
        System.out.println(Arrays.toString(decimals));
        System.out.println("........");

        String[] words = {"Pepa", "Karel", "Mrkev", "Konstruktor", "Inicializace"};
        System.out.println(Arrays.toString(words));
        sort(words);
        System.out.println(Arrays.toString(words));
    }

}
