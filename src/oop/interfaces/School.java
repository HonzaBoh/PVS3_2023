package oop.interfaces;

import java.util.*;

public class School {

    static void printList(ArrayList<Gun> guns){
        for(Gun gun : guns){
            System.out.println(gun);
        }
    }

    public static void main(String[] args) {
        ArrayList<Gun> shoppingList = new ArrayList<>();
        shoppingList.add(new Gun(6, "Revolver", .64));
        shoppingList.add(new Gun(7, "Walther", .44));
        shoppingList.add(new Gun(12, "Glock", .09));
        shoppingList.add(new Gun(1, "Crossbow", .9));
        printList(shoppingList);
        Collections.sort(shoppingList);
        System.out.println("---Post sort---");
        printList(shoppingList);
        Collections.sort(shoppingList, Gun.BY_NAME);
        System.out.println("---Post sort---");
        printList(shoppingList);
        Collections.sort(shoppingList, Gun.BY_AMMO.reversed());
        System.out.println("---Post sort---");
        printList(shoppingList);
    }
}
