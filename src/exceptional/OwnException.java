package exceptional;

public class OwnException {
    static int factorial(int n){
        if (n < 0){
            throw new FactorialException();
        }
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    static void neco() throws Exception{
        throw new Exception("neco by melo byt i tady...");
    }

    public static void main(String[] args) {
        System.out.println(factorial(-5));
        System.out.println(factorial(6));
    }
}
