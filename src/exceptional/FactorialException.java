package exceptional;

public class FactorialException extends ArithmeticException{
    FactorialException(){
        super("Cannot do negative factorial");
    }
}
