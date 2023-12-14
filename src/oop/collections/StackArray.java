package oop.collections;


import oop.Basics.Song;

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
            System.out.println("Cannot pop! :(");
            return null;
        }
        freeIndex--;
        return data[freeIndex];
    }

    //sebrani vrcholu - bez odebrani
    T peek(){
        if (freeIndex < 1){
            System.out.println("Cannot pop! :(");
            return null;
        }
        return data[freeIndex-1];
    }
}
