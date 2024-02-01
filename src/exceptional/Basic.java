package exceptional;

import javax.swing.*;

public class Basic {

    public static void main(String[] args) {
        String dialog = JOptionPane.showInputDialog("Zadej cislo:");
        int cislo = 10;
//        int option = JOptionPane.showConfirmDialog(null,"neco zaklikni", "titl", JOptionPane.YES_NO_OPTION);
//        JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.WARNING_MESSAGE);

        try{
            int aNumber = Integer.parseInt(dialog);
            System.out.println("Zadal jsi cislo: " + aNumber);
            System.out.println(cislo/aNumber);
        } catch (ArithmeticException e){
           // System.out.println("Neco se pokazilo :(");
            System.out.println("Takhle matika nefunguje");
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Zadal jsi cislo: <<<<- NE");
            e.printStackTrace();
        }

        int[] arr = {1};
        dialog = JOptionPane.showInputDialog("Co chces z pole:");

        int index = Integer.parseInt(dialog);

        try {

            System.out.println(arr[index]);
        } catch (Exception e){
            e.printStackTrace();
        }


        String[] somethings = {"neco", "nic", null};
        System.out.println(somethings[index].toUpperCase());

        System.out.println("Happy ending");
    }

}