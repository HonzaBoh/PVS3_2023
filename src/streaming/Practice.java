package streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Alexander", "Bob", "Charlie", "Dave");
        names.forEach(name -> System.out.println(name));

        List<String> aNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        aNames.forEach(name -> System.out.println(name));

        List<String> NAMES = names.stream()
                .map(String::toUpperCase)
                .toList();
//        List<String> nonFilter = new ArrayList<>();
//        for (String name : names){
//            nonFilter.add(name.toUpperCase());
//        }
        NAMES.forEach(name -> System.out.println(name));

        String allNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(allNames);
    }

}
