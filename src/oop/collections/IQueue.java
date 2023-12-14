package oop.collections;

public interface IQueue {
    /**
     * Vyhodi prvek z fronty.
     * @return prvni prvek ve fronte
     */
    String pop();

    /**
     * Ukaze prvni prvek z fronty
     * @return prvni prvek ve fronte
     */
    String peek();

    /**
     * Vlozi prvek do fronty.
     * Vlozi na zacatek fronty.
     */
    void push(String input);
}
