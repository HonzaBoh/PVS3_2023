package oop.collections.mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyHashTable {
    Entry[] data;
    MyHashTable(int initialCapacity){
        data = new Entry[initialCapacity];

    }

    int getHashCode(String s){
        return s.hashCode() % data.length;
    }

    int get(String key){
        int index = getHashCode(key);
        Entry current = data[index];

        while (current != null){
            if (current.fileKey.equals(key)){
                return current.fileValue;
            }
            current = current.next;
        }
        return -1;
    }


    void add(String key, int value){
        int index = getHashCode(key);
        Entry toAdd = new Entry(key, value);

        toAdd.next = data[index];
        data[index] = toAdd;
    }

    public static void main(String[] args) {

    }


}
class Entry{
    public String fileKey;
    int fileValue;
    Entry next;

    public Entry(String fileName, int fileIndex) {
        this.fileKey = fileName;
        this.fileValue = fileIndex;
    }
}


