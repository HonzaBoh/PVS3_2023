package oop.collections;

import java.util.ArrayList;

public class Storage {

    ArrayList<Item> inventory = new ArrayList<>();
    int totalPrice = 0;


    public int getTotalPrice() {
        totalPrice = 0;
        for (Item i : inventory){
            totalPrice += i.price * i.quantity;
        }
        return totalPrice;
    }

    public int getQuantity(){
        int totalQuantity = 0;
        for (Item i : inventory){
            totalQuantity += i.quantity;
        }
        return totalQuantity;
    }

    public int categoryAmount(Category c){
        int amount = 0;
        for (Item i : inventory){
            if (i.category.equals(c)){
                System.out.println(i.name);
                amount++;
            }
        }
        return amount;
    }

    public void removeAllFrom(Category c){
        for (Item i : inventory){
            if (i.category.equals(c)){
                inventory.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.inventory.add(new Item(Category.FOOD, "bread", 80, 100));
        storage.inventory.add(new Item(Category.BEVERAGES, "Tea", 150, 5));
        storage.inventory.add(new Item(Category.BEVERAGES, "The Gin", 853, 9));
        storage.inventory.add(new Item(Category.CLOTHING, "Gloves", 333, 2));
        storage.inventory.add(new Item(Category.FUEL, "Oil", 641, 50));

    }
}

class Item {
    Category category;
    String name;
    int price;
    int quantity;

    public Item(Category category, String name, int price, int quantity) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

enum Category {
    FOOD,
    BEVERAGES,
    CLOTHING,
    FUEL
}
