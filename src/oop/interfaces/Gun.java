package oop.interfaces;

import java.util.Comparator;

public class Gun implements Comparable<Gun> {
    int ammoCapacity;
    String name;
    double caliber;

    final static Comparator<Gun> BY_NAME = Comparator.comparing(o -> o.name);

    final static Comparator<Gun> BY_CALIBER = new Comparator<Gun>() {
        @Override
        public int compare(Gun o1, Gun o2) {
            return Double.compare(o1.caliber, o2.caliber);
        }
    };

    final static Comparator<Gun> BY_AMMO = new Comparator<Gun>() {
        @Override
        public int compare(Gun o1, Gun o2) {
            return o1.ammoCapacity - o2.ammoCapacity;
        }
    };

    public Gun(int ammoCapacity, String name, double caliber) {
        this.ammoCapacity = ammoCapacity;
        this.name = name;
        this.caliber = caliber;

    }

    @Override
    public String toString() {
        return name + ", " + caliber + " of " + ammoCapacity;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Gun o) {
        return BY_AMMO.compare(this, o);
    }


}
