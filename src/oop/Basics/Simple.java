package oop.Basics;

import fileworks.DataExport;

import java.util.Arrays;

public class Simple {
    public static void main(String[] args) {

        DataExport de = new DataExport("output.txt");
        int[] nums;
        for (int i = 0; i < 100000; i++) {
            nums = new int[ (int)(Math.random()*100+10)  ];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = (int)(Math.random()*100+10);
            }
            de.writeLine(Arrays.toString(nums));
        }
        de.finishExport();

    }
}
