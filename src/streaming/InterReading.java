package streaming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InterReading {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(4.5),
                new Rectangle(9, 8.5),
                new Rectangle(3.33, 40),
                new Circle( 6.45),
                new Rectangle(9.7, 4.45)
        );

        double totalArea = shapes.stream()
                .mapToDouble(Shape::calculateArea)
                .sum();
        System.out.println("Total area: " + totalArea);

        List<Shape> bigShapes = shapes.stream()
                .filter(shape -> shape.calculateArea() > 50)
                .toList();
        System.out.println(bigShapes.size());

        Shape largestShape = shapes.stream()
                .max((s1, s2) -> (int) (s1.calculateArea() - s2.calculateArea()))
                .orElse(null);
        //ekvivalentni
        Shape altLargest = shapes.stream()
                .max(Comparator.comparingDouble(Shape::calculateArea))
                .orElse(null);
        System.out.println("Largest shape: " + largestShape);

        //prumerny obsah:
        double averageArea = shapes.stream()
                .mapToDouble(Shape::calculateArea)
                .average()
                .orElse(0);
        System.out.println("Average area: " + averageArea);

        int amountOfSmallShapes = (int) shapes.stream()
                .filter(shape -> shape.calculateArea() < 100)
                .count();
        System.out.println("# of small shapes: " + amountOfSmallShapes);

    }
}
interface Shape{
    double calculateArea();
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle, r = " + radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle, w = " + width + ", l = " + length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }
}
