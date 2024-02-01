package oop.collections;

import java.util.EmptyStackException;

public class GenericQueue <T> {
    Link<T> first, last;
    private int queueSize = 0;

    public int getQueueSize() {
        return queueSize;
    }

    T pop(){
        if (first == null)
            throw new EmptyStackException();
        T toPop = first.data;
        first = first.next;
        queueSize--;
        return toPop;
    }

    T peek(){
        if (first == null)
            throw new EmptyStackException();
        return first.data;
    }

    void push(T input){
        Link<T> newLink = new Link<>();
        newLink.data = input;
        queueSize++;
        if (first == null){
            first = newLink;
            last = newLink;
        } else {
            last.next = newLink;
            last = newLink;
        }
    }

    static void magicPause(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(":(");
        }
    }

    public static void main(String[] args) {
        GenericQueue<Player> players = new GenericQueue<>();
        players.push(new Player("Alfons"));
        players.push(new Player("Jakub"));
        players.push(new Player("Pepa"));
        players.push(new Player("Martin"));

        while (players.queueSize > 1){
            System.out.println("Právě hraje: " + players.peek().name);
            magicPause();
            if (Math.random() <= .16){
                System.out.println("Právě dohrál: " + players.pop().name);
            } else {
                System.out.println("Přežil: " + players.peek().name);
                players.push(players.pop());
            }
            magicPause();
        }
        System.out.println("Last man standing: " + players.pop().name);
    }


}
class Link<T>{
    Link<T> next;
    T data;
}
class Player{
    String name;

    public Player(String name) {
        this.name = name;
    }
}
