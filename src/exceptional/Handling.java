package exceptional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Handling {

    static void printArray(int[] array) throws FileNotFoundException {
        //Odchyceno hned pri vyskytu
//        try{
//            System.out.println(array[2]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Spadlo na " + e.toString());
//        }
//        System.out.println(array[2]);
//        FileReader fr = new FileReader("neco.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        //var1 - odchyceno na nejnizsim bode
//        try{
//            int[] arr = {1,3,5,6};
//            printArray(arr);
//            int[] arr2 = {6};
//            printArray(arr2);
//        } catch (ArrayIndexOutOfBoundsException aioobe){
//            System.out.println(":(");
//        }

        int[] arr = {1,3,5,6};
        printArray(arr);
        int[] arr2 = {6};
        printArray(arr2);
        throw new ArrayIndexOutOfBoundsException();
//        System.out.println("Happy ending");
    }
}
