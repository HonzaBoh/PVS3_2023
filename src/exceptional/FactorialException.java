package exceptional;

public class FactorialException extends RuntimeException{
    FactorialException(){
        super("Cannot do negative factorial");
    }
}
