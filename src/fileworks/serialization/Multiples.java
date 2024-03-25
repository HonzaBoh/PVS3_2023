package fileworks.serialization;

import java.io.*;
import java.util.ArrayList;

public class Multiples {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("polygons.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            ArrayList<Polygon> polygons = new ArrayList<>();
            for (int i = 5; i < 21; i++) {
                polygons.add(new Polygon(i+1, 4.2*i));
            }
            System.out.println(polygons);
            out.writeObject(polygons);
            out.close();
            fileOut.close();

            FileInputStream fileIn = new FileInputStream("polygons.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Polygon> readPoly = (ArrayList<Polygon>) in.readObject();
            System.out.println(readPoly);
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e ){
            System.out.println(e.getMessage());
            System.out.println(":(");
        }
    }

}class Polygon implements Serializable {
    int sides;
    double length;

    public Polygon(int sides, double length) {
        this.sides = sides;
        this.length = length;
    }

    @Override
    public String toString() {
        return "{" +
                "sides=" + sides +
                ", length=" + length +
                '}';
    }
}