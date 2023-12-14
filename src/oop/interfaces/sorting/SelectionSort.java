package oop.interfaces.sorting;

public class SelectionSort implements SortingAlgorithm{
    @Override
    public void sort(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }
}
