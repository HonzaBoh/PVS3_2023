package oop.collections.mapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basics {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("USA", "Washington DC");
        countries.put("Finland", "Helsinki");
        countries.put("Iceland", "Reykjavik");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");

        System.out.println(countries.getOrDefault("Germany", "Country not found"));
        System.out.println(countries.get("Germany"));

        countries.remove("France");
        System.out.println(countries);

//        countries.clear();

        System.out.println("Countries: " + countries.size());
//        countries.put("USA", "Detroit");
//        countries.replace("USA", "Detroit");

        System.out.println(countries);

        System.out.println(countries.containsKey("England"));
        System.out.println(countries.containsValue("Helsinki"));


        for (String country : countries.keySet()){
            System.out.println(country);
            System.out.println(countries.get(country));
        }

        for (Map.Entry<String, String> entry : countries.entrySet()){
            System.out.println("Country: " + entry.getKey()
                    + " Capital: " + entry.getValue());
        }

        double avgNameLength = countries.values().stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        System.out.println("Average length of name: " + avgNameLength);
    }

}
