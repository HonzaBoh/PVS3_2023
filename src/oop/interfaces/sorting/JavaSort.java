package oop.interfaces.sorting;

import java.util.Arrays;

public class JavaSort implements SortingAlgorithm{

    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
