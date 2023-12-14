package oop.collections;

import java.util.Arrays;

public class ArrayQueue implements IQueue{
    String[] data;
    int first;
    int count;

    ArrayQueue(int initialCapacity){
        data = new String[initialCapacity];
        first = 0;
        count = 0;
    }


    @Override
    public String pop() {
        String toReturn = data[first];
        if (count > 0){
            first = (first + 1) % data.length;
            count--;
            return toReturn;
        }
        return null;
    }

    @Override
    public String peek() {
        if (count > 0){
            return data[first];
        }
        return null;
    }

    @Override
    public void push(String input) {
        if (count == data.length){
            expandArray();
        }
        data[(first+count) % data.length] = input;
        count++;
    }

    void expandArray(){
        String[] newData = new String[data.length*2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[(first+i)% data.length];
        }
        data = newData;
        first = 0;
    }
}
