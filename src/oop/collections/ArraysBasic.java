package oop.collections;

import java.util.Arrays;

public class ArraysBasic {
    static double average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*1000+1);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Average: " + average(arr));

        int[] weirdArray = new int[10];
        Arrays.fill(weirdArray, 42);
        System.out.println(Arrays.toString(weirdArray));
        String[] statics = {"Beta", "Gamma", "Delta", "Alfa", "Theta", "Omega"};
        Arrays.sort(statics);
        System.out.println(Arrays.toString(statics));
    }
}
