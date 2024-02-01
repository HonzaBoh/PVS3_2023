package oop.collections;


import oop.Basics.Song;

import java.util.EmptyStackException;

public class StackArray <T> {
    private  T[] data;
    private int freeIndex;
    StackArray(int initialCapacity){
        data = (T[]) new Object[initialCapacity];
        freeIndex = 0;
    }

    void expandArray() {
        T[] newArray = (T[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newArray, 0, data.length);

        data = newArray;
    }

    //pridani prvku
    void push(T value){
        if (freeIndex >= data.length){
            expandArray();
        }
        data[freeIndex] = value;
        freeIndex++;
    }

    //odebrani prvku
    T pop(){
        if (freeIndex < 1){
            throw new EmptyStackException();
        }
        freeIndex--;
        return data[freeIndex];
    }

    //sebrani vrcholu - bez odebrani
    T peek(){
        if (freeIndex < 1){
            throw new EmptyStackException();
        }
        return data[freeIndex-1];
    }
}
