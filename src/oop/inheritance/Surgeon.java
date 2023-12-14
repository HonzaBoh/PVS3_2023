package oop.inheritance;

public class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name);
        salary += 15000;
    }

    void surgery(){
        salary += 5000;
        System.out.println("Cutting you open...");
    }

    @Override
    void diagnose() {
        super.diagnose();
        System.out.println("Finding out where to cut...");
        salary+=1500;
    }
}
