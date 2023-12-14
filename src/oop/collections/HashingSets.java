package oop.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashingSets {

    static int[] randomUniqueArray(){
        int[] arr = new int[100];
        int i = 0;
        int randomNum;
        while ( i < arr.length){
            randomNum = (int)(Math.random()*100+1);
            while (containsDuplicate(randomNum, arr)){
                randomNum = (int)(Math.random()*100+1);
            }
            arr[i] = randomNum;
            i++;
        }
        return arr;
    }

    static boolean containsDuplicate(int toCheck, int[] array){
        for(int num : array){
            if (toCheck == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = randomUniqueArray();
        int[] arr2 = randomUniqueArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 100){
            set.add((int)(Math.random()*150+1));
        }

        ArrayList<Integer>list = new ArrayList<>(set);
        for (int num : list){
            System.out.print(num + ", ");
        }

        HashSet<Integer> something = new HashSet<>(list);
    }
}
