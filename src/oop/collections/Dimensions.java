package oop.collections;

public class Dimensions {

    public static void main(String[] args) {
        int[][] lotOfNumbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//        System.out.println(lotOfNumbers[1].length);

        for (int i = 0; i < lotOfNumbers.length; i++) {
            for (int j = 0; j < lotOfNumbers[i].length; j++) {
                System.out.print(lotOfNumbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = lotOfNumbers.length - 1;  i >= 0; i--) {
            for (int j = lotOfNumbers[i].length - 1; j >= 0; j--) {
                System.out.print(lotOfNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}
