package oop.Basics;

public class GenericQueue<T> {
    Link<T> first, last;

    public static void main(String[] args) {
        GenericQueue<Integer> integerQueue = new GenericQueue<>();
        GenericQueue<Person> personQueue = new GenericQueue<>();
    }

    T pop() {
        if (first == null)
            return null;
        T toReturn = first.data;
        first = first.next;
        return toReturn;
    }

    T peek() {
        if (first == null)
            return null;
        return first.data;
    }

    void push(T input) {
        Link<T> newLink = new Link<>();
        newLink.data = input;
        if (first == null) {
            first = newLink;
            last = newLink;
        } else {
            last.next = newLink;
            last = newLink;
        }
    }
}




class Link<T> {
    Link<T> next;
    T data;
}

