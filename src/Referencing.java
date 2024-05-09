import java.util.Arrays;

public class Referencing {

    static void addFive(int a) {
        System.out.println(a);
        a += 5;
        System.out.println(a);
    }

    static void enhanceArray(int[] arr) {
        arr[2] += 5;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int a = 5;
        addFive(a);
        System.out.println(a);
        MyClass mc = new MyClass();
        mc.x = 5;
        a++;
        mc.x += a;
        a++;

        vnejsi:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 200; j++) {
                if(i == 42){
                    break vnejsi;
                }
            }
        }
    }
}

class MyClass {
    int x;
}
