package oop.interfaces;

import java.util.Comparator;

public class GunCaliberComparator implements Comparator<Gun> {
    @Override
    public int compare(Gun o1, Gun o2) {
        return Double.compare(o1.caliber, o2.caliber);
    }
}
