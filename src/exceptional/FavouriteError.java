package exceptional;

import java.util.ArrayList;
import java.util.List;

public class FavouriteError extends Thread {
//    static ArrayList<ArrayList<String>> strings= new ArrayList<>();

    @Override
    public void run() {
//        infinity();
        crash();
    }

    static void infinity() {
        System.out.println("Infinity");
        infinity();
    }

    static int countSaharaSandSpecks(int a) {
        if (a == Integer.MAX_VALUE)
            return 42;
        System.out.println("Speck#" + a);
        a++;
        return countSaharaSandSpecks(a);
    }

    static void crash() {
        List<Integer> l = new ArrayList();
        while (true) {
            l.add(1);
        }
    }

    public static void main(String[] args) {
//        infinity();
//        try {
//            countSaharaSandSpecks(1);
//        }catch (StackOverflowError error){
//            System.out.println("Stack overflown");
//        }
//        System.out.println("Happy ending!");
        FavouriteError[] threads = {new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(), new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError(),
                new FavouriteError()};

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        System.out.println(":)");
    }
}
