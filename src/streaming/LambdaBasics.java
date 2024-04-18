package streaming;

import java.io.File;
import java.util.Comparator;

public class LambdaBasics{

    public static void main(String[] args) {
        //ne-lambda
        Functions f = new Functions() {
            @Override
            public double quadratic(double n) {
                return n*n;
            }
        };

        Functions quadratics = n -> n*n;
        quadratics.quadratic(5);

        Operations add = (a, b) -> a + b;
        System.out.println(add.operation(5,10));
        Operations difference = (a, b) -> a - b;
        System.out.println(difference.operation(5,10));
        Operations multiplication = (a, b) -> a * b;
        System.out.println(multiplication.operation(5,10));
        Operations division = (a, b) -> a / b;
        System.out.println(division.operation(5,10));


        Texting texting = (word) -> System.out.println("Hello " + word);
        texting.hello("world");
        texting.hello("goodbye");

        Zero z = () -> System.out.println("Tohle nema nic");
        z.print();

        Comparator<File> fileSize = (o1, o2) -> (int) (o1.length() - o2.length());
        Comparator<File> fileSize2 = Comparator.comparingLong(File::length);
    }

}
interface Functions{
    double quadratic(double n);
}
interface Operations{
    double operation(double a, double b);
} interface Texting{
    void hello(String message);
} interface Zero{
    void print();
}


