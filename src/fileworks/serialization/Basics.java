package fileworks.serialization;

import java.io.*;

public class Basics {

    public static void main(String[] args) {

        try {
            //serializace
            FileOutputStream fos = new FileOutputStream("rectangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            Rectangle rectangle = new Rectangle(4, Integer.MAX_VALUE);
            System.out.println(rectangle);
            out.writeObject(rectangle);
            out.close();
            fos.close();
            System.out.println("Serialized");

            //de-serializace
            FileInputStream fis = new FileInputStream("rectangle.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
            Rectangle read = (Rectangle) in.readObject();
            System.out.println(read);
            System.out.println("Deserialized");
            System.out.println(read.equals(rectangle));
            in.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

} class Rectangle implements Serializable {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "W = " + width + ", H = " + height;
    }
}
