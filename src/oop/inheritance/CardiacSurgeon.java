package oop.inheritance;

public class CardiacSurgeon extends Surgeon{
    public CardiacSurgeon(String name) {
        super(name);
        salary += 35000;
    }

    void cardiacSurgery(){
        salary += 15000;
        System.out.println("Cut through the heart and I'm to blame...");
    }
}
