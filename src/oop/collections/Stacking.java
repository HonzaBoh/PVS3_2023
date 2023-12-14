package oop.collections;

import oop.Basics.Song;

import java.util.ArrayList;
import java.util.Stack;

public class Stacking {
    public static void main(String[] args) {
        StackArray<String> sa = new StackArray<>(5);
        sa.push("!");
        sa.push(" world");
        sa.push("Hello");
        System.out.print(sa.pop());
        System.out.print(sa.pop());
        System.out.print(sa.peek());
    }
}
