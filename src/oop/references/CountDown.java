package oop.references;

public class CountDown {
    int x;

    public static void main(String[] args) {
        CountDown mc1 = new CountDown();
        CountDown mc2 = new CountDown();
        CountDown mc3 = new CountDown();
        mc1.x = 9;
        mc2.x = 8;
        mc3.x = 7;
        CountDown t = mc2;
        mc2 = mc3;
        mc3 = t;
        mc1.x += 6;
        mc2.x += 5;
        mc3.x += 4;
        mc3.x = mc1.x;
        mc1 = mc2;
        mc1.x += 3;
        mc2.x += 2;
        mc3.x += 1;
        System.out.println(mc1.x);
        System.out.println(mc2.x);
        System.out.println(mc3.x);
    }
}
