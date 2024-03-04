package exceptional;

import javax.swing.*;

public class InputCheck {
    public static void main(String[] args) {
        boolean valid = true;
        String input = JOptionPane.showInputDialog("Zadej heslo (8 znaku, obsahovat *)");
        if (input.length() >= 8 && input.contains("*")){
            System.out.println("Heslo OK");
        } else {
            valid = false;
            //throw new PasswordException();
        }

        if (valid){
            System.out.println("'*' je na indexu " + input.indexOf('*'));
            //nahrad *
            String sifrovane = input.replace('*', '-');
            System.out.println(sifrovane);
        }

    }
}
class PasswordException extends RuntimeException{
    public PasswordException() {
        super("Heslo nesplnuje pozadavky!");
    }
}
class AnotherPasswordException extends Throwable{
    public AnotherPasswordException(){
        super("Heslo nesplnuje pozadavky");
    }
}
