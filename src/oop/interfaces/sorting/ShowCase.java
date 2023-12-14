package oop.interfaces.sorting;

import java.sql.Array;
import java.util.Arrays;

public class ShowCase {

    static int[] generateArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*200001-100000);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] mainArray = generateArray(100000);
//        System.out.println(Arrays.toString(mainArray));
        int[] toSort = new int[mainArray.length];

        SortingAlgorithm[] sorters = {new BubbleSort(), new SelectionSort(), new JavaSort()};

        for (int i = 0; i < sorters.length; i++) {
            System.out.println(sorters[i].getClass());
            System.arraycopy(mainArray, 0, toSort, 0, mainArray.length);
            long start = System.nanoTime();
            sorters[i].sort(toSort);
            long stop = System.nanoTime();

            double seconds = (stop-start) / 1_000_000_000.0;
            System.out.println("Time: "  + seconds + " s");
//            System.out.println(Arrays.toString(toSort));

        }

        Integer[] sortGeneric = new Integer[mainArray.length];
        for (int i = 0; i < mainArray.length; i++) {
            sortGeneric[i] = mainArray[i];
        }

        long start = System.nanoTime();
        GenericSorter.sort(sortGeneric);
        long stop = System.nanoTime();

        double seconds = (stop-start) / 1_000_000_000.0;
        System.out.println("Generic sort:");
        System.out.println("Time: "  + seconds + " s");
    }
}
