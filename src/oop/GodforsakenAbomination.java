package oop;

public class GodforsakenAbomination {
    
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 1100; i++) {
            System.out.println("Counted i");
            inner:
            for (int j = 0; j < 1000000; j++) {
                if (j == 100){
                    break outer;
                }
            }
        }
        System.out.println("Line added");
    }
}
