package oop.collections;

import java.util.*;

public class Listing {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        numbers.add(15);
        System.out.println(numbers.toString());

        System.out.println("Size: " + numbers.size());

        numbers.remove(15);
        System.out.println(numbers.toString());
        System.out.println("Size: " + numbers.size());

        ArrayList<Integer> removeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            removeList.add(i+10);
        }
        System.out.println(removeList.toString());

        numbers.removeAll(removeList);
        System.out.println(numbers);

        numbers.addAll(10, removeList);
        System.out.println(numbers);

//        numbers.contains(15);//moc nepouzivat

        numbers.indexOf(15);

        numbers.lastIndexOf(15);

        numbers.clear();
        System.out.println(numbers.toString());
        System.out.println("Size: " + numbers.size());

        //showcase - unique randoms
        HashSet<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 100){
            numberSet.add((int)(Math.random() * 150 + 1));
        }
        System.out.println(numberSet);
        ArrayList<Integer> usableNumbers = new ArrayList<>();
        usableNumbers.addAll(numberSet);

        List<Integer> myOwnList = new List<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return null;
            }

            @Override
            public Integer set(int index, Integer element) {
                return null;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
}
