package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {


    @Override
    public int compare(Cone o1, Cone o2) {
        int compare = 0;
        if (compare > 0) {
            double sub = (o1.getCost() - o2.getCost());
        } else if (compare < 0) {
            double sub = (o2.getCost() - o1.getCost());
        } else {
            double sub = (o1.getCost() - o2.getCost());
        }
        return o1.getName().compareTo(o2.getName());
    }
}