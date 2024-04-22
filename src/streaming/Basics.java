package streaming;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basics {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Phone", 550.50));
        products.add(new Product(2, "Gun", 845.15));
        products.add(new Product(3, "Poison", 90.99));
        products.add(new Product(4, "Table", 6000.1));
        products.add(new Product(5, "Noose", 12.50));

        List<Product> filtered = new ArrayList<>();
        for (Product product : products){
            if (product.price > 300){
                filtered.add(product);
            }
        }
        System.out.println(filtered);
        System.out.println("Stream verze:");
        //vezmi a uloz vyfiltrovane do jineho listu
        List<Product> streamed = products.stream()
                .filter(product -> product.price > 300)
                .toList();
        System.out.println(streamed);

        //foreach > vypis s filtrem mensi nez 300
        products.stream()
                .filter(product -> product.price < 300 && product.id > 1)
                .forEach(System.out::println);
        int n = (int)(Math.random() * 10);
        switch (n) {
            case 0 -> System.out.println("bad luck:(");
            case 6 -> System.out.println("Good luck :)");
            default -> System.out.println("nothing :/");
        }
        
        //z testu: vypis jen nazvy textovych souboru a souboru mensi 5 kb
        int[] numbers = new int[]{50,21,26};
        File[] files = new File("resources\\poetry").listFiles();
        List<File> fileList = Arrays.asList(files);
        List<File> filteredFiles =  fileList.stream()
                .filter(file -> file.length() < 5000 && file.getName().endsWith(".txt"))
                .toList();
    }

}
class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + name + " $" + price;
    }
}
