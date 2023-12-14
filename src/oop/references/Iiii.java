package oop.references;

public class Iiii {
    public static void main(String[] args) {
        int i = 1;
        int i2 = i + i;
        int[] ii1 = {38, i, i2};
        int[] ii2 = ii1;
        ii1[0] += 4;
        ii2[1] += 5;
        ii1[1] = 6;
        for (i = 0; i < ii2.length; i++)
            System.out.println(ii2[i]);
    }
}
